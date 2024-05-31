package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "COSTOS_OPERATIVOS")
public class CostosOperativosModel {

    @Id
    @Column(name = "C_COSTOS_OPERATIVOS")
    private Long costosOperativosId;

    @Column(name = "D_NOMBRE_COSTOS_OPERATIVOS")
    private String nombreCostosOperativos;
}

