package com.TicoTaco.TicoTaco.mapper;

import com.TicoTaco.TicoTaco.Repository.ComboRepository;
import com.TicoTaco.TicoTaco.Repository.MonedaRepository;
import com.TicoTaco.TicoTaco.Repository.ProductoRepository;
import com.TicoTaco.TicoTaco.dto.MenuDTO;
import com.TicoTaco.TicoTaco.model.ComboModel;
import com.TicoTaco.TicoTaco.model.MenuModel;
import com.TicoTaco.TicoTaco.model.MonedaModel;
import com.TicoTaco.TicoTaco.model.ProductoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MenuMapper {

    @Autowired
    private MonedaRepository monedaRepository;

    @Autowired
    private ComboRepository comboRepository;

    @Autowired
    private ProductoRepository productoRepository;

    public MenuModel toEntity(MenuDTO dto) {
        MenuModel menu = new MenuModel();
        menu.setMenuId(dto.getMenuId());
        menu.setNombreMenu(dto.getNombreMenu());
        menu.setDescripcion(dto.getDescripcion());
        menu.setPrecio(dto.getPrecio());

        if (dto.getMonedaId() != null) {
            MonedaModel moneda = monedaRepository.findById(dto.getMonedaId()).orElse(null);
            menu.setMonedaId(moneda);
        }

        if (dto.getComboId() != null) {
            ComboModel combo = comboRepository.findById(dto.getComboId()).orElse(null);
            menu.setComboId(combo);
        }

        if (dto.getProductoId() != null) {
            ProductoModel producto = productoRepository.findById(dto.getProductoId()).orElse(null);
            menu.setProductoId(producto);
        }

        return menu;
    }

    public MenuDTO toDto(MenuModel menu) {
        Long monedaId = menu.getMonedaId() != null ? menu.getMonedaId().getMonedaId() : null;
        Long comboId = menu.getComboId() != null ? menu.getComboId().getComboId() : null;
        Long productoId = menu.getProductoId() != null ? menu.getProductoId().getProductoId() : null;

        return new MenuDTO(
                menu.getMenuId(),
                menu.getNombreMenu(),
                menu.getDescripcion(),
                menu.getPrecio(),
                monedaId,
                comboId,
                productoId
        );
    }

    public List<MenuDTO> toDtoList(List<MenuModel> menus) {
        return menus.stream().map(this::toDto).collect(Collectors.toList());
    }
}
