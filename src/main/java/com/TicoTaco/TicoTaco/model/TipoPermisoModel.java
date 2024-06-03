package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name = "TIPO_PERMISO")
public class TipoPermisoModel {
    @Id
    @Column(name = "C_TIPO_PERMISO")
    private long tipopermiso;

    @Column(name = "T_NOMBRE_PERMISO")
    private String nompermiso;

}
