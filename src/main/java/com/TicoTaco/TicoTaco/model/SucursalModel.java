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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sucursalId;

    @Column(name = "D_NOMBRE_SUCURSAL")
    private String nombreSucursal;

    @Column(name = "C_DIRECCION")
    private long direccionId;

    @Column(name = "C_CONTACTO")
    private long contactoId;

    @Column(name = "C_CAJA")
    private long cajaId;
}

