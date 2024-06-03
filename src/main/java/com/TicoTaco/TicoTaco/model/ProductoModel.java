package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
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

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private CategoriaModel categoria;

    @ManyToOne
    @JoinColumn(name = "medida_id", nullable = false)
    private UnidadMedidaModel medida;

    @OneToMany(mappedBy = "producto")
    private Set<DetalleFactura> detallesFactura;
}
