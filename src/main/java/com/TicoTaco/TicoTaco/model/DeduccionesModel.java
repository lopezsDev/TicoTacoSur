package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DEDUCCIONES")
public class DeduccionesModel {

    @Id
    @Column(name = "C_DEDUCCION")
    private Long deduccionId;

    @Column(name = "D_NOMBRE_DEDUCCION")
    private String nombreDeduccion;

    @Column(name = "M_CANTIDAD_DEDUCCION")
    private double cantidadDeduccion;

    @Column(name = "F_PERIODO_APLICACION")
    private java.util.Date periodoAplicacion;

    @Column(name = "D_ESTADO_DEDUCCION")
    private String estadoDeduccion;
}

