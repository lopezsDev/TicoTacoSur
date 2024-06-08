package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "PUESTO")
public class PuestoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_PUESTO")
    private Long puestoId;

    @Column(name = "D_NOMBRE_PUESTO")
    private String nombrePuesto;

    @Column(name = "M_SALARIO_BASE")
    private double salarioBase;

    @OneToMany(mappedBy = "puestoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlanillaModel> planillas = new HashSet<>();

    @OneToMany(mappedBy = "puestoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EmpleadoModel> empleado = new HashSet<>();
}

