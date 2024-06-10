package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "CAJAS")
public class CajasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_CAJAS")
    private Long cajasId;

    @Column(name = "F_APERTURA", nullable = false)
    private Instant apertura;

    @Column(name = "F_CIERRE", nullable = false)
    private Instant cierre;

    @Column(name = "M_INICIAL", nullable = false)
    private BigDecimal inicial;

    @Column(name = "M_FINAL", nullable = false)
    private BigDecimal finalMonto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_FORMA_PAGO", insertable = false, updatable = false)
    private FormaPagoModel formaPagoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_FACTURA", insertable = false, updatable = false)
    private FacturaModel facturaId;

    @OneToMany(mappedBy = "cajaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SucursalModel> sucursal = new HashSet<>();

}


