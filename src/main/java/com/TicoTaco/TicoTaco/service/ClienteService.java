package com.TicoTaco.TicoTaco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ClienteService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ClienteService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> buscarClientes(String consulta) {
        String sql = "SELECT C_CLIENTE, D_NOMBRE_CLIENTE, D_APELLIDO_CLIENTE " +
                "FROM CLIENTE " +
                "WHERE D_NOMBRE_CLIENTE LIKE ? OR D_APELLIDO_CLIENTE LIKE ?";
        return jdbcTemplate.queryForList(sql, "%" + consulta + "%", "%" + consulta + "%");
    }
}