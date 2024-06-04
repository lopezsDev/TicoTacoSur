package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.ProductoProveedorId;
import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCTO_PROVEEDORES")
@IdClass(ProductoProveedorId.class)
public class ProductoProveedorModel {

    @Id
    @Column(name = "C_PROVEEDOR")
    private int proveedorId;

    @Id
    @Column(name = "C_PRODUCTO")
    private int productoId;
}

