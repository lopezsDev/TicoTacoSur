package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DETALLE_PEDIDO_PROVEEDOR")
public class DetallePedidoProveedorModel {

    @Id
    @Column(name = "C_DETALLE_PEDIDO_PROVEEDOR")
    private long detallePedidoProveedorId;

    @Column(name = "Q_CANTIDAD")
    private int cantidad;

    @Column(name = "M_PRECIO_UNITARIO")
    private double precioUnitario;
}

