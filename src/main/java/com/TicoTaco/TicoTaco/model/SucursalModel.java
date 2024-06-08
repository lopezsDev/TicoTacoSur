package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "SUCURSAL")
public class SucursalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_SUCURSAL")
    private Long sucursalId;

    @Column(name = "D_NOMBRE_SUCURSAL")
    private String nombreSucursal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_DIRECCION", insertable = false, updatable = false)
    private DireccionModel direccionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_CONTACTO", insertable = false, updatable = false)
    private ContactoModel contactoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_CAJAS", insertable = false, updatable = false)
    private CajasModel cajaId;

    @OneToMany(mappedBy = "sucursalId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AdminRestauranteModel> adminRestaurantes = new HashSet<>();

    @OneToMany(mappedBy = "sucursalId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BodegaModel> bodegas = new HashSet<>();

    @OneToMany(mappedBy = "sucursalId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SucursalEmpleadoModel> SucursalEmpleado = new HashSet<>();

    @OneToMany(mappedBy = "sucursalId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PedidoProveedorModel> pedidosProveedor = new HashSet<>();

    @OneToMany(mappedBy = "sucursalId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FacturaModel> facturas = new HashSet<>();
}


