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
    @JoinColumn(name = "categoriaId", nullable = false)
    private CategoriaModel categoriaId;

    @ManyToOne
    @JoinColumn(name = "medidaId", nullable = false)
    private UnidadMedidaModel medidaId;

    @OneToMany(mappedBy = "detalleFacturaId")
    private Set<DetalleFacturaProductoModel> detalleFactura;

    @ManyToOne(mappedBy = "productoId")
    private Set<BodegaModel> bodegaId;
}
