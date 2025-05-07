package com.example.libreria.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Entidad que representa una transacción comercial en el sistema
 */
@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facturaId;
    
    private LocalDate fechaTransaccion;
    private Double importeTotal;
    private String metodoPago;
    private Boolean completada;
    
    /**
     * Relación con la entidad Cliente
     * Cada venta está asociada a un comprador específico
     */
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente comprador;
    
    /**
     * Relación con la entidad DetalleVenta
     * Una factura contiene múltiples líneas de productos
     */
    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    private Set<DetalleVenta> itemsFacturados = new HashSet<>();
    
    // Getters y Setters serían implementados aquí
}
