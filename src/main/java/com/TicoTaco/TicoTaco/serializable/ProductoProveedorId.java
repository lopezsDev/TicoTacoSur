package com.TicoTaco.TicoTaco.serializable;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductoProveedorId implements Serializable {
    private int proveedorId;
    private int productoId;

}
