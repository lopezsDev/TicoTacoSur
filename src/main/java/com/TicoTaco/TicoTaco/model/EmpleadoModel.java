package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "EMPLEADO")
public class EmpleadoModel {

    @Id
    @Column(name = "C_EMPLEADO")
    private Long empleadoId;

    @Column(name = "D_NOMBRE_EMPLEADO")
    private String nombreEmpleado;

    @Column(name = "D_APELLIDO_EMPLEADO")
    private String apellidoEmpleado;

    @Column(name = "F_CONTRATACION")
    private java.util.Date fechaContratacion;

    @JoinColumn(name = "C_PUESTO", nullable = false)
    private PuestoModel puestoId;

    @JoinColumn(name = "C_CONTACTO", nullable = false)
    private ContactoModel contactoId;

    @JoinColumn(name = "C_PLANILLA", nullable = false)
    private PlanillaModel planillaId;

    @JoinColumn(name = "C_PERMISO", nullable = false)
    private PermisoModel permisoId;
}

