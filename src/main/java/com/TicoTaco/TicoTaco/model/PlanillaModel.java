package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "PLANILLA")
public class PlanillaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_PLANILLA")
    private Long planillaId;

    @Column(name = "M_SALARIO_TOTAL")
    private BigDecimal salarioTotal;

    @Column(name = "F_FECHA_PAGO")
    private LocalDateTime fechaPago;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_DEDUCCION", insertable = false, updatable = false)
    private DeduccionesModel deduccionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_BONIFICACION", insertable = false, updatable = false)
    private BonificacionModel bonificacionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_PUESTO", insertable = false, updatable = false)
    private PuestoModel puestoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_HORAS_EXTRAS", insertable = false, updatable = false)
    private HorasExtraModel horasExtraId;

    @OneToMany(mappedBy = "planillaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AdminRestauranteModel> adminRestaurantes = new HashSet<>();

    @OneToMany(mappedBy = "planillaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EmpleadoModel> empleados = new HashSet<>();

}

