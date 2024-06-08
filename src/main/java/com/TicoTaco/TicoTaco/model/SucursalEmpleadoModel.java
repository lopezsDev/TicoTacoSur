package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.SucursalEmpleadoId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SUCURSAL_EMPLEADO")
public class SucursalEmpleadoModel {

    @EmbeddedId
    private SucursalEmpleadoId id;

    @MapsId("empleadoId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_EMPLEADO", nullable = false)
    private EmpleadoModel empleadoId;

    @MapsId("sucursalId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "C_SUCURSAL", nullable = false)
    private SucursalModel sucursalId;
}

