package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "HORAS_EXTRA")
public class HorasExtraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_HORAS_EXTRAS")
    private Long horasExtraId;

    @Column(name = "Q_HORAS_EXTRAS")
    private int cantidadHoras;

    @Column(name = "M_HORAS_EXTRAS")
    private double montoHorasExtra;

    @OneToMany(mappedBy = "horasExtraId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlanillaModel> planilla = new HashSet<>();
}
