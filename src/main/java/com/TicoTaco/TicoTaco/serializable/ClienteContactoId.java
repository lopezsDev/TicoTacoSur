package com.TicoTaco.TicoTaco.serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class ClienteContactoId implements Serializable {

    private int clienteId;
    private int contactoId;
}
