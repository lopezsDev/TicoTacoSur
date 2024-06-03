package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    @Column(name = "C_PUESTO")
    private int puestoId;



    @Column(name = "C_PLANILLA")
    private int planillaId;

    @Column(name = "C_PERMISO")
    private int permisoId;
}

