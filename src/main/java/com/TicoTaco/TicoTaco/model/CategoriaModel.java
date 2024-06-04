package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "CATEGORIA")
public class CategoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_CATEGORIA")
    private long categoriaId;

    @Column(name = "D_NOMBRE_CATEGORIA")
    private String nombreCategoria;

    @Column(name = "D_DESCRIPCION")
    private String descripcion;

}

