package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "MONEDA")
public class MonedaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_MONEDA")
    private Long monedaId;

    @Column(name = "T_DIVISA")
    private String moneda;

    @OneToMany(mappedBy = "monedaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MenuModel> menus = new HashSet<>();

    @OneToMany(mappedBy = "monedaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CostosOperativosModel> CostoOperativo = new HashSet<>();

    @OneToMany(mappedBy = "monedaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FacturaModel> facturas = new HashSet<>();
}
