package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.ContactoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<ContactoModel, Long> {
}
