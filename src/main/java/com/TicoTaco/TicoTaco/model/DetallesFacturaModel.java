package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DETALLES_FACTURA")
public class DetallesFacturaModel {

    @Id
    @Column(name = "C_DETALLE_FACTURA")
    private long detalleFacturaId;

    @Column(name = "Q_CANTIDAD")
    private int cantidad;

    @Column(name = "M_PRECIO_LINEA")
    private double precioLinea;

    @Column(name = "D_OBSERVACIONES")
    private String observaciones;

}

