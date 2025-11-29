package com.jardininfantil.web_institucional.dto.retiro;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RetiroRequest {

    @NotNull(message = "El ID de la matrícula es requerido")
    private Long matriculaId;

    @NotNull(message = "La fecha de solicitud es requerida")
    private LocalDate fechaSolicitud;

    @NotBlank(message = "El motivo es requerido")
    private String motivo;

    private String observaciones;
}
