package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "frecuenciaId", nullable = false)
    private FrecuenciaModel frecuencia;

    @OneToMany(mappedBy = "clienteId")
    private Set<PedidoClienteModel> pedidos;

    @OneToMany(mappedBy = "cliente")
    private Set<ClienteDireccionModel> direcciones;

}
