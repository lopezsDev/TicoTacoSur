package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EMPRESA_EXPRESS")
public class EmpresaExpressModel {

    @Id
    @Column(name = "C_EMPRESA_EXPRESS")
    private Long empresaExpressId;

    @Column(name = "D_NOMBRE_EMPRESA")
    private String nombreEmpresa;

    @Column(name = "C_CONTACTO")
    private int contactoId;

    @Column(name = "C_DIRECCION")
    private int direccionId;
}
