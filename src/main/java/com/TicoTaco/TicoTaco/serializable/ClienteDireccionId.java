package com.TicoTaco.TicoTaco.serializable;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClienteDireccionId implements Serializable {
    private int clienteId;
    private int direccionId;
}
