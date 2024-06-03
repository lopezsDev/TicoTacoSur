package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
@Table(name = "MENU")
public class MenuModel {

    @Id
    @Column(name = "C_MENU")
    private long menuId;

    @Column(name = "D_NOMBRE_MENU")
    private String nombreMenu;

    @Column(name = "D_DESCRIPCION")
    private String descripcion;

    @Column(name = "M_PRECIO")
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name = "C_MONEDA", updatable = false)
    private MonedaModel monedaId;

    @ManyToOne
    @JoinColumn(name = "C_COMBO", updatable = false)
    private ComboModel comboId;

    @ManyToOne
    @JoinColumn(name = "C_PRODUCTO", updatable = false)
    private ProductoModel productoId;

    @OneToMany(mappedBy = "menuId")
    private Set<PedidoClienteModel> pedidosId;
}


