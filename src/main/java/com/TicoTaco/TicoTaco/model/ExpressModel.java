package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "EXPRESS")
public class ExpressModel {

    @Id
    @Column(name = "C_EXPRESS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long expressId;

    @Column(name = "D_NOMBRE_ENCARGADO")
    private String nombreEncargado;

    @Column(name = "F_HORA_RETIRO")
    private LocalDateTime horaRetiro;

    @Column(name = "F_HORA_ENTREGA")
    private LocalDateTime horaEntrega;

    @Column(name = "C_EMPRESA_EXPRESS", nullable = false)
    private long empresaExpressId;

    @Column(name = "C_CONTACTO", nullable = false)
    private long contactoId;
}

