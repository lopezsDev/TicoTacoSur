package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "EXPRESS")
public class ExpressModel {

    @Id
    @Column(name = "C_EXPRESS")
    private long expressId;

    @Column(name = "D_NOMBRE_ENCARGADO")
    private String nombreEncargado;

    @Column(name = "F_HORA_RETIRO")
    private Date horaRetiro;

    @Column(name = "F_HORA_ENTREGA")
    private Date horaEntrega;

    @ManyToOne
    @JoinColumn(name = "C_EMPRESA_EXPRESS", nullable = false)
    private EmpresaExpressModel empresaExpressId;

    @ManyToOne
    @JoinColumn(name = "C_CONTACTO", nullable = false)
    private ContactoModel contactoId;

    @OneToMany(mappedBy = "expressId")
    private Set<PedidoClienteModel> pedidosId;
}

