package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "PEDIDO_CLIENTE")
public class PedidoClienteModel {

    @Id
    @Column(name = "C_PEDIDO_CLIENTE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pedidoClienteId;

    @Column(name = "N_MESA_ASIGNADA")
    private int mesaAsignada;

    @Column(name = "F_TIEMPO_PREPARACION")
    private LocalDateTime tiempoPreparacion;

    @Column(name = "C_ESTADO")
    private long estadoId;

    @Column(name = "C_EXPRESS")
    private long expressId;

    @Column(name = "C_EMPLEADO")
    private long empleadoId;

    @Column(name = "C_CLIENTE")
    private long clienteId;

    @Column(name = "C_MENU")
    private long menuId;
}

