package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "DISTRITO")
public class DistritoModel {

    @Id
    @Column(name = "C_DISTRITO")
    private long distritoId;

    @Column(name = "D_DISTRITO")
    private String distritoNombre;

    @Column(name = "C_CANTON")
    private long cantonId;




}
