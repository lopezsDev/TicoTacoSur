package com.TicoTaco.TicoTaco.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    @Column(name = "C_PRODUCTO")
    private int producto;

    @Column(name = "C_SUCURSAL")
    private int sucursal;
}

