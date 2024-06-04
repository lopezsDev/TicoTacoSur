package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "BONIFICACION")
public class BonificacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_BONIFICACION")
    private long bonificacionId;

    @Column(name = "D_NOMBRE_BONIFICACION")
    private String nombreBonificacion;

    @Column(name = "M_BONIFICACION")
    private String montobonificacion;

}

