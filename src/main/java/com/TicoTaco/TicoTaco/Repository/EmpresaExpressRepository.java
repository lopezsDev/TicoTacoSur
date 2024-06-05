package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.EmpresaExpressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaExpressRepository extends JpaRepository<EmpresaExpressModel, Long> {
}
