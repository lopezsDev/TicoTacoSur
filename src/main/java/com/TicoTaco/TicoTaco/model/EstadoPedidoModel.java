package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@Entity
@Table(name = "ESTADO_PEDIDO")
public class EstadoPedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_ESTADO")
    private Long estadoId;

    @Column(name = "T_ESTADO")
    private String estado;

    @OneToMany(mappedBy = "estadoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PedidoClienteModel> pedidoCliente = new HashSet<>();
}
