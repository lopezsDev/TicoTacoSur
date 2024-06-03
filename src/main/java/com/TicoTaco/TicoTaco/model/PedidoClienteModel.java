package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

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
    private Data tiempoPreparacion;

    @Column(name = "F_HORA_PEDIDO")
    private Date horaPedido;

    @Column(name = "C_ESTADO")
    private long estadoId;

    @Column(name = "C_EXPRESS")
    private long expressId;

    @Column(name = "C_CLIENTE")
    private long clienteId;

    @Column(name = "C_EMPLEADO")
    private long empleadoId;

    @Column(name = "C_MENU")
    private long menuId;

    @ManyToOne
    @JoinColumn(name = "estadoId", nullable = false)
    private EstadoPedidoModel estado;

    @ManyToOne
    @JoinColumn(name = "expressId", nullable = false)
    private ExpressModel express;

    @ManyToOne
    @JoinColumn(name = "empleadoId", nullable = false)
    private EmpleadoModel empleado;

    @ManyToOne
    @JoinColumn(name = "clienteId", nullable = false)
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "menuId", nullable = false)
    private MenuModel menu;
}

