package com.TicoTaco.TicoTaco.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "COSTOS_OPERATIVOS")
public class CostosOperativosModel {

    @Id
    @Column(name = "C_COSTOS_OPERATIVOS")
    private Long costosOperativosId;

    @Column(name = "F_DIA_PAGO")
    private java.time.LocalDateTime diapago;

    @Column(name = "M_COSTE")
    private int costodia;

    @Column(name = "D_DESCRIPCION")
    private String descripcion;

    @Column(name = "C_TIPO_COSTO_OPERATIVO")
    private String tipocosto;

    @Column(name = "C_MONEDA")
    private int tmoneda;

    @OneToMany(mappedBy = "costosOperativos", cascade = CascadeType.ALL)
    private List<AdminRestauranteModel> administradores;

    @OneToMany(mappedBy = "costosOperativos", cascade = CascadeType.ALL)
    private List<SucursalModel> sucursales;

    @ManyToOne
    @JoinColumn(name = "C_TIPO_COSTOS_OPERATIVOS", nullable = false)
    private TipoCostosOperativosModel tipoCostosOperativos;


}

