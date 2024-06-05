package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
<<<<<<< HEAD
import java.util.Set;
=======
>>>>>>> 935a2804cda2b51ceea88720541401c14b0ead65

@Data
@Entity
@Table(name = "CAJAS")
public class CajasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_CAJAS")
    private long cajasId;

    @Column(name = "F_APERTURA")
<<<<<<< HEAD
    private LocalDateTime apertura;

    @Column(name = "F_CIERRE")
    private LocalDateTime cierre;

    @Column(name = "M_INICIAL")
    private BigDecimal inicial;

    @Column(name = "M_FINAL")
    private BigDecimal finalMonto;
=======
    private LocalDateTime fechaHoraApertura;

    @Column(name = "F_CIERRE")
    private LocalDateTime fechaHoraCierre;

    @Column(name = "M_INICIAL")
    private double montoInicial;

    @Column(name = "M_FINAL")
    private double montoFinal;

    @Column(name = "C_FORMA_PAGO")
    private int formaPagoId;
>>>>>>> 935a2804cda2b51ceea88720541401c14b0ead65

    @Column(name = "C_FACTURA")
    private int facturaId;

<<<<<<< HEAD
    @Column(name = "C_FORMA_PAGO")
    private int formaPagoId;


}
=======
    @OneToOne
    @JoinColumn(name = "C_FACTURA", referencedColumnName = "C_FACTURA", insertable = false, updatable = false)
    private FacturaModel factura;

}
>>>>>>> 935a2804cda2b51ceea88720541401c14b0ead65
