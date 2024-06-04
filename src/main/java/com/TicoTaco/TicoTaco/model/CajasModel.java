package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.Set;

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

    @OneToMany
    @JoinColumn(name = "C_FACTURA", nullable = false)
    private FacturaModel facturaId;

    @ManyToOne
    @JoinColumn(name = "C_FORMA_PAGO", nullable = false)
    private FormaPagoModel formaPagoId;

    @OneToMany(mappedBy = "cajaId")
    private Set<SucursalModel> sucursalId;

}
