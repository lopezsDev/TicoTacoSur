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

    @ManyToOne
    @JoinColumn(name = "estadoId", nullable = false)
    private EstadoPedidoModel estadoId;

    @ManyToOne
    @JoinColumn(name = "expressId", nullable = false)
    private ExpressModel expressId;

    @ManyToOne
    @JoinColumn(name = "empleadoId", nullable = false)
    private EmpleadoModel empleadoId;

    @ManyToOne
    @JoinColumn(name = "clienteId", nullable = false)
    private ClienteModel clienteId;

    @ManyToOne
    @JoinColumn(name = "menuId", nullable = false)
    private MenuModel menuId;
}

