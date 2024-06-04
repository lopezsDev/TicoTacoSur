package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "SUCURSAL")
public class SucursalModel {

    @Id
    @Column(name = "C_SUCURSAL")
    private long sucursalId;

    @Column(name = "D_NOMBRE_SUCURSAL")
    private String nombreSucursal;

    @OneToOne
    @JoinColumn(name = "C_DIRECCION", nullable = false)
    private DireccionModel direccion;

    @Column(name = "C_CONTACTO")
    private long contacto;

    @ManyToOne
    @JoinColumn(name = "C_CAJA", nullable = false)
    private Set<CajasModel> cajaId;

    @OneToMany(mappedBy = "sucursalId")
    private Set<AdminRestauranteModel> adminRestaurante;

    @OneToMany(mappedBy = "sucursalId")
    private Set<BodegaModel> bodegas;

    @OneToMany(mappedBy = "empleadoId")
    private Set<EmpleadoModel> empleados;

    @OneToMany(mappedBy = "sucursalId")
    private Set<PedidoProveedorModel> pedidosProveedor;

    @OneToMany(mappedBy = "sucursalId")
    private Set<FacturaModel> facturasId;
}

