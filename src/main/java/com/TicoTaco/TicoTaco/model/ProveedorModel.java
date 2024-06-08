package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "PROVEEDORES")
public class ProveedorModel {

    @Id
    @Column(name = "C_PROVEEDOR")
    private Long proveedorId;

    @Column(name = "D_NOMBRE_PROVEEDOR")
    private String nombreProveedor;

    @Column(name = "F_DIAS_ENTREGA")
    private LocalDateTime diasentrega;

    @Column(name = "C_CONTACTO")
    private long contactoId;

    @Column(name = "C_DIRECCION")
    private long direccionId;

    @OneToMany(mappedBy = "proveedorId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PedidoProveedorModel> pedidoProveedor = new HashSet<>();

    @OneToMany(mappedBy = "proveedorId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ProductoProveedorModel> productoProveedor = new HashSet<>();

}

