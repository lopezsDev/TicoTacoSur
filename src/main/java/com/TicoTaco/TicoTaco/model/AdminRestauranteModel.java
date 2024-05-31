package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ADMIN_RESTAURANTE")
public class AdminRestauranteModel {

    @Id
    @Column(name = "C_ADMIN")
    private int adminId;

    @Column(name = "M_GANANCIAS")
    private double ganancias;

    @Column(name = "M_PERDIDAS")
    private double perdidas;

    @Column(name = "C_SUCURSAL")
    private int sucursal;

    @Column(name = "C_COSTOS_OPERATIVOS")
    private int costosOperativos;
}
