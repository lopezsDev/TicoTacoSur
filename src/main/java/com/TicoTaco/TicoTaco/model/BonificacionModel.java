package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "BONIFICACION")
public class BonificacionModel {

    @Id
    @Column(name = "C_BONIFICACION")
    private int bonificacionId;

    @Column(name = "D_NOMBRE_BONIFICACION")
    private String nombreBonificacion;

    @Column(name = "M_BONIFICACION")
    private String montobonificacion;
}

