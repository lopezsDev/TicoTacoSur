package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.ClienteDireccionId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CLIENTE_DIRECCION")
public class ClienteDireccionModel {
    @EmbeddedId
    private ClienteDireccionId id;

    @MapsId("clienteId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_CLIENTE", nullable = false)
    private ClienteModel clienteId;

    @MapsId("direccionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_DIRECCION", nullable = false)
    private DireccionModel direccionId;
}




