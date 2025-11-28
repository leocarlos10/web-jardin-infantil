package com.jardininfantil.web_institucional.repository;

import com.jardininfantil.web_institucional.models.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteRepository {
    Estudiante save(Estudiante estudiante);

    Optional<Estudiante> findById(Long id);

    List<Estudiante> findAll();

    List<Estudiante> findByAcudienteId(Long acudienteId);

    Optional<Estudiante> findByNumeroDocumento(String numeroDocumento);

    void update(Estudiante estudiante);

    void deleteById(Long id);
}
