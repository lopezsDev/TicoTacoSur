package com.TicoTaco.TicoTaco.mapper;

import com.TicoTaco.TicoTaco.Repository.DetallesFacturaRepository;
import com.TicoTaco.TicoTaco.Repository.MonedaRepository;
import com.TicoTaco.TicoTaco.Repository.PedidoClienteRepository;
import com.TicoTaco.TicoTaco.Repository.SucursalRepository;
import com.TicoTaco.TicoTaco.dto.*;
import com.TicoTaco.TicoTaco.exceptions.ResourceNotFoundException;
import com.TicoTaco.TicoTaco.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class FacturaMapper {

    @Autowired
    private SucursalRepository sucursalRepository;

    @Autowired
    private PedidoClienteRepository pedidoClienteRepository;

    @Autowired
    private MonedaRepository monedaRepository;

    public FacturaModel toEntity(FacturaDTO dto) {
        FacturaModel factura = new FacturaModel();
        factura.setFechaPedido(dto.getFechaPedido());
        factura.setMontoTotal(dto.getMontoTotal());

        if (dto.getSucursalId() != null) {
            factura.setSucursalId(sucursalRepository.findById(dto.getSucursalId()).orElse(null));
        }

        if (dto.getPedidoClienteId() != null) {
            factura.setPedidoClienteId(pedidoClienteRepository.findById(dto.getPedidoClienteId()).orElse(null));
        }

        if (dto.getMonedaId() != null) {
            factura.setMonedaId(monedaRepository.findById(dto.getMonedaId()).orElse(null));
        }

        Set<DetallesFacturaModel> detallesFacturaSet = dto.getDetalles().stream()
                .map(detalleDTO -> {
                    DetallesFacturaModel detallesFactura = new DetallesFacturaModel();
                    detallesFactura.setCantidad(detalleDTO.getCantidad());
                    detallesFactura.setPrecioLinea(detalleDTO.getPrecioLinea());
                    detallesFactura.setObservaciones(detalleDTO.getObservaciones());
                    detallesFactura.setFacturaId(factura); // Relación bidireccional
                    return detallesFactura;
                }).collect(Collectors.toSet());
        factura.setDetalles(detallesFacturaSet);

        return factura;
    }

    public FacturaDTO toDto(FacturaModel factura) {
        List<DetallesFacturaDTO> detallesFacturaDTOList = factura.getDetalles().stream()
                .map(detallesFactura -> new DetallesFacturaDTO(
                        detallesFactura.getDetalleFacturaId(),
                        detallesFactura.getCantidad(),
                        detallesFactura.getPrecioLinea(),
                        detallesFactura.getObservaciones()
                )).collect(Collectors.toList());

        Long sucursalId = factura.getSucursalId() != null ? factura.getSucursalId().getSucursalId() : null;
        Long pedidoClienteId = factura.getPedidoClienteId() != null ? factura.getPedidoClienteId().getPedidoClienteId() : null;
        Long monedaId = factura.getMonedaId() != null ? factura.getMonedaId().getMonedaId() : null;

        return new FacturaDTO(
                factura.getFacturaId(),
                factura.getFechaPedido(),
                factura.getMontoTotal(),
                detallesFacturaDTOList,
                sucursalId,
                pedidoClienteId,
                monedaId
        );
    }

    public List<FacturaDTO> toDtoList(List<FacturaModel> facturas) {
        return facturas.stream().map(this::toDto).collect(Collectors.toList());
    }
}

