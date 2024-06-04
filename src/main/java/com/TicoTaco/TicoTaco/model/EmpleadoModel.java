package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "C_PUESTO", nullable = false )
    private PuestoModel puestoId;

    @ManyToOne
    @JoinColumn(name = "C_CONTACTO", nullable = false )
    private ContactoModel contactoId;

    @ManyToOne
    @JoinColumn(name = "C_Planilla", nullable = false )
    private PlanillaModel planillaId;

    @ManyToOne
    @JoinColumn(name = "C_PERMISO", nullable = false )
    private PermisoModel permisoId;
}

