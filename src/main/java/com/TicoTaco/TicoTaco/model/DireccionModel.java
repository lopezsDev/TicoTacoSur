package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "DIRECCION")
public class DireccionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_DIRECCION")
    private Long direccionId;

    @Column(name = "D_DIRECCION_ESPECIFICA")
    private String direccionEspecifica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_DISTRITO", insertable = false, updatable = false)
    private DistritoModel distritoId;

    @OneToMany(mappedBy = "direccionId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ClienteDireccionModel> clientes = new HashSet<>();

    @OneToMany(mappedBy = "direccionId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EmpresaExpressModel> empresasExpress = new HashSet<>();

    @OneToMany(mappedBy = "direccionId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ProveedorModel> proveedores = new HashSet<>();

    @OneToMany(mappedBy = "direccionId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SucursalModel> sucursales = new HashSet<>();
}

