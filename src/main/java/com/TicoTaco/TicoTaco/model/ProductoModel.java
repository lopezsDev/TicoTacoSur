package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "C_CATEGORIA", nullable = false)
    private CategoriaModel categoriaId;

    @ManyToOne
    @JoinColumn(name = "C_MEDIDA", nullable = false)
    private UnidadMedidaModel medidaId;

    /*
    @OneToMany(mappedBy = "detalleFacturaProductoId")
    private Set<DetalleFacturaProductoModel> detalleFactura;*/

    @OneToMany(mappedBy = "menuId")
    private Set<MenuModel> menuId;

    @OneToMany(mappedBy = "productoId")
    private Set<BodegaModel> BodegaId;
}
