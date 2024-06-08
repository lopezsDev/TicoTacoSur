package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.DetallePedidoProveedorBodegaId;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DETALLE_PEDIDO_PROVEEDOR_BODEGA")
public class DetallePedidoProveedorBodegaModel {

    @EmbeddedId
    private DetallePedidoProveedorBodegaId id;

    @MapsId("bodegaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_BODEGA", nullable = false)
    private BodegaModel bodegaId;

    @MapsId("detallePedidoProveedorId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_DETALLE_PEDIDO_PROVEEDOR", nullable = false)
    private DetallePedidoProveedorModel detallePedidoProveedorId;
}

