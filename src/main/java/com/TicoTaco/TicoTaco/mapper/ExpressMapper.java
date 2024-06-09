package com.TicoTaco.TicoTaco.mapper;

import com.TicoTaco.TicoTaco.Repository.ContactoRepository;
import com.TicoTaco.TicoTaco.Repository.EmpresaExpressRepository;
import com.TicoTaco.TicoTaco.dto.ExpressDTO;
import com.TicoTaco.TicoTaco.model.ContactoModel;
import com.TicoTaco.TicoTaco.model.EmpresaExpressModel;
import com.TicoTaco.TicoTaco.model.ExpressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExpressMapper {

    @Autowired
    private EmpresaExpressRepository empresaExpressRepository;

    @Autowired
    private ContactoRepository contactoRepository;

    public ExpressModel toEntity(ExpressDTO dto) {
        ExpressModel express = new ExpressModel();
        express.setExpressId(dto.getExpressId());
        express.setNombreEncargado(dto.getNombreEncargado());
        express.setHoraRetiro(dto.getHoraRetiro());
        express.setHoraEntrega(dto.getHoraEntrega());

        if (dto.getEmpresaExpressId() != null) {
            EmpresaExpressModel empresaExpress = empresaExpressRepository.findById(dto.getEmpresaExpressId()).orElse(null);
            express.setEmpresaExpressId(empresaExpress);
        }

        if (dto.getContactoId() != null) {
            ContactoModel contacto = contactoRepository.findById(dto.getContactoId()).orElse(null);
            express.setContactoId(contacto);
        }

        return express;
    }

    public ExpressDTO toDto(ExpressModel express) {
        Long empresaExpressId = express.getEmpresaExpressId() != null ? express.getEmpresaExpressId().getEmpresaExpressId() : null;
        Long contactoId = express.getContactoId() != null ? express.getContactoId().getContactoId() : null;

        return new ExpressDTO(
                express.getExpressId(),
                express.getNombreEncargado(),
                express.getHoraRetiro(),
                express.getHoraEntrega(),
                empresaExpressId,
                contactoId
        );
    }

    public List<ExpressDTO> toDtoList(List<ExpressModel> expresses) {
        return expresses.stream().map(this::toDto).collect(Collectors.toList());
    }
}

