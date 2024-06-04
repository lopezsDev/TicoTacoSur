package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "TIPO_PERMISO")
public class TipoPermisoModel {
    @Id
    @Column(name = "C_TIPO_PERMISO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tipopermiso;

    @Column(name = "T_NOMBRE_PERMISO")
    private String nombrePermiso;

}
