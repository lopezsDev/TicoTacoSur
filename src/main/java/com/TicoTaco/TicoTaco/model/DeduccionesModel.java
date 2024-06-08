package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "DEDUCCIONES")
public class DeduccionesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_DEDUCCION")
    private Long deduccionId;

    @Column(name = "D_NOMBRE_DEDUCCION")
    private String nombreDeduccion;

    @Column(name = "M_CANTIDAD_DEDUCCION")
    private double cantidadDeduccion;

    @Column(name = "F_PERIODO_APLICACION")
    private LocalDateTime periodoAplicacion;

    @Column(name = "D_ESTADO_DEDUCCION")
    private String estadoDeduccion;

    @OneToMany(mappedBy = "deduccionId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PlanillaModel> planillas = new HashSet<>();
}


