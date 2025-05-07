package com.example.libreria.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

/**
 * Entidad que representa un escritor en el sistema de biblioteca
 */
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long autorId;
    
    private String nombreCompleto;
    private String paisOrigen;
    private Integer anioNacimiento;
    
    /**
     * Relación bidireccional con la entidad Libro
     * Un autor puede tener múltiples obras publicadas
     */
    @ManyToMany(mappedBy = "autores")
    private Set<Libro> publicaciones = new HashSet<>();
    
    // Getters y Setters serían implementados aquí
}