package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PROVEEDORES")
public class ProveedorModel {

    @Id
    @Column(name = "C_PROVEEDOR")
    private long proveedorId;

    @Column(name = "D_NOMBRE_PROVEEDOR")
    private String nombreProveedor;

    @Column(name = "C_CONTACTO")
    private long contactoId;
}

