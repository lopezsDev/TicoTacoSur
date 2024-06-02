package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.AdminRestauranteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRestauranteRepository extends JpaRepository<AdminRestauranteModel, Long> {
}
