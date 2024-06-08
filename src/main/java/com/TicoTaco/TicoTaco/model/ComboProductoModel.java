package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.ComboProductoId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "COMBO_PRODUCTO")
public class ComboProductoModel {

    @EmbeddedId
    private ComboProductoId id;

    @MapsId("comboId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_COMBO", nullable = false)
    private ComboModel comboId;

    @MapsId("productoId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_PRODUCTO", nullable = false)
    private ProductoModel productoId;
}

