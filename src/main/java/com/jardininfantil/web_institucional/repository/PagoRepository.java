package com.jardininfantil.web_institucional.repository;

import com.jardininfantil.web_institucional.models.PagoMatricula;

import java.util.List;
import java.util.Optional;

public interface PagoRepository {
    PagoMatricula save(PagoMatricula pago);

    Optional<PagoMatricula> findById(Long id);

    List<PagoMatricula> findAll();

    List<PagoMatricula> findByMatriculaId(Long matriculaId);

    List<PagoMatricula> findByEstadoPago(String estado);

    void update(PagoMatricula pago);

    void deleteById(Long id);
}
