package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.ClienteContactoId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTACTO_CLIENTE")
public class ClienteContactoModel {

    @EmbeddedId
    private ClienteContactoId id;

    @MapsId("contacto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_CONTACTO", nullable = false)
    private ContactoModel contactoId;

    @MapsId("cliente")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_CLIENTE", nullable = false)
    private ClienteModel clienteId;
}




