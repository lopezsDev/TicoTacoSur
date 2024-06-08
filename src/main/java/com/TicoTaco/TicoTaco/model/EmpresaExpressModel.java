package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "EMPRESA_EXPRESS")
public class EmpresaExpressModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_EMPRESA_EXPRESS")
    private Long empresaExpressId;

    @Column(name = "D_NOMBRE_EMPRESA")
    private String nombreEmpresa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_CONTACTO", insertable = false, updatable = false)
    private ContactoModel contactoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_DIRECCION", insertable = false, updatable = false)
    private DireccionModel direccionId;


    @OneToMany(mappedBy = "empresaExpressId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ExpressModel> express = new HashSet<>();
}
