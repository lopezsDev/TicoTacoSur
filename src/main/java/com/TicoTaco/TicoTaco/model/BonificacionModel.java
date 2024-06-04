package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

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

    @OneToMany(mappedBy = "bonificacionId")
    private Set<PlanillaModel> planillaId;
}

