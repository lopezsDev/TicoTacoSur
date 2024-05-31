package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PUESTO")
public class PuestoModel {

    @Id
    @Column(name = "C_PUESTO")
    private long puestoId;

    @Column(name = "D_NOMBRE_PUESTO")
    private String nombrePuesto;
}

