package com.TicoTaco.TicoTaco.mapper;

import com.TicoTaco.TicoTaco.Repository.ContactoRepository;
import com.TicoTaco.TicoTaco.Repository.PermisoRepository;
import com.TicoTaco.TicoTaco.Repository.PlanillaRepository;
import com.TicoTaco.TicoTaco.Repository.PuestoRepository;
import com.TicoTaco.TicoTaco.dto.EmpleadoDTO;
import com.TicoTaco.TicoTaco.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmpleadoMapper {

    @Autowired
    private PuestoRepository puestoRepository;

    @Autowired
    private ContactoRepository contactoRepository;

    @Autowired
    private PlanillaRepository planillaRepository;

    @Autowired
    private PermisoRepository permisoRepository;

    public EmpleadoModel toEntity(EmpleadoDTO dto) {
        EmpleadoModel empleado = new EmpleadoModel();
        empleado.setEmpleadoId(dto.getEmpleadoId());
        empleado.setNombreEmpleado(dto.getNombreEmpleado());
        empleado.setApellidoEmpleado(dto.getApellidoEmpleado());
        empleado.setFechaContratacion(dto.getFechaContratacion());

        if (dto.getPuestoId() != null) {
            PuestoModel puesto = puestoRepository.findById(dto.getPuestoId()).orElse(null);
            empleado.setPuestoId(puesto);
        }

        if (dto.getContactoId() != null) {
            ContactoModel contacto = contactoRepository.findById(dto.getContactoId()).orElse(null);
            empleado.setContactoId(contacto);
        }

        if (dto.getPlanillaId() != null) {
            PlanillaModel planilla = planillaRepository.findById(dto.getPlanillaId()).orElse(null);
            empleado.setPlanillaId(planilla);
        }

        if (dto.getPermisoId() != null) {
            PermisoModel permiso = permisoRepository.findById(dto.getPermisoId()).orElse(null);
            empleado.setPermisoId(permiso);
        }

        return empleado;
    }

    public EmpleadoDTO toDto(EmpleadoModel empleado) {
        Long puestoId = empleado.getPuestoId() != null ? empleado.getPuestoId().getPuestoId() : null;
        Long contactoId = empleado.getContactoId() != null ? empleado.getContactoId().getContactoId() : null;
        Long planillaId = empleado.getPlanillaId() != null ? empleado.getPlanillaId().getPlanillaId() : null;
        Long permisoId = empleado.getPermisoId() != null ? empleado.getPermisoId().getPermisoId() : null;

        return new EmpleadoDTO(
                empleado.getEmpleadoId(),
                empleado.getNombreEmpleado(),
                empleado.getApellidoEmpleado(),
                empleado.getFechaContratacion(),
                puestoId,
                contactoId,
                planillaId,
                permisoId
        );
    }

    public List<EmpleadoDTO> toDtoList(List<EmpleadoModel> empleados) {
        return empleados.stream().map(this::toDto).collect(Collectors.toList());
    }
}
