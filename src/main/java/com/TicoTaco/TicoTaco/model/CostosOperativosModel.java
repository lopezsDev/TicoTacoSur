package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "COSTOS_OPERATIVOS")
public class CostosOperativosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_COSTOS_OPERATIVO", nullable = false)
    private Long costosOperativoId;

    @NotNull
    @Column(name = "F_DIA_PAGO", nullable = false)
    private Instant diaPago;

    @NotNull
    @Column(name = "M_COSTE", nullable = false)
    private BigDecimal coste;

    @Size(max = 255)
    @NotNull
    @Column(name = "D_DESCRIPCION", nullable = false)
    private String descripcion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_TIPO_COSTO_OPERATIVO", nullable = false)
    private TipoCostosOperativosModel tipoCosto;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_MONEDA", nullable = false)
    private MonedaModel monedaId;

    @OneToMany(mappedBy = "costosOperativosId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AdminRestauranteModel> adminRestaurantes = new HashSet<>();
}
