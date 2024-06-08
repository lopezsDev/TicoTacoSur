package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.ProductoProveedorId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUCTO_PROVEEDORES")
public class ProductoProveedorModel {

    @EmbeddedId
    private ProductoProveedorId id;

    @MapsId("proveedorId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_PROVEEDOR", nullable = false)
    private ProveedorModel proveedorId;

    @MapsId("productoId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_PRODUCTO", nullable = false)
    private ProductoModel productoId;
}


