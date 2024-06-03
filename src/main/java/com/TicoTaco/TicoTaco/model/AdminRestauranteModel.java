package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
    @JoinColumn(name = "C_SUCURSAL", nullable = false)
    private SucursalModel sucursalId;

    @ManyToOne
    @JoinColumn(name = "C_PLANILLA", nullable = false)
    private PlanillaModel planillaId;

    @ManyToOne
    @JoinColumn(name = "C_COSTOS_OPERATIVOS", nullable = false)
    private CostosOperativosModel costosOperativosId;

}
