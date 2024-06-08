package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "EXPRESS")
public class ExpressModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_EXPRESS")
    private Long expressId;

    @Column(name = "D_NOMBRE_ENCARGADO")
    private String nombreEncargado;

    @Column(name = "F_HORA_RETIRO")
    private LocalDateTime horaRetiro;

    @Column(name = "F_HORA_ENTREGA")
    private LocalDateTime horaEntrega;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_EMPRESA_EXPRESS", insertable = false, updatable = false)
    private EmpresaExpressModel empresaExpressId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_CONTACTO", insertable = false, updatable = false)
    private ContactoModel contactoId;


    @OneToMany(mappedBy = "expressId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PedidoClienteModel> pedidosCliente = new HashSet<>();
}

