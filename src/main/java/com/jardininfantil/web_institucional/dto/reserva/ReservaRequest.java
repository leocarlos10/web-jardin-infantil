package com.jardininfantil.web_institucional.dto.reserva;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservaRequest {

    @NotNull(message = "El ID del estudiante es requerido")
    private Long estudianteId;

    @NotBlank(message = "El grado solicitado es requerido")
    private String gradoSolicitado;
}
