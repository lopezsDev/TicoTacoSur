package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.model.ClienteContactoModel;
import com.TicoTaco.TicoTaco.Repository.ClienteContactoRepository;
import com.TicoTaco.TicoTaco.serializable.ClienteContactoId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteContactoService {

    @Autowired
    private ClienteContactoRepository clienteContactoRepository;

    public List<ClienteContactoModel> findAll() {
        return clienteContactoRepository.findAll();
    }

    public Optional<ClienteContactoModel> findById(ClienteContactoId id) {
        return clienteContactoRepository.findById(id);
    }

    public ClienteContactoModel save(ClienteContactoModel clienteContacto) {
        return clienteContactoRepository.save(clienteContacto);
    }

    public ClienteContactoModel update(ClienteContactoId id, ClienteContactoModel ClienteContactoDetails) {
        Optional<ClienteContactoModel> optionalClienteContacto = clienteContactoRepository.findById(id);

        if (optionalClienteContacto.isPresent()) {
            ClienteContactoModel ClienteContacto = optionalClienteContacto.get();
            ClienteContacto.setContactoId(ClienteContactoDetails.getContactoId());
            ClienteContacto.setClienteId(ClienteContactoDetails.getClienteId());

            return clienteContactoRepository.save(ClienteContacto);
        } else {
            throw new RuntimeException("ClienteContacto not found with id " + id);
        }
    }

    public void deleteById(ClienteContactoId id) {
        clienteContactoRepository.deleteById(id);
    }
}

