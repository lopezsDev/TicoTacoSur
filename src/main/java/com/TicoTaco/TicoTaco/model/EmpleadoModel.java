package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "EMPLEADO")
public class EmpleadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_EMPLEADO")
    private Long empleadoId;

    @Column(name = "D_NOMBRE_EMPLEADO")
    private String nombreEmpleado;

    @Column(name = "D_APELLIDO_EMPLEADO")
    private String apellidoEmpleado;

    @Column(name = "F_CONTRATACION")
    private LocalDateTime fechaContratacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_PUESTO", insertable = false, updatable = false)
    private PuestoModel puestoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_CONTACTO", insertable = false, updatable = false)
    private ContactoModel contactoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_PLANILLA", insertable = false, updatable = false)
    private PlanillaModel planillaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_PERMISO", insertable = false, updatable = false)
    private PermisoModel permisoId;

    @OneToMany(mappedBy = "empleadoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PedidoClienteModel> pedidosCliente = new HashSet<>();

    @OneToMany(mappedBy = "empleadoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SucursalEmpleadoModel> SucursalEmpleado = new HashSet<>();
}

