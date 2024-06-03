package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.DetallesFacturaProductoId;
import jakarta.persistence.*;

public class DetalleFacturaProductoModel {

    @EmbeddedId
    private DetallesFacturaProductoId id;

    @ManyToOne
    @MapsId("detalleFacturaId")
    @JoinColumn(name = "C_DETALLE_FACTURA")
    private DetallesFacturaModel detalleFactura;

    @ManyToOne
    @MapsId("productoId")
    @JoinColumn(name = "C_PRODUCTO")
    private ProductoModel producto;
}
