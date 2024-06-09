package com.TicoTaco.TicoTaco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuDTO implements Serializable {
    private Long menuId;
    private String nombreMenu;
    private String descripcion;
    private BigDecimal precio;
    private Long monedaId;
    private Long comboId;
    private Long productoId;
}
