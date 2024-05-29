package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DETALLE_PEDIDO_PROVEEDOR")
public class DetallePedidoProveedorModel {

    @Id
    @Column(name = "C_DETALLE_PEDIDO_PROVEEDOR")
    private Long detallePedidoProveedorId;

    @Column(name = "Q_CANTIDAD")
    private int cantidad;

    @Column(name = "M_PRECIO_UNITARIO")
    private double precioUnitario;

    @Column(name = "C_BODEGA")
    private int bodega;
}

