package com.jardininfantil.web_institucional.repository;

import com.jardininfantil.web_institucional.models.Acudiente;

import java.util.List;
import java.util.Optional;

public interface AcudienteRepository {
    Acudiente save(Acudiente acudiente);

    Optional<Acudiente> findById(Long id);

    List<Acudiente> findAll();

    Optional<Acudiente> findByUsuarioId(Long usuarioId);

    Optional<Acudiente> findByNumeroDocumento(String numeroDocumento);

    void update(Acudiente acudiente);

    void deleteById(Long id);
}
