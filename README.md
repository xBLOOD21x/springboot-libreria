# Sistema de Gestión de Librería

## Proyecto Académico - Universidad de El Salvador 2025


---


**Angel Josue Cortez Zaldana** - CZ23002  
Asignatura: **Desarrollo de Aplicaciones Web**

## Descripción

Este sistema permite administrar una librería completa, gestionando autores, libros, clientes y ventas. Implementado como parte del examen corto #2, este proyecto demuestra la aplicación práctica de tecnologías empresariales para soluciones de gestión de negocios.

## Stack Tecnológico

- **Java 17** - Lenguaje de programación base
- **Spring Boot 3.2.x** - Framework de desarrollo
- **JPA/Hibernate** - Persistencia de datos y ORM
- **PostgreSQL** - Sistema de gestión de base de datos
- **Maven** - Gestión de dependencias

## Características Principales

- Gestión completa de catálogo de libros
- Registro y administración de autores
- Sistema de clientes
- Procesamiento de ventas con detalles
- Relaciones complejas entre entidades
- Persistencia automática en PostgreSQL

## Instrucciones de Ejecución

1. **Requisitos previos:**
   - Java 17 o superior
   - PostgreSQL instalado y en ejecución
   - Maven para gestión de dependencias

2. **Preparación de la Base de Datos:**
   ```sql
   CREATE DATABASE libreria_db;
   ```

3. **Configuración:**
   Modifica el archivo `application.properties` con tus credenciales:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/libreria_db
   spring.datasource.username=postgres
   spring.datasource.password=tu_contraseña
   
   spring.jpa.hibernate.ddl-auto=create
   spring.jpa.show-sql=true
   ```

4. **Ejecución del proyecto:**
   ```bash
   mvn spring-boot:run
   ```

5. **Verificación:**
   Una vez iniciada la aplicación, verifica en PostgreSQL que todas las tablas se hayan creado correctamente.

##  Competencias Demostradas

- Modelado de datos con JPA
- Implementación de relaciones complejas (ManyToMany, OneToMany)
- Configuración de persistencia con Hibernate
- Integración con PostgreSQL
- Desarrollo de aplicaciones empresariales con Spring Boot

---


_Universidad de El Salvador - Facultad de Ingeniería y Arquitectura - 2025_


