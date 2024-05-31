package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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
}
