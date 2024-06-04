package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "BODEGA")
public class BodegaModel {

    @Id
    @Column(name = "C_BODEGA")
    private int bodegaId;

    @Column(name = "Q_STOCK")
    private double stock;

    @Column(name = "Q_MINIMA")
    private double CantidadMinima;

    @Column(name = "F_INGRESO")
    private java.time.LocalDateTime ingreso;

    @OneToMany
    @JoinColumn(name = "C_PRODUCTO", nullable = false)
    private ProductoModel productoId;

    @ManyToOne
    @JoinColumn(name = "C_SUCURSAL", nullable = false)
    private SucursalModel sucursalId;
}

