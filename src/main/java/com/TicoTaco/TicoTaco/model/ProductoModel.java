package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "PRODUCTO")
public class ProductoModel {

    @Id
    @Column(name = "C_PRODUCTO")
    private long productoId;

    @Column(name = "D_NOMBRE_PRODUCTO")
    private String nombreProducto;

    @Column(name = "D_DESCRIPCION")
    private String descripcion;

    @Column(name = "M_PRECIO")
    private BigDecimal precio;

    @Column(name = "F_VENCIMIENTO")
    private Date vencimiento;

    @Column(name = "C_CATEGORIA")
    private long categoriaId;

    @Column(name = "C_MEDIDA")
    private long medidaId;
}
