package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.dto.MenuDTO;
import com.TicoTaco.TicoTaco.mapper.MenuMapper;
import com.TicoTaco.TicoTaco.model.MenuModel;
import com.TicoTaco.TicoTaco.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @Autowired
    private MenuMapper menuMapper;

    @GetMapping
    public ResponseEntity<List<MenuDTO>> getAllMenus() {
        List<MenuModel> menus = menuService.getAllMenus();
        List<MenuDTO> menusDTO = menus.stream()
                .map(menuMapper::toDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(menusDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MenuDTO> createMenu(@RequestBody MenuDTO menuDTO) {
        MenuModel menu = menuMapper.toEntity(menuDTO);
        MenuModel createdMenu = menuService.createMenu(menu);
        return new ResponseEntity<>(menuMapper.toDto(createdMenu), HttpStatus.CREATED);
    }
}
