package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "DETALLE_PEDIDO_PROVEEDOR")
public class DetallePedidoProveedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_DETALLE_PEDIDO_PROVEEDOR")
    private Long detallePedidoProveedorId;

    @Column(name = "Q_CANTIDAD")
    private int cantidad;

    @Column(name = "M_PRECIO_UNITARIO")
    private double precioUnitario;

    @OneToMany(mappedBy = "detallePedidoProveedorId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DetallePedidoProveedorBodegaModel> bodegas = new HashSet<>();
}


