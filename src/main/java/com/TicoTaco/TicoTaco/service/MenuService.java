package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.MenuRepository;
import com.TicoTaco.TicoTaco.model.MenuModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<MenuModel> getAllMenus() {
        return menuRepository.findAll();
    }

    public Optional<MenuModel> getMenuById(long id) {
        return menuRepository.findById(id);
    }

    public MenuModel createMenu(MenuModel menu) {
        return menuRepository.save(menu);
    }

    public MenuModel updateMenu(long id, MenuModel menuDetails) {
        MenuModel menu = menuRepository.findById(id).orElse(null);

        if (menu != null) {
            menu.setNombreMenu(menuDetails.getNombreMenu());
            menu.setDescripcion(menuDetails.getDescripcion());
            menu.setPrecio(menuDetails.getPrecio());
            menu.setMonedaId(menuDetails.getMonedaId());
            menu.setComboId(menuDetails.getComboId());
            menu.setProductoId(menuDetails.getProductoId());

            return menuRepository.save(menu);
        } else {
            return null;
        }
    }

    public void deleteMenu(long id) {
        menuRepository.deleteById(id);
    }
}
