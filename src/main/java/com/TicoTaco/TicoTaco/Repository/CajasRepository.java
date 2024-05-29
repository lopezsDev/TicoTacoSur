package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.CajasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CajasRepository extends JpaRepository<CajasModel, Integer> {
}
