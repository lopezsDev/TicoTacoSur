package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.serializable.ClienteContactoId;
import com.TicoTaco.TicoTaco.model.ClienteContactoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteContactoRepository extends JpaRepository<ClienteContactoModel, ClienteContactoId> {
}