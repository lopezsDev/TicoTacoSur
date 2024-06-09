package com.TicoTaco.TicoTaco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO implements Serializable {
    private Long clienteId;
    private String nombreCliente;
    private String apellidoCliente;
    private String numeroCedula;
    private Long frecuenciaId;
}
