package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.TipoCostosOperativosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCostosOperativosRepository extends JpaRepository<TipoCostosOperativosModel, Long> {
}