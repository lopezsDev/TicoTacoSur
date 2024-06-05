package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.ProvinciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaRepository extends JpaRepository<ProvinciaModel, Long> {
}
