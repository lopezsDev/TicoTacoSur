package com.TicoTaco.TicoTaco.service;


import com.TicoTaco.TicoTaco.Repository.ClienteRepository;
import com.TicoTaco.TicoTaco.model.ClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import java.sql.Types;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    private final JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall jdbcCall;

    @Autowired
    public ClienteService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.jdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("BuscarClientesPorNombreApellido")
                .declareParameters(new SqlParameter("consulta", Types.NVARCHAR));
    }

    public List<Map<String, Object>> buscarClientes(String consulta) {
        System.out.println("Buscando clientes con consulta: " + consulta);
        Map<String, Object> paramMap = Collections.singletonMap("consulta", consulta);
        Map<String, Object> resultMap = jdbcCall.execute(paramMap);

        System.out.println("Resultado del procedimiento almacenado: " + resultMap);

        // Los resultados están bajo la clave "#result-set-1" si solo hay un conjunto de resultados
        List<Map<String, Object>> resultList = (List<Map<String, Object>>) resultMap.get("#result-set-1");
        System.out.println("Lista de resultados: " + resultList);

        return resultList;
    }
    public List<ClienteModel> getAllClientes() {
        return clienteRepository.findAll();
    }

    public ClienteModel getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public ClienteModel createCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }

    public ClienteModel updateCliente(Long id, ClienteModel clienteDetails) {
        ClienteModel cliente = clienteRepository.findById(id).orElse(null);
        if (cliente != null) {
            cliente.setNombreCliente(clienteDetails.getNombreCliente());
            cliente.setApellidoCliente(clienteDetails.getApellidoCliente());
            cliente.setFrecuenciaId(clienteDetails.getFrecuenciaId());
            return clienteRepository.save(cliente);
        }
        return null;
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
