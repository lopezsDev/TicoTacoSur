package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "COMBO")
public class ComboModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_COMBO")
    private Long comboId;

    @Column(name = "D_NOMBRE_COMBO")
    private String nombreCombo;

    @Column(name = "D_DESCRIPCION")
    private String descripcion;

    @Column(name = "M_PRECIO")
    private double precio;

    @OneToMany(mappedBy = "comboId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ComboProductoModel> combos = new HashSet<>();
}

