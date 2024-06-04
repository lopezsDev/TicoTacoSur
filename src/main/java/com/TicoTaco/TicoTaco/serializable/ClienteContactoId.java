package com.TicoTaco.TicoTaco.serializable;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClienteContactoId implements Serializable {
    private int contactoId;
    private int clienteId;

}
