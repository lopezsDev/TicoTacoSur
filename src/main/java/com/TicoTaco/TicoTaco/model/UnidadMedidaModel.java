package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "UNIDAD_MEDIDA")
public class UnidadMedidaModel {

    @Id
    @Column(name = "C_MEDIDA")
    private long medida;

    @Column(name = "D_ABREVIATURA")
    private String abreviatura;
}
