package com.TicoTaco.TicoTaco.serializable;

import lombok.Data;

import java.io.Serializable;

@Data
public class DetallePedidoProveedorBodegaId implements Serializable {
    private int detallePedidoProveedorId;
    private int bodegaId;
}
