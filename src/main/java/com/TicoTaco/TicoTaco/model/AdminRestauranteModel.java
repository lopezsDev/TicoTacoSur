package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;


@Entity
@Table(name = "ADMIN_RESTAURANTE")
public class AdminRestauranteModel {

    @Id
    @Column(name = "C_ADMIN")
    private int cAdmin;

    @Column(name = "M_GANANCIAS")
    private int mGanancias;

    @Column(name = "M_PERDIDAS")
    private int mPerdidas;

    @Column(name = "C_SUCURSAL")
    private int cSucursal;

    @Column(name = "C_COSTOS_OPERATIVOS")
    private int cCostosOperativos;

}
