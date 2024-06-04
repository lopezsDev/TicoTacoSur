package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.ClienteDireccionId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CLIENTE_DIRECCION")
@IdClass(ClienteDireccionId.class)
public class ClienteDireccionModel{

    @Id
    @Column(name = "C_CLIENTE")
    private int clienteId;

    @Id
    @Column(name = "C_DIRECCION")
    private int direccionId;
}



