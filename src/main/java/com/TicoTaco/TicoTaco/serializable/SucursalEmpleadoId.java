package com.TicoTaco.TicoTaco.serializable;

import lombok.Data;

import java.io.Serializable;

@Data
public class SucursalEmpleadoId implements Serializable {
    private int empleadoId;
    private int sucursalId;

}
