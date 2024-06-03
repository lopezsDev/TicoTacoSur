package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
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

    @OneToOne
    @JoinColumn(name = "C_DIRECCION", nullable = false)
    private DireccionModel direccionId;
}
