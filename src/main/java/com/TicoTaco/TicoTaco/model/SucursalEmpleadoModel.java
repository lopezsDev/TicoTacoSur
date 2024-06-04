package com.TicoTaco.TicoTaco.model;

import com.TicoTaco.TicoTaco.serializable.SucursalEmpleadoId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SUCURSAL_EMPLEADO")
@IdClass(SucursalEmpleadoId.class)
public class SucursalEmpleadoModel{

    @Id
    @Column(name = "C_EMPLEADO")
    private int empleadoId;

    @Id
    @Column(name = "C_SUCURSAL")
    private int sucursalId;

}

