package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.CantonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CantonRepository extends JpaRepository<CantonModel, Long> {
}
