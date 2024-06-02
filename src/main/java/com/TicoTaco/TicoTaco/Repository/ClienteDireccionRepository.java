package com.TicoTaco.TicoTaco.Repository;


import com.TicoTaco.TicoTaco.model.ClienteDireccionModel;
import com.TicoTaco.TicoTaco.serializable.ClienteDireccionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDireccionRepository extends JpaRepository<ClienteDireccionModel, ClienteDireccionId> {
}

