package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CATEGORIA")
public class CategoriaModel {

    @Id
    @Column(name = "C_CATEGORIA")
    private Long categoriaId;

    @Column(name = "D_NOMBRE_CATEGORIA")
    private String nombreCategoria;

    @Column(name = "D_DESCRIPCION")
    private String descripcion;
}

