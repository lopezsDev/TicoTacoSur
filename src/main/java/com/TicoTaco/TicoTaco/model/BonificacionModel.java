package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "BONIFICACION")
public class BonificacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_BONIFICACION")
    private Long bonificacionId;

    @Column(name = "D_NOMBRE_BONIFICACION")
    private String nombreBonificacion;

    @Column(name = "M_BONIFICACION")
    private String montoBonificacion;

    @OneToMany(mappedBy = "bonificacionId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlanillaModel> planillas = new HashSet<>();
}


