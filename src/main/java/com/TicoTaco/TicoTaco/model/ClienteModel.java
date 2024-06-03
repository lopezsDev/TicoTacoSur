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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clienteId;

    @Column(name = "D_NOMBRE_CLIENTE")
    private String nombreCliente;

    @Column(name = "D_APELLIDO_CLIENTE")
    private String apellidoCliente;

    @ManyToOne
    @JoinColumn(name = "frecuenciaId", nullable = false)
    private FrecuenciaModel frecuenciaId;

    @OneToMany(mappedBy = "clienteId")
    private Set<PedidoClienteModel> pedidoClienteId;

    @OneToMany(mappedBy = "clienteId")
    private Set<ClienteDireccionModel> direccionId;

    @OneToMany(mappedBy = "contactoId")
    private Set<ClienteContactoModel> contactoId;

}
