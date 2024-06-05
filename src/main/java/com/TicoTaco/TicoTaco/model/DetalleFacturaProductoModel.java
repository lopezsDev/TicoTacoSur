package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.DetalleFacturaProductoId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DETALLES_FACTURA_PRODUCTO")
@IdClass(DetalleFacturaProductoId.class)
public class DetalleFacturaProductoModel{

    @Id
    @Column(name = "C_DETALLE_FACTURA")
    private int detalleFacturaId;

    @Id
    @Column(name = "C_PRODUCTO")
    private int productoId;

}

