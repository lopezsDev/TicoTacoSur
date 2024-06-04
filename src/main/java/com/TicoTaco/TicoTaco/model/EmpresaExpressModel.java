package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "EMPRESA_EXPRESS")
public class EmpresaExpressModel {

    @Id
    @Column(name = "C_EMPRESA_EXPRESS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empresaExpressId;

    @Column(name = "D_NOMBRE_EMPRESA")
    private String nombreEmpresa;


    @Column(name = "C_CONTACTO")
    private long contactoId;


    @Column(name = "C_DIRECCION")
    private long direccionId;


}
