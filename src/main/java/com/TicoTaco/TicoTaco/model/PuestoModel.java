package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "PUESTO")
public class PuestoModel {

    @Id
    @Column(name = "C_PUESTO")
    private long puestoId;

    @Column(name = "D_NOMBRE_PUESTO")
    private String nombrePuesto;

    @OneToMany (mappedBy = "puestoId")
    private Set<PuestoModel> puestoempleadoId;




}

