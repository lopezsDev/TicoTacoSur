package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.ComboModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboRepository extends JpaRepository<ComboModel, Long> {
}
