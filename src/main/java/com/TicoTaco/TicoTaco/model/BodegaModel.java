package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "BODEGA")
public class BodegaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_BODEGA")
    private long bodegaId;

    @Column(name = "Q_STOCK")
    private BigDecimal stock;

    @Column(name = "Q_MINIMA")
    private BigDecimal minima;

    @Column(name = "F_INGRESO")
    private LocalDateTime ingreso;

    @Column(name = "C_PRODUCTO")
    private int productoId;

    @Column(name = "C_SUCURSAL")
    private int sucursalId;
}
