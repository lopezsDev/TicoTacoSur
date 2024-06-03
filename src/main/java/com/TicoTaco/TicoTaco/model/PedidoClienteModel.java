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
    private long cexpress;

    @Column(name = "C_CLIENTE")
    private long clienteId;

    @Column(name = "C_EMPLEADO")
    private long idempleado;

    @Column(name = "C_MENU")
    private long cmenu;

    @ManyToOne
    @JoinColumn(name = "estado_Id", nullable = false)
    private EstadoPedidoModel estado;

    @ManyToOne
    @JoinColumn(name = "express_Id", nullable = false)
    private ExpressModel express;

    @ManyToOne
    @JoinColumn(name = "empleado_Id", nullable = false)
    private EmpleadoModel empleado;

    @ManyToOne
    @JoinColumn(name = "cliente_Id", nullable = false)
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "menu_Id", nullable = false)
    private MenuModel menu;
}

