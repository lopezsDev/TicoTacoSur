package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.AdminRestauranteRepository;
import com.TicoTaco.TicoTaco.model.AdminRestauranteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminRestauranteService {

    private final AdminRestauranteRepository adminRestauranteRepository;

    @Autowired
    public AdminRestauranteService(AdminRestauranteRepository adminRestauranteRepository) {
        this.adminRestauranteRepository = adminRestauranteRepository;
    }

    // Obtener todos los elementos
    public List<AdminRestauranteModel> getAllAdminRestaurantes() {
        return adminRestauranteRepository.findAll();
    }

    // Obtener un elemento por su ID
    public Optional<AdminRestauranteModel> getAdminRestauranteById(Long id) {
        return adminRestauranteRepository.findById(id);
    }

    // Crear un nuevo elemento
    public AdminRestauranteModel createAdminRestaurante(AdminRestauranteModel adminRestaurante) {
        return adminRestauranteRepository.save(adminRestaurante);
    }

    // Actualizar un elemento existente
    public AdminRestauranteModel updateAdminRestaurante(Long id, AdminRestauranteModel adminRestauranteDetails) {
        AdminRestauranteModel adminRestaurante = adminRestauranteRepository.findById(id).orElse(null);

        if (adminRestaurante != null) {
            adminRestaurante.setGanancias(adminRestauranteDetails.getGanancias());
            adminRestaurante.setPerdidas(adminRestauranteDetails.getPerdidas());
            adminRestaurante.setSucursal(adminRestauranteDetails.getSucursal());
            adminRestaurante.setCostosOperativos(adminRestauranteDetails.getCostosOperativos());

            return adminRestauranteRepository.save(adminRestaurante);
        } else {
            return null; // Manejo de error si no se encuentra el elemento
        }
    }

    // Eliminar un elemento existente
    public void deleteAdminRestaurante(Long id) {
        adminRestauranteRepository.deleteById(id);
    }
}
