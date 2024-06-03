package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ADMIN_RESTAURANTE")
public class AdminRestauranteModel {

    @Id
    @Column(name = "C_ADMIN")
    private Long adminId;

    @Column(name = "M_GANANCIAS")
    private double ganancias;

    @Column(name = "M_PERDIDAS")
    private double perdidas;

    @ManyToOne
    @MapsId("ADMIN_RESTAURANTE")
    @JoinColumn(name = "C_PLANILLA", nullable = false)
    private PlanillaModel planillaId;

    @ManyToOne
    @JoinColumn(name = "C_SUCURSAL", nullable = false)
    private SucursalModel sucursal;

    @ManyToOne
    @JoinColumn(name = "C_PLANILLA", nullable = false)
    private PlanillaModel planilla;

    @ManyToOne
    @JoinColumn(name = "C_COSTOS_OPERATIVOS", nullable = false)
    private CostosOperativosModel costosOperativos;

}
