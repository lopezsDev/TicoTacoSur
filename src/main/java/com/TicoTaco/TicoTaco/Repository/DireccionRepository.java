package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.DireccionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends JpaRepository<DireccionModel, Long> {
}
