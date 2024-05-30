package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "PEDIDO_CLIENTE")
public class PedidoClienteModel {

    @Id
    @Column(name = "C_PEDIDO_CLIENTE")
    private long pedidoClienteId;

    @Column(name = "F_HORA_PEDIDO")
    private Date horaPedido;

    @Column(name = "C_ESTADO")
    private long estadoId;

    @Column(name = "C_MENU")
    private long menuId;

    @Column(name = "C_CLIENTE")
    private long clienteId;

    @Column(name = "C_TIPO_ENTREGA")
    private long tipoEntregaId;
}

