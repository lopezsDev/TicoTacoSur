package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "COMBO")
public class ComboModel {

    @Id
    @Column(name = "C_COMBO")
    private Long comboId;

    @Column(name = "D_NOMBRE_COMBO")
    private String nombreCombo;

    @Column(name = "D_DESCRIPCION")
    private String descripcion;

    @Column(name = "M_PRECIO")
    private double precio;
}
