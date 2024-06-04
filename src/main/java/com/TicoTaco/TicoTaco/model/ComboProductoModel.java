package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.ComboProductoId;
import jakarta.persistence.*;

@Entity
@Table(name = "COMBO_PRODUCTO")
@IdClass(ComboProductoId.class)
public class ComboProductoModel {

    @Id
    @Column(name = "C_COMBO")
    private int comboId;

    @Id
    @Column(name = "C_PRODUCTO")
    private int productoId;

}

