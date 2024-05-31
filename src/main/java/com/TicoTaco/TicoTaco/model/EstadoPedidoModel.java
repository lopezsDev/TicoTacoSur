package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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
