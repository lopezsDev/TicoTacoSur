package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "BODEGA")
public class BodegaModel {

    @Id
    @Column(name = "C_BODEGA")
    private int cBodega;

    @Column(name = "Q_STOCK")
    private double qStock;

    @Column(name = "Q_MINIMA")
    private double qMinima;

    @Column(name = "F_INGRESO")
    private LocalDateTime fIngreso;

    @Column(name = "C_PRODUCTO")
    private int cProducto;

    @Column(name = "C_SUCURSAL")
    private int cSucursal;


}
