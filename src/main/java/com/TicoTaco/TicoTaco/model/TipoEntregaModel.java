package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TIPO_ENTREGA")
public class TipoEntregaModel {

    @Id
    @Column(name = "C_TIPO_ENTREGA")
    private long tipoEntregaId;

    @Column(name = "T_ENTREGA")
    private String entrega;
}

