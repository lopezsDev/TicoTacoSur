package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.ClienteRepository;
import com.TicoTaco.TicoTaco.model.ClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ClienteModel> getAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    @Transactional
    public ClienteModel createCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }
}
