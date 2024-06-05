package com.TicoTaco.TicoTaco.Repository;


import com.TicoTaco.TicoTaco.serializable.ClienteDireccionId;
import com.TicoTaco.TicoTaco.model.ClienteDireccionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDireccionRepository extends JpaRepository<ClienteDireccionModel, ClienteDireccionId> {
}

