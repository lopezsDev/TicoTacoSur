package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "PROVEEDORES")
public class ProveedorModel {

    @Id
    @Column(name = "C_PROVEEDOR")
    private long proveedorId;

    @Column(name = "D_NOMBRE_PROVEEDOR")
    private String nombreProveedor;

    @Column(name = "F_DIAS_ENTREGA")
    private LocalDateTime diasentrega;

    @Column(name = "C_CONTACTO")
    private long contactoId;

    @Column(name = "C_DIRECCION")
    private long direccionId;

}

