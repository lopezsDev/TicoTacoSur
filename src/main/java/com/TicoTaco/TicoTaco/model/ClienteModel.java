package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CLIENTE")
public class ClienteModel {

    @Id
    @Column(name = "C_CLIENTE")
    private long clienteId;

    @Column(name = "D_NOMBRE_CLIENTE")
    private String nombreCliente;

    @Column(name = "D_APELLIDO_CLIENTE")
    private String apellidoCliente;

    @Column(name = "C_CONTACTO")
    private long contactoId;

    @Column(name = "C_FRECUENCIA")
    private long frecuenciaId;
}
