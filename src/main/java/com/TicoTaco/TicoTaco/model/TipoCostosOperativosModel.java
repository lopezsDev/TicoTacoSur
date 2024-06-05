package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TIPO_COSTOS_OPERATIVOS")
public class TipoCostosOperativosModel {

    @Id
    @Column(name = "C_TIPO_COSTOS_OPERATIVOS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tipoCostosOperativosId;

    @Column(name = "D_NOMBRE_TIPO_COSTOS_OPERATIVOS")
    private String nombreTipoCostosOperativos;

}
