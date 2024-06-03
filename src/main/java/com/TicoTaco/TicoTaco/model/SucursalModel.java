package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
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

    @OneToOne
    @JoinColumn(name = "C_DIRECCION", nullable = false)
    private DireccionModel direccionId;

    @Column(name = "C_CONTACTO")
    private long contacto;

    @Column(name = "C_CAJA")
    private long caja;
}
