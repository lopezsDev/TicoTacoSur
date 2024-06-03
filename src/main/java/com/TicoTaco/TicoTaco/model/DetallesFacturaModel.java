package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DETALLES_FACTURA")
public class DetallesFacturaModel {

    @Id
    @Column(name = "C_DETALLE_FACTURA")
    private Long detalleFacturaId;

    @Column(name = "Q_CANTIDAD")
    private int cantidad;

    @Column(name = "M_PRECIO_LINEA")
    private double precioLinea;

    @Column(name = "D_OBSERVACIONES")
    private String observaciones;

}

