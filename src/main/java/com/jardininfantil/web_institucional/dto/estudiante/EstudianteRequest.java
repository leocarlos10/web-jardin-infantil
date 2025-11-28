package com.jardininfantil.web_institucional.dto.estudiante;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteRequest {

    @NotNull(message = "El ID del acudiente es requerido")
    private Long acudienteId;

    @NotBlank(message = "El nombre es requerido")
    private String nombre;

    @NotBlank(message = "El apellido es requerido")
    private String apellido;

    @NotNull(message = "La fecha de nacimiento es requerida")
    private LocalDate fechaNacimiento;

    @NotBlank(message = "El tipo de documento es requerido")
    private String tipoDocumento;

    @NotBlank(message = "El número de documento es requerido")
    private String numeroDocumento;

    @NotBlank(message = "El género es requerido")
    private String genero;

    private String direccion;

    private String telefono;
}
