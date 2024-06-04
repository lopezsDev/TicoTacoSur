package com.TicoTaco.TicoTaco.serializable;

import lombok.Data;

import java.io.Serializable;

@Data
public class DetalleFacturaProductoId implements Serializable {
    private int detalleFacturaId;
    private int productoId;

    // Getters y setters
}
