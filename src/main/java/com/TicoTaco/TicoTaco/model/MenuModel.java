package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "MENU")
public class MenuModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_MENU")
    private Long menuId;

    @Column(name = "D_NOMBRE_MENU")
    private String nombreMenu;

    @Column(name = "D_DESCRIPCION")
    private String descripcion;

    @Column(name = "M_PRECIO")
    private BigDecimal precio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_MONEDA", insertable = false, updatable = false)
    private MonedaModel monedaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_COMBO", insertable = false, updatable = false)
    private ComboModel comboId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_PRODUCTO", insertable = false, updatable = false)
    private ProductoModel productoId;

    @OneToMany(mappedBy = "menuId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PedidoClienteModel> pedidoCliente = new HashSet<>();

}


