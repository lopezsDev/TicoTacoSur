package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "PERMISOS")
public class PermisoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_PERMISO")
    private Long permisoId;

    @Column(name = "F_INICIO")
    private LocalDateTime fechaInicio;

    @Column(name = "F_FIN")
    private LocalDateTime fechaFinal;

    @Column(name = "D_MOTIVO")
    private String motivo;

    @Column(name = "T_ESTADO")
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_TIPO_PERMISO", insertable = false, updatable = false)
    private TipoPermisoModel tipoPermisoId;

    @OneToMany(mappedBy = "permisoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EmpleadoModel> empleados = new HashSet<>();
}
