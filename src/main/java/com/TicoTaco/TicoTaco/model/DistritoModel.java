package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "DISTRITO")
public class DistritoModel {

    @Id
    @Column(name = "C_DISTRITO")
    private Long distritoId;

    @Column(name = "D_DISTRITO")
    private String distritoNombre;

    @Column(name = "C_CANTON")
    private int cantonId;

    @OneToMany(mappedBy = "distritoId")
    private Set<DireccionModel> direccion;

}
