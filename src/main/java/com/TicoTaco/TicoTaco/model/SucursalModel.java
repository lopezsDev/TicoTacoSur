package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

    @OneToMany(mappedBy = "sucursaId", cascade = CascadeType.ALL)
    private List<FacturaModel> facturaId;

    @Column(name = "C_CONTACTO")
    private long contacto;

    @Column(name = "C_CAJA")
    private long caja;
}

