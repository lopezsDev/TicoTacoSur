package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.MenuRepository;
import com.TicoTaco.TicoTaco.model.MenuModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    @Transactional(readOnly = true)
    public List<MenuModel> getAllMenus() {
        return menuRepository.findAll();
    }

    @Override
    @Transactional
    public MenuModel createMenu(MenuModel menu) {
        return menuRepository.save(menu);
    }
}
