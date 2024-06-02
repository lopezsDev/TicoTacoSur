package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.ClienteDireccionRepository;
import com.TicoTaco.TicoTaco.model.ClienteDireccionModel;
import com.TicoTaco.TicoTaco.serializable.ClienteDireccionId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteDireccionService {

    private final ClienteDireccionRepository repository;

    @Autowired
    public ClienteDireccionService(ClienteDireccionRepository repository) {
        this.repository = repository;
    }

    public List<ClienteDireccionModel> getAll() {
        return repository.findAll();
    }

    public Optional<ClienteDireccionModel> getById(ClienteDireccionId id) {
        return repository.findById(id);
    }

    public ClienteDireccionModel create(ClienteDireccionModel entity) {
        return repository.save(entity);
    }

    public ClienteDireccionModel update(ClienteDireccionId id, ClienteDireccionModel entityDetails) {
        Optional<ClienteDireccionModel> optionalEntity = repository.findById(id);
        if (optionalEntity.isPresent()) {
            ClienteDireccionModel entity = optionalEntity.get();
            entity.setCliente(entityDetails.getCliente());
            entity.setDireccion(entityDetails.getDireccion());
            return repository.save(entity);

        }
        return null;
    }

    public void delete(ClienteDireccionId id) {
        repository.deleteById(id);
    }
}
