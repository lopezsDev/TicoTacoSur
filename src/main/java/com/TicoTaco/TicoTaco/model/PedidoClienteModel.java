package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "PEDIDO_CLIENTE")
public class PedidoClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_PEDIDO_CLIENTE")
    private Long pedidoClienteId;

    @Column(name = "N_MESA_ASIGNADA")
    private Integer mesaAsignada;

    @Column(name = "F_TIEMPO_PREPARACION")
    private LocalDateTime tiempoPreparacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_ESTADO", insertable = true, updatable = true)
    private EstadoPedidoModel estadoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_EXPRESS", insertable = true, updatable = true)
    private ExpressModel expressId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_EMPLEADO", insertable = true, updatable = true)
    private EmpleadoModel empleadoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_CLIENTE", insertable = true, updatable = true)
    private ClienteModel clienteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_MENU", insertable = true, updatable = true)
    private MenuModel menuId;

    @OneToMany(mappedBy = "pedidoClienteId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FacturaModel> facturas = new HashSet<>();
}
