package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.ExpressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpressRepository extends JpaRepository<ExpressModel, Long> {
}
