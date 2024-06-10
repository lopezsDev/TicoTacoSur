package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.SucursalRepository;
import com.TicoTaco.TicoTaco.dto.SucursalDTO;
import com.TicoTaco.TicoTaco.exceptions.ResourceNotFoundException;
import com.TicoTaco.TicoTaco.mapper.SucursalMapper;
import com.TicoTaco.TicoTaco.model.SucursalModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SucursalServiceImpl implements SucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    @Autowired
    private SucursalMapper sucursalMapper;

    @Override
    @Transactional(readOnly = true)
    public List<SucursalDTO> getAllSucursales() {
        return sucursalRepository.findAll().stream()
                .map(sucursalMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public SucursalDTO getSucursalById(Long id) {
        return sucursalRepository.findById(id)
                .map(sucursalMapper::toDto)
                .orElseThrow(() -> new ResourceNotFoundException("Sucursal not found with id: " + id));
    }

    @Override
    @Transactional
    public SucursalDTO createSucursal(SucursalDTO sucursalDTO) {
        SucursalModel sucursal = sucursalMapper.toEntity(sucursalDTO);
        return sucursalMapper.toDto(sucursalRepository.save(sucursal));
    }

    @Override
    @Transactional
    public SucursalDTO updateSucursal(Long id, SucursalDTO sucursalDTO) {
        if (!sucursalRepository.existsById(id)) {
            throw new ResourceNotFoundException("Sucursal not found with id: " + id);
        }
        SucursalModel sucursal = sucursalMapper.toEntity(sucursalDTO);
        sucursal.setSucursalId(id);
        return sucursalMapper.toDto(sucursalRepository.save(sucursal));
    }

    @Override
    @Transactional
    public void deleteSucursal(Long id) {
        if (!sucursalRepository.existsById(id)) {
            throw new ResourceNotFoundException("Sucursal not found with id: " + id);
        }
        sucursalRepository.deleteById(id);
    }
}
