package com.TicoTaco.TicoTaco.service;


import com.TicoTaco.TicoTaco.model.ClienteModel;

import java.util.List;

public interface ClienteService {
    List<ClienteModel> getAllClientes();
    ClienteModel createCliente(ClienteModel cliente);
}
