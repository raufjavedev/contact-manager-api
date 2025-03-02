package com.rj.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rj.api.model.Contact;
import com.rj.api.repository.ContactRepository;

@Service
public class ContactSerive {

    @Autowired
    ContactRepository contactRepository;

    public List<Contact> getAllConatct() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactById(Long id) {
        return contactRepository.findById(id);
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Contact updateContact(Long id, Contact contact) {
        return contactRepository.findById(id).map(existingContact -> {
            existingContact.setFirstName(contact.getFirstName());
            existingContact.setLastName(contact.getLastName());
            existingContact.setEmail(contact.getEmail());
            existingContact.setPhoneNumber(contact.getPhoneNumber());
            existingContact.setAddress(contact.getAddress());
            return contactRepository.save(existingContact);
        }).orElseThrow(() -> new RuntimeException("Contact not found with id " + id));
    }

    public void deleteContact(Long id) {
        if (contactRepository.existsById(id)) {
            contactRepository.deleteById(id);
        } else {
            throw new RuntimeException("Contact not found with id " + id);
        }
    }
}
