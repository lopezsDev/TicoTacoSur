package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.MonedaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonedaRepository extends JpaRepository<MonedaModel, Long> {
}
