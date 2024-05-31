package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.math.BigDecimal;

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

    @Column(name = "C_MONEDA")
    private long monedaId;

    @Column(name = "C_COMBO")
    private long comboId;

    @Column(name = "C_PRODUCTO")
    private long productoId;
}

