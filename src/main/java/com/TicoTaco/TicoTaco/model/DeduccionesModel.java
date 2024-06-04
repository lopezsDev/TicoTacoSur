package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.nio.MappedByteBuffer;
import java.util.Set;

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

    @OneToMany(mappedBy = "deduccionId" )
    private Set <PlanillaModel> planillaId;
}

