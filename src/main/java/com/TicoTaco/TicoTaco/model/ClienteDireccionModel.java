package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.ClienteDireccionId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Data
public class ClienteDireccionModel {

    @EmbeddedId
    private ClienteDireccionId id;

    @ManyToOne
    @MapsId("clienteId")
    @JoinColumn(name = "C_CLIENTE")
    public ClienteModel clienteId;

    @ManyToOne
    @MapsId("direccionId")
    @JoinColumn(name = "C_DIRECCION")
    public DireccionModel direccionId;
}



