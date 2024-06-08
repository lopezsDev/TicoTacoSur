package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.DetalleFacturaProductoId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DETALLES_FACTURA_PRODUCTO")
public class DetalleFacturaProductoModel {

    @EmbeddedId
    private DetalleFacturaProductoId id;

    @MapsId("detalleFacturaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_DETALLE_FACTURA", nullable = false)
    private DetallesFacturaModel detalleFacturaId;

    @MapsId("productoId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_PRODUCTO", nullable = false)
    private ProductoModel productoId;
}
