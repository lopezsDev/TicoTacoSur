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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empleadoId;

    @Column(name = "D_NOMBRE_EMPLEADO")
    private String nombreEmpleado;

    @Column(name = "D_APELLIDO_EMPLEADO")
    private String apellidoEmpleado;

    @Column(name = "F_CONTRATACION")
    private java.util.Date fechaContratacion;

    @Column(name = "C_PUESTO")
    private long puestoId;

    @Column(name = "C_CONTACTO")
    private long contactoId;


    @Column(name = "C_Planilla")
    private long planillaId;


    @Column(name = "C_PERMISO")
    private long permisoId;
}

