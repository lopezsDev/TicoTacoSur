package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "DETALLES_FACTURA")
public class DetallesFacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_DETALLE_FACTURA")
    private Long detalleFacturaId;

    @Column(name = "Q_CANTIDAD")
    private int cantidad;

    @Column(name = "M_PRECIO_LINEA")
    private double precioLinea;

    @Column(name = "D_OBSERVACIONES")
    private String observaciones;

    @OneToMany(mappedBy = "detalleFacturaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DetalleFacturaProductoModel> productos = new HashSet<>();
}


