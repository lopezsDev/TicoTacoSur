package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "ADMIN_RESTAURANTE")
public class AdminRestauranteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_ADMIN")
    private Long adminId;

    @Column(name = "M_GANANCIAS")
    private BigDecimal ganancias;

    @Column(name = "M_PERDIDAS")
    private BigDecimal perdidas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_SUCURSAL", insertable = false, updatable = false)
    private SucursalModel sucursalId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_PLANILLA", insertable = false, updatable = false)
    private PlanillaModel planillaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_COSTOS_OPERATIVOS", insertable = false, updatable = false)
    private CostosOperativosModel costosOperativosId;
}
