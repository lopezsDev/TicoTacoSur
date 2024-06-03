package com.TicoTaco.TicoTaco.serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.Data;


@Embeddable
@Data
public class ClienteDireccionId implements Serializable {

    @Column(name = "C_CLIENTE")
    private long clienteId;

    @Column(name = "C_DIRECCION")
    private long direccionId;

}
