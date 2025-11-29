package com.jardininfantil.web_institucional.dto.matricula;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaResponse {
    private Long idMatricula;
    private Long estudianteId;
    private String nombreEstudiante;
    private LocalDate fecha;
    private String grado;
    private BigDecimal valorTotal;
    private BigDecimal contratoFirmado;
    private String estadoMatricula;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
