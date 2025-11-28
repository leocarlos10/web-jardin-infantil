package com.jardininfantil.web_institucional.dto.caracterizacion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CaracterizacionResponse {
    private Long idCaracterizacion;
    private Long estudianteId;
    private String nombreEstudiante;
    private String condicionesMedicas;
    private String alergias;
    private String medicamentos;
    private String contactoEmergencia;
    private String telefonoEmergencia;
    private String eps;
    private String tipoSangre;
    private String observaciones;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
