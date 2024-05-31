package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.MenuModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuModel, Long> {
}
