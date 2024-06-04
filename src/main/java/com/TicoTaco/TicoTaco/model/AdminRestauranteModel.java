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
    private long adminId;

    @Column(name = "M_GANANCIAS")
    private BigDecimal ganancias;

    @Column(name = "M_PERDIDAS")
    private BigDecimal perdidas;

    @Column(name = "C_SUCURSAL")
    private int sucursalId;

    @Column(name = "C_PLANILLA")
    private int planillaId;

    @Column(name = "C_COSTOS_OPERATIVOS")
    private int costosOperativosId;
}
