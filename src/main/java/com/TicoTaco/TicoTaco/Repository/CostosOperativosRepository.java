package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.CostosOperativosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostosOperativosRepository extends JpaRepository<CostosOperativosModel, Long> {
}
