package com.jardininfantil.web_institucional.dto.encuesta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaEncuestaRequest {

    @NotNull(message = "El ID de la encuesta es requerido")
    private Long encuestaId;

    private Long acudienteId; // Null si es anónima

    @NotBlank(message = "Las respuestas son requeridas")
    private String respuestas; // JSON string con las respuestas
}
