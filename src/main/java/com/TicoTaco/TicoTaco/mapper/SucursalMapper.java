package com.TicoTaco.TicoTaco.mapper;

import com.TicoTaco.TicoTaco.Repository.CajasRepository;
import com.TicoTaco.TicoTaco.Repository.ContactoRepository;
import com.TicoTaco.TicoTaco.Repository.DireccionRepository;
import com.TicoTaco.TicoTaco.dto.SucursalDTO;
import com.TicoTaco.TicoTaco.model.SucursalModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SucursalMapper {

    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private ContactoRepository contactoRepository;

    @Autowired
    private CajasRepository cajasRepository;

    public SucursalModel toEntity(SucursalDTO dto) {
        SucursalModel sucursal = new SucursalModel();
        sucursal.setSucursalId(dto.getSucursalId());
        sucursal.setNombreSucursal(dto.getNombreSucursal());

        if (dto.getDireccionId() != null) {
            sucursal.setDireccionId(direccionRepository.findById(dto.getDireccionId()).orElse(null));
        }

        if (dto.getContactoId() != null) {
            sucursal.setContactoId(contactoRepository.findById(dto.getContactoId()).orElse(null));
        }

        if (dto.getCajasId() != null) {
            sucursal.setCajaId(cajasRepository.findById(dto.getCajasId()).orElse(null));
        }

        return sucursal;
    }

    public SucursalDTO toDto(SucursalModel sucursal) {
        Long direccionId = sucursal.getDireccionId() != null ? sucursal.getDireccionId().getDireccionId() : null;
        Long contactoId = sucursal.getContactoId() != null ? sucursal.getContactoId().getContactoId() : null;
        Long cajaId = sucursal.getCajaId() != null ? sucursal.getCajaId().getCajasId() : null;

        return new SucursalDTO(
                sucursal.getSucursalId(),
                sucursal.getNombreSucursal(),
                direccionId,
                contactoId,
                cajaId
        );
    }
}

