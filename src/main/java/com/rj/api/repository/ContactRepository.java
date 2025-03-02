package com.rj.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rj.api.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
