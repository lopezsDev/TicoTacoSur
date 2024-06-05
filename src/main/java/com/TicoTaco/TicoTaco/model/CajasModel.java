package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "CAJAS")
public class CajasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_CAJAS")
    private long cajasId;

    @Column(name = "F_APERTURA")
    private LocalDateTime apertura;

    @Column(name = "F_CIERRE")
    private LocalDateTime cierre;

    @Column(name = "M_INICIAL")
    private BigDecimal inicial;

    @Column(name = "M_FINAL")
    private BigDecimal finalMonto;

    @Column(name = "C_FORMA_PAGO")
    private int formaPagoId;

    @Column(name = "C_FACTURA")
    private int facturaId;

}

