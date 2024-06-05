package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.FormaPagoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaPagoRepository extends JpaRepository<FormaPagoModel, Long> {
}
