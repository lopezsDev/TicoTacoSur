package com.TicoTaco.TicoTaco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetallesFacturaDTO implements Serializable {
    private long detalleFacturaId;
    private int cantidad;
    private double precioLinea;
    private String observaciones;
}


