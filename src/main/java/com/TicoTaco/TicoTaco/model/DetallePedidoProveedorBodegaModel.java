package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.DetallePedidoProveedorBodegaId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DETALLE_PEDIDO_PROVEEDOR_BODEGA")
@IdClass(DetallePedidoProveedorBodegaId.class)
public class DetallePedidoProveedorBodegaModel{

    @Id
    @Column(name = "C_DETALLE_PEDIDO_PROVEEDOR")
    private int detallePedidoProveedorId;

    @Id
    @Column(name = "C_BODEGA")
    private int bodegaId;

}

