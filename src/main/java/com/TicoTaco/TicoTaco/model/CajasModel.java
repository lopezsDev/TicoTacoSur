package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "CAJAS")
public class CajasModel {

    @Id
    @Column(name = "C_CAJAS")
    private int cajasId;

    @Column(name = "F_APERTURA")
    private LocalDateTime fechaHoraApertura;

    @Column(name = "F_CIERRE")
    private LocalDateTime fechaHoraCierre;

    @Column(name = "M_INICIAL")
    private double montoInicial;

    @Column(name = "M_FINAL")
    private double montoFinal;

    @Column(name = "C_FORMA_PAGO")
    private int formaPagoId;

    @Column(name = "C_FACTURA")
    private int facturaId;

    @OneToOne
    @JoinColumn(name = "C_FACTURA", referencedColumnName = "C_FACTURA", insertable = false, updatable = false)
    private FacturaModel factura;

}