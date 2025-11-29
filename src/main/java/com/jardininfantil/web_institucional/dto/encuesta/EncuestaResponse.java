package com.jardininfantil.web_institucional.dto.encuesta;

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
public class EncuestaResponse {
    private Long idEncuesta;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String preguntas;
    private Boolean anonima;
    private Boolean activa;
    private Integer totalRespuestas;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
