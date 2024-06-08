package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "PRODUCTO")
public class ProductoModel {

    @Id
    @Column(name = "C_PRODUCTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;

    @Column(name = "D_NOMBRE_PRODUCTO")
    private String nombreProducto;

    @Column(name = "D_DESCRIPCION")
    private String descripcion;

    @Column(name = "M_PRECIO")
    private BigDecimal precio;

    @Column(name = "F_VENCIMIENTO")
    private LocalDateTime vencimiento;

    @ManyToOne
    @JoinColumn(name = "C_CATEGORIA", nullable = false)
    private CategoriaModel categoriaId;

    @ManyToOne
    @JoinColumn(name = "C_MEDIDA", nullable = false)
    private UnidadMedidaModel medidaId;

    @OneToMany(mappedBy = "productoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ComboProductoModel> combo = new HashSet<>();

    @OneToMany(mappedBy = "productoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DetalleFacturaProductoModel> detalleFacturaProducto = new HashSet<>();

    @OneToMany(mappedBy = "productoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ProductoProveedorModel> productoProveedor = new HashSet<>();
}

