package com.TicoTaco.TicoTaco.model;


import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TIPO_COSTOS_OPERATIVOS")
public class TipoCostosOperativosModel {

    @Id
    @Column(name = "C_TIPO_COSTOS_OPERATIVOS")
    private long tipoCostosOperativosId;

    @Column(name = "D_NOMBRE_TIPO_COSTOS_OPERATIVOS")
    private String nombreTipoCostosOperativos;

    @OneToMany(mappedBy = "tipoCostosOperativos", cascade = CascadeType.ALL)
    private List<CostosOperativosModel> costosOperativos; 

}
