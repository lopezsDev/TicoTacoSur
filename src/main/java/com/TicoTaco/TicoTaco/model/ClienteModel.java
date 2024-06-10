package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "CLIENTE")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_CLIENTE")
    private Long clienteId;

    @NotNull
    @Column(name = "D_NOMBRE_CLIENTE")
    private String nombreCliente;

    @NotNull
    @Column(name = "D_APELLIDO_CLIENTE")
    private String apellidoCliente;

    @NotNull
    @Column(name = "N_CEDULA")
    private String numeroCedula;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_FRECUENCIA", insertable = false, updatable = false)
    private FrecuenciaModel frecuenciaId;

    @OneToMany(mappedBy = "clienteId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ClienteContactoModel> contactos = new HashSet<>();

    @OneToMany(mappedBy = "clienteId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ClienteDireccionModel> direcciones = new HashSet<>();

    @OneToMany(mappedBy = "clienteId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PedidoClienteModel> pedidos = new HashSet<>();
}
