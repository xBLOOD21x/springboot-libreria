package com.example.libreria.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * Entidad que representa un comprador en el sistema de librería
 */
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;
    
    private String nombreCompleto;
    private String correoElectronico;
    private String domicilio;
    private String telefono;
    
    /**
     * Relación bidireccional con la entidad Venta
     * Un cliente puede realizar múltiples compras
     */
    @OneToMany(mappedBy = "cliente")
    private Set<Venta> compras = new HashSet<>();
    
    // Getters y Setters serían implementados aquí
}