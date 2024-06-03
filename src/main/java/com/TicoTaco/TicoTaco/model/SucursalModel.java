package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "SUCURSAL")
public class SucursalModel {

    @Id
    @Column(name = "C_SUCURSAL")
    private long sucursalId;

    @Column(name = "D_NOMBRE_SUCURSAL")
    private String nombreSucursal;

    @Column(name = "C_DIRECCION")
    private long direccionId;

    @Column(name = "C_CONTACTO")
    private long contacto;

    @Column(name = "C_CAJA")
    private long caja;
}
