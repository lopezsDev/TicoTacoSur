package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "CONTACTO")
public class ContactoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_CONTACTO")
    private Long contactoId;

    @Column(name = "D_TELEFONO")
    private String telefono;

    @Column(name = "D_CORREO")
    private String email;

    @OneToMany(mappedBy = "contactoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ClienteContactoModel> clientes = new HashSet<>();

    @OneToMany(mappedBy = "contactoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EmpresaExpressModel> empresasExpress = new HashSet<>();

    @OneToMany(mappedBy = "contactoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ExpressModel> express = new HashSet<>();

    @OneToMany(mappedBy = "contactoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ProveedorModel> proveedores = new HashSet<>();

    @OneToMany(mappedBy = "contactoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SucursalModel> sucursales = new HashSet<>();

    @OneToMany(mappedBy = "contactoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EmpleadoModel> empleado = new HashSet<>();
}

