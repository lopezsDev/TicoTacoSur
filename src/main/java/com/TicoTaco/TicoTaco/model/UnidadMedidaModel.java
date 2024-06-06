package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "UNIDAD_MEDIDA")
public class UnidadMedidaModel {

    @Id
    @Column(name = "C_MEDIDA")
    private int medida;

    @Column(name = "D_ABREVIATURA")
    private String abreviatura;
}
