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
    private long monedaId;

    @Column(name = "T_DIVISA")
    private double moneda;

    @OneToMany(mappedBy = "monedaId")
    private Set<MenuModel> menus;

    @OneToMany(mappedBy = "monedaId")
    private Set<CostosOperativosModel> costosOperativosId;

    @OneToMany(mappedBy = "monedaId")
    private Set<FacturaModel> facturaModels;
}

