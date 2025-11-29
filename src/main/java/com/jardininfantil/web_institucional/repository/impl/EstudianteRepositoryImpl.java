package com.jardininfantil.web_institucional.repository.impl;

import com.jardininfantil.web_institucional.models.Estudiante;
import com.jardininfantil.web_institucional.repository.EstudianteRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

@Repository
public class EstudianteRepositoryImpl implements EstudianteRepository {

    private final JdbcTemplate jdbcTemplate;

    public EstudianteRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Estudiante> rowMapper = (rs, rowNum) -> {
        Estudiante estudiante = new Estudiante();
        estudiante.setEstudianteId(rs.getLong("estudiante_id"));
        estudiante.setAcudienteId(rs.getLong("acudiente_id"));
        estudiante.setNombre(rs.getString("nombre"));
        estudiante.setApellido(rs.getString("apellido"));
        estudiante.setFechaNacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
        estudiante.setTipoDocumento(rs.getString("tipo_documento"));
        estudiante.setNumeroDocumento(rs.getString("numero_documento"));
        estudiante.setGenero(rs.getString("genero"));
        estudiante.setDireccion(rs.getString("direccion"));
        estudiante.setTelefono(rs.getString("telefono"));
        estudiante.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        estudiante.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        return estudiante;
    };

    @Override
    public Estudiante save(Estudiante estudiante) {
        String sql = "INSERT INTO estudiante (acudiente_id, nombre, apellido, fecha_nacimiento, tipo_documento, numero_documento, genero, direccion, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, estudiante.getAcudienteId());
            ps.setString(2, estudiante.getNombre());
            ps.setString(3, estudiante.getApellido());
            ps.setDate(4, Date.valueOf(estudiante.getFechaNacimiento()));
            ps.setString(5, estudiante.getTipoDocumento());
            ps.setString(6, estudiante.getNumeroDocumento());
            ps.setString(7, estudiante.getGenero());
            ps.setString(8, estudiante.getDireccion());
            ps.setString(9, estudiante.getTelefono());
            return ps;
        }, keyHolder);

        estudiante.setEstudianteId(keyHolder.getKey().longValue());
        return estudiante;
    }

    @Override
    public Optional<Estudiante> findById(Long id) {
        String sql = "SELECT * FROM estudiante WHERE estudiante_id = ?";
        List<Estudiante> estudiantes = jdbcTemplate.query(sql, rowMapper, id);
        return estudiantes.isEmpty() ? Optional.empty() : Optional.of(estudiantes.get(0));
    }

    @Override
    public List<Estudiante> findAll() {
        String sql = "SELECT * FROM estudiante ORDER BY created_at DESC";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public List<Estudiante> findByAcudienteId(Long acudienteId) {
        String sql = "SELECT * FROM estudiante WHERE acudiente_id = ? ORDER BY created_at DESC";
        return jdbcTemplate.query(sql, rowMapper, acudienteId);
    }

    @Override
    public Optional<Estudiante> findByNumeroDocumento(String numeroDocumento) {
        String sql = "SELECT * FROM estudiante WHERE numero_documento = ?";
        List<Estudiante> estudiantes = jdbcTemplate.query(sql, rowMapper, numeroDocumento);
        return estudiantes.isEmpty() ? Optional.empty() : Optional.of(estudiantes.get(0));
    }

    @Override
    public void update(Estudiante estudiante) {
        String sql = "UPDATE estudiante SET nombre = ?, apellido = ?, fecha_nacimiento = ?, tipo_documento = ?, numero_documento = ?, genero = ?, direccion = ?, telefono = ? WHERE estudiante_id = ?";
        jdbcTemplate.update(sql,
                estudiante.getNombre(),
                estudiante.getApellido(),
                Date.valueOf(estudiante.getFechaNacimiento()),
                estudiante.getTipoDocumento(),
                estudiante.getNumeroDocumento(),
                estudiante.getGenero(),
                estudiante.getDireccion(),
                estudiante.getTelefono(),
                estudiante.getEstudianteId());
    }

    @Override
    public void deleteById(Long id) {
        String sql = "DELETE FROM estudiante WHERE estudiante_id = ?";
        jdbcTemplate.update(sql, id);
    }
}
