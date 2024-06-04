package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "COMBO")
public class ComboModel {

    @Id
    @Column(name = "C_COMBO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long comboId;

    @Column(name = "D_NOMBRE_COMBO")
    private String nombreCombo;

    @Column(name = "D_DESCRIPCION")
    private String descripcion;

    @Column(name = "M_PRECIO")
    private double precio;

}

