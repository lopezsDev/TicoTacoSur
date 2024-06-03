package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.model.MenuModel;
import com.TicoTaco.TicoTaco.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/menus")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public List<MenuModel> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/{id}")
    public Optional<MenuModel> getMenuById(@PathVariable Long id) {
        return menuService.getMenuById(id);
    }

    @PostMapping
    public MenuModel createMenu(@RequestBody MenuModel menu) {
        return menuService.createMenu(menu);
    }

    @PutMapping("/{id}")
    public MenuModel updateMenu(@PathVariable Long id, @RequestBody MenuModel menuDetails) {
        return menuService.updateMenu(id, menuDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable Long id) {
        menuService.deleteMenu(id);
    }
}