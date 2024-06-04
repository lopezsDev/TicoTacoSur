package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "UNIDAD_MEDIDA")
public class UnidadMedidaModel {

    @Id
    @Column(name = "C_MEDIDA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long medida;

    @Column(name = "D_ABREVIATURA")
    private String abreviatura;
}
