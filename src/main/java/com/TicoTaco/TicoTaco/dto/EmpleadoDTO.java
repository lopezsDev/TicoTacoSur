package com.TicoTaco.TicoTaco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoDTO implements Serializable {
    private Long empleadoId;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private LocalDateTime fechaContratacion;
    private Long puestoId;
    private Long contactoId;
    private Long planillaId;
    private Long permisoId;
}
