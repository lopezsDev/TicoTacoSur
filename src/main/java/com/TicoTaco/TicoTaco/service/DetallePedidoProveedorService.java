package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.DetallePedidoProveedorRepository;
import com.TicoTaco.TicoTaco.model.DetallePedidoProveedorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallePedidoProveedorService {

    private final DetallePedidoProveedorRepository detallePedidoProveedorRepository;

    @Autowired
    public DetallePedidoProveedorService(DetallePedidoProveedorRepository detallePedidoProveedorRepository) {
        this.detallePedidoProveedorRepository = detallePedidoProveedorRepository;
    }

    public List<DetallePedidoProveedorModel> getAllDetallePedidoProveedores() {
        return detallePedidoProveedorRepository.findAll();
    }

    public Optional<DetallePedidoProveedorModel> getDetallePedidoProveedorById(Long id) {
        return detallePedidoProveedorRepository.findById(id);
    }

    public DetallePedidoProveedorModel createDetallePedidoProveedor(DetallePedidoProveedorModel detallePedidoProveedor) {
        return detallePedidoProveedorRepository.save(detallePedidoProveedor);
    }

    public DetallePedidoProveedorModel updateDetallePedidoProveedor(long id, DetallePedidoProveedorModel detallePedidoProveedorDetails) {
        DetallePedidoProveedorModel detallePedidoProveedor = detallePedidoProveedorRepository.findById(id).orElse(null);

        if (detallePedidoProveedor != null) {
            detallePedidoProveedor.setCantidad(detallePedidoProveedorDetails.getCantidad());
            detallePedidoProveedor.setPrecioUnitario(detallePedidoProveedorDetails.getPrecioUnitario());
            detallePedidoProveedor.setBodega(detallePedidoProveedorDetails.getBodega());

            return detallePedidoProveedorRepository.save(detallePedidoProveedor);
        } else {
            return null;
        }
    }

    public void deleteDetallePedidoProveedor(Long id) {
        detallePedidoProveedorRepository.deleteById(id);
    }
}
