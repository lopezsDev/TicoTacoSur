package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDateTime;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "CAJAS")
public class CajasModel {

    @Id
    @Column(name = "C_CAJAS")
    private int cajasId;

    @Column(name = "F_APERTURA")
    private LocalDateTime FechaHoraApertura;

    @Column(name = "F_CIERRE")
    private LocalDateTime FechaHoraCierre;

    @Column(name = "M_INICIAL")
    private double MontoInicial;

    @Column(name = "M_FINAL")
    private double finalMonto;

    @Column(name = "C_FORMA_PAGO")
    private int formaPago;
}
