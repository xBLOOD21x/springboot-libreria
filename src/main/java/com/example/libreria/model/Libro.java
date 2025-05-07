package com.example.libreria.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Entidad que representa una obra literaria disponible en el catálogo
 */
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;
    
    private String nombreObra;
    private String codigoISBN;
    private Double valorVenta;
    private Integer unidadesDisponibles;
    private String editorial;
    private Integer anioPublicacion;
    
    /**
     * Relación muchos a muchos con la entidad Autor
     * Un libro puede ser escrito por varios autores
     */
    @ManyToMany
    @JoinTable(
        name = "libro_autor",
        joinColumns = @JoinColumn(name = "libro_id"),
        inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    private Set<Autor> escritores = new HashSet<>();
    
    /**
     * Relación con la entidad DetalleVenta
     * Un libro puede aparecer en múltiples transacciones
     */
    @OneToMany(mappedBy = "producto")
    private Set<DetalleVenta> historialVentas = new HashSet<>();
    
    // Getters y Setters (¡Generarlos en tu IDE!)
}