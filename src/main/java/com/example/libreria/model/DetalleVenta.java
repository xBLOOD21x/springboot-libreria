package com.example.libreria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Entidad que representa los elementos individuales de una transacción
 */
@Entity
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    
    private Integer unidades;
    private Double precioLinea;
    private Double descuentoAplicado;
    
    /**
     * Relación con la entidad Libro
     * Cada detalle está asociado a un producto específico
     */
    @ManyToOne
    @JoinColumn(name = "libro_id")
    private Libro producto;
    
    /**
     * Relación con la entidad Venta
     * Cada detalle pertenece a una factura concreta
     */
    @ManyToOne
    @JoinColumn(name = "venta_id")
    private Venta factura;
    
    // Getters y Setters serían implementados aquí
}