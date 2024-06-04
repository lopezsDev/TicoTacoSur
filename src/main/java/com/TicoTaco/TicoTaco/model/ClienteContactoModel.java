package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.ClienteContactoId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTACTO_CLIENTE")
@IdClass(ClienteContactoId.class)
public class ClienteContactoModel{

    @Id
    @Column(name = "C_CONTACTO")
    private int contactoId;

    @Id
    @Column(name = "C_CLIENTE")
    private int clienteId;

}

