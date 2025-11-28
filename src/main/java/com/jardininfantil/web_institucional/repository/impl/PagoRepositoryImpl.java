package com.jardininfantil.web_institucional.repository.impl;

import com.jardininfantil.web_institucional.models.PagoMatricula;
import com.jardininfantil.web_institucional.models.enums.EstadoPago;
import com.jardininfantil.web_institucional.repository.PagoRepository;
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
public class PagoRepositoryImpl implements PagoRepository {

    private final JdbcTemplate jdbcTemplate;

    public PagoRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<PagoMatricula> rowMapper = (rs, rowNum) -> {
        PagoMatricula pago = new PagoMatricula();
        pago.setIdPago(rs.getLong("id_pago"));
        pago.setMatriculaId(rs.getLong("matricula_id"));
        pago.setFechaPago(rs.getDate("fecha_pago").toLocalDate());
        pago.setMonto(rs.getBigDecimal("monto"));
        pago.setMetodoPago(rs.getString("metodo_pago"));
        pago.setReferencia(rs.getString("referencia"));
        pago.setEstadoPago(EstadoPago.valueOf(rs.getString("estado_pago")));
        pago.setComprobante(rs.getString("comprobante"));
        pago.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        pago.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        return pago;
    };

    @Override
    public PagoMatricula save(PagoMatricula pago) {
        String sql = "INSERT INTO pago_matricula (matricula_id, fecha_pago, monto, metodo_pago, referencia, estado_pago, comprobante) VALUES (?, ?, ?, ?, ?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, pago.getMatriculaId());
            ps.setDate(2, Date.valueOf(pago.getFechaPago()));
            ps.setBigDecimal(3, pago.getMonto());
            ps.setString(4, pago.getMetodoPago());
            ps.setString(5, pago.getReferencia());
            ps.setString(6, pago.getEstadoPago().name());
            ps.setString(7, pago.getComprobante());
            return ps;
        }, keyHolder);

        pago.setIdPago(keyHolder.getKey().longValue());
        return pago;
    }

    @Override
    public Optional<PagoMatricula> findById(Long id) {
        String sql = "SELECT * FROM pago_matricula WHERE id_pago = ?";
        List<PagoMatricula> pagos = jdbcTemplate.query(sql, rowMapper, id);
        return pagos.isEmpty() ? Optional.empty() : Optional.of(pagos.get(0));
    }

    @Override
    public List<PagoMatricula> findAll() {
        String sql = "SELECT * FROM pago_matricula ORDER BY created_at DESC";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public List<PagoMatricula> findByMatriculaId(Long matriculaId) {
        String sql = "SELECT * FROM pago_matricula WHERE matricula_id = ? ORDER BY fecha_pago DESC";
        return jdbcTemplate.query(sql, rowMapper, matriculaId);
    }

    @Override
    public List<PagoMatricula> findByEstadoPago(String estado) {
        String sql = "SELECT * FROM pago_matricula WHERE estado_pago = ? ORDER BY created_at DESC";
        return jdbcTemplate.query(sql, rowMapper, estado);
    }

    @Override
    public void update(PagoMatricula pago) {
        String sql = "UPDATE pago_matricula SET fecha_pago = ?, monto = ?, metodo_pago = ?, referencia = ?, estado_pago = ?, comprobante = ? WHERE id_pago = ?";
        jdbcTemplate.update(sql,
                Date.valueOf(pago.getFechaPago()),
                pago.getMonto(),
                pago.getMetodoPago(),
                pago.getReferencia(),
                pago.getEstadoPago().name(),
                pago.getComprobante(),
                pago.getIdPago());
    }

    @Override
    public void deleteById(Long id) {
        String sql = "DELETE FROM pago_matricula WHERE id_pago = ?";
        jdbcTemplate.update(sql, id);
    }
}
