package com.jardininfantil.web_institucional.dto.retiro;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RetiroResponse {
    private Long idRetiro;
    private Long matriculaId;
    private String nombreEstudiante;
    private LocalDate fechaSolicitud;
    private LocalDate fechaProceso;
    private String motivo;
    private String observaciones;
    private String estado;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
