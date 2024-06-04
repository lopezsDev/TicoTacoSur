package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "ESTADO_PEDIDO")
public class EstadoPedidoModel {

    @Id
    @Column(name = "C_ESTADO")
    private long estadoId;

    @Column(name = "T_ESTADO")
    private String estado;

}
