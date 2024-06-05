package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.MenuModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuModel, Long> {
}
