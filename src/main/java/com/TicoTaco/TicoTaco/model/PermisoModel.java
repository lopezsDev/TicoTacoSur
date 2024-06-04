package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "PERMISOS")
public class PermisoModel {

    @Id
    @Column(name = "C_PERMISO")
    private long permisoId;

    @Column(name = "F_INICIO")
    private Date fechainicio;

    @Column(name = "F_FIN")
    private Date fechafinal;

    @Column(name = "D_MOTIVO")
    private String motivo;

    @Column(name = "T_ESTADO")
    private String estado;

    @Column(name = "C_TIPO_PERMISO")
    private String tipo;

    @OneToMany (mappedBy = "permisoId")
    private Set<PermisoModel> permisoempleadoId;
}
