package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

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
}
