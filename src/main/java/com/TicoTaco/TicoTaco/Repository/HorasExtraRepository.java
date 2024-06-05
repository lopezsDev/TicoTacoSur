package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.HorasExtraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorasExtraRepository extends JpaRepository<HorasExtraModel, Long> {
}
