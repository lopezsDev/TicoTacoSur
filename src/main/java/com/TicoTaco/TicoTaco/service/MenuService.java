package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.MenuRepository;
import com.TicoTaco.TicoTaco.model.MenuModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.List;

public interface MenuService {
    List<MenuModel> getAllMenus();
    MenuModel createMenu(MenuModel menu);
}
