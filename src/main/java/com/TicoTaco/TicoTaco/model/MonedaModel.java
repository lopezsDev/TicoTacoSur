package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "MONEDA")
public class MonedaModel {

    @Id
    @Column(name = "C_MONEDA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long monedaId;

    @Column(name = "T_DIVISA")
    private String moneda;
}

