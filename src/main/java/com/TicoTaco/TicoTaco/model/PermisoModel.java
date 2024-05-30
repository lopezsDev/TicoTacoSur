package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PERMISO")
public class PermisoModel {

    @Id
    @Column(name = "C_PERMISO")
    private long permisoId;

    @Column(name = "D_PERMISO")
    private String permiso;
}
