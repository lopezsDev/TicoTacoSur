package com.TicoTaco.TicoTaco.serializable;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.Data;


@Embeddable
@Data
public class ClienteDireccionId implements Serializable {
    private long clienteId;
    private long direccionId;


}
