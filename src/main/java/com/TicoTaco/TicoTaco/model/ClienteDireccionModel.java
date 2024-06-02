package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.ClienteDireccionId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.JoinColumn;

@Entity

public class ClienteDireccionModel {

    @EmbeddedId
    private ClienteDireccionId id;

    @ManyToOne
    @MapsId("clienteId")
    @JoinColumn(name = "C_CLIENTE")
    public ClienteModel cliente;

    @ManyToOne
    @MapsId("direccionId")
    @JoinColumn(name = "C_DIRECCION")
    public DireccionModel direccion;

    public ClienteDireccionModel() {
    }

    public ClienteDireccionModel(ClienteDireccionId id, ClienteModel cliente, DireccionModel direccion) {
        this.id = id;
        this.cliente = cliente;
        this.direccion = direccion;
    }

    public ClienteDireccionId getId() {
        return id;
    }

    public void setId(ClienteDireccionId id) {
        this.id = id;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public DireccionModel getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionModel direccion) {
        this.direccion = direccion;
    }


}



