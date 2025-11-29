package com.jardininfantil.web_institucional.dto.caracterizacion;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaracterizacionRequest {

    @NotNull(message = "El ID del estudiante es requerido")
    private Long estudianteId;

    private String condicionesMedicas;

    private String alergias;

    private String medicamentos;

    private String contactoEmergencia;

    private String telefonoEmergencia;

    private String eps;

    private String tipoSangre;

    private String observaciones;
}
