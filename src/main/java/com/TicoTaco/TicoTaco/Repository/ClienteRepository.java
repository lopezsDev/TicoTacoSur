package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
