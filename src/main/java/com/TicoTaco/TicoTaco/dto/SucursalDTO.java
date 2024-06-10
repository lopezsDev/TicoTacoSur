package com.TicoTaco.TicoTaco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SucursalDTO {
    private Long sucursalId;
    private String nombreSucursal;
    private Long direccionId;
    private Long contactoId;
    private Long cajasId;
}


