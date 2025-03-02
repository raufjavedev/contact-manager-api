
# API REST de Gestión de Contactos  

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.3-brightgreen?logo=springboot) ![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?logo=mysql) ![Java](https://img.shields.io/badge/Java-23-orange?logo=java) ![Maven](https://img.shields.io/badge/Maven-3.9.9-C71A36?logo=apachemaven)

Esta es una API REST para la gestión de contactos. La API está implementada utilizando **Spring Boot** y **MySQL**, proporcionando operaciones CRUD para manejar contactos.

## Características

- **CRUD completo**: Permite crear, leer, actualizar y eliminar contactos.
- **Base de datos MySQL**: Utiliza MySQL para almacenar la información de los contactos.
- **Campos de contacto**:
  - `Id`: Identificador único del contacto (autogenerado).
  - `FirstName`: Nombre del contacto.
  - `LastName`: Apellido del contacto.
  - `Email`: correo electrónico del contacto.
  - `PhoneNumber`: Número de teléfono del contacto.
  - `Address`: Lugar de residencia o ubicación del contacto.
  - `CreatedAt`: Fecha de creación del contacto (generada automáticamente).
  - `UpdatedAt`: Fecha de última actualización del contacto (generada automáticamente).

## Endpoints

La API incluye los siguientes endpoints:

- `GET /contacts`: Obtener todos los contactos.
- `GET /contacts/id`: Obtener un contacto por su ID.
- `POST /contacts`: Crear un nuevo contacto.
- `PUT /contacts/id`: Actualizar un contacto existente.
- `DELETE /contacts/id`: Eliminar un contacto.

### Ejemplo de solicitud para registrar o actualizar un contacto

Para **registrar** o **actualizar** un contacto, puedes enviar una solicitud `POST` (para crear) o `PUT` (para actualizar) con el siguiente cuerpo en formato JSON:

```json
{
  "firstName": "firstName",
  "lastName": "lastName",
  "email": "example@example.com",
  "phoneNumber": "phoneNumber",
  "address": "address",
}
```

## Tecnologías

- **Spring Boot**: Framework principal para el desarrollo de la API.
- **MySQL**: Base de datos relacional utilizada para almacenar los contactos.
- **JPA/Hibernate**: Para la gestión de la persistencia de los datos.

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/raufjavedev/contact-manager-api.git
2. Configura la conexión a la base de datos en el archivo `application.properties`
   
   ```properties
   spring.datasource.url=DB_URL
   spring.datasource.username=USERNAME
   spring.datasource.password=PASSWORD
   ```

## Licencia ![License](https://img.shields.io/badge/License-MIT-informational)  

Este proyecto está bajo la licencia **MIT**. Para más detalles, consulta el archivo `LICENSE` en el repositorio.

