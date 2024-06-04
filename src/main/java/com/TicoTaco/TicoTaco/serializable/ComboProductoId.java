package com.TicoTaco.TicoTaco.serializable;

import lombok.Data;

import java.io.Serializable;

@Data
public class ComboProductoId implements Serializable {

    private int comboId;
    private int productoId;
}
