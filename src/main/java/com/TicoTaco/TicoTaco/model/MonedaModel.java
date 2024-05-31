package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MONEDA")
public class MonedaModel {

    @Id
    @Column(name = "C_MONEDA")
    private long monedaId;

    @Column(name = "D_NOMBRE_MONEDA")
    private String nombreMoneda;

    @Column(name = "D_SIMBOLO")
    private String simbolo;

    @Column(name = "M_TIPO_CAMBIO")
    private double tipoCambio;
}

