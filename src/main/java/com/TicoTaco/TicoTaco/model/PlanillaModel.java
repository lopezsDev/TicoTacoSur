package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "PLANILLA")
public class PlanillaModel {

    @Id
    @Column(name = "C_PLANILLA")
    private long planillaId;

    @Column(name = "C_HORAS_EXTRAS")
    private int horasextras;

    @Column(name = "M_SALARIO_TOTAL")
    private int salariototal;

    @Column(name = "M_SALARIO_BASE")
    private int salariobase;

    @Column(name = "F_FECHA_PAGO")
    private Date fechapago;


    @JoinColumn(name = "C_DEDUCCION", nullable = false)
    private DeduccionesModel deduccionId;

    @OneToMany
    @JoinColumn(name = "C_BONIFICACION", nullable = false)
    private Set<BonificacionModel> bonificacionId;

    @OneToMany(mappedBy = "planillaId")
    private List<AdminRestauranteModel> adminRestaurantes;

    @OneToMany(mappedBy = "planillaId")
    private Set<PlanillaModel> planillaEmpleadoId;
}
