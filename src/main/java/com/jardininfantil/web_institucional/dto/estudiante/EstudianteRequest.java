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

    private String segundoNombre;

    @NotBlank(message = "El primer apellido es requerido")
    private String primerApellido;

    private String segundoApellido;

    private String numeroRegistroCivil;

    private LocalDate fechaExp;

    @NotNull(message = "La fecha de nacimiento es requerida")
    private LocalDate fechaNacimiento;

    private Integer tipoSangre;

    @NotBlank(message = "El sexo es requerido")
    private String sexo;

    private String correoPadres;

    private Integer edad;

    private String lugarNacimiento;

    private String municipio;

    private String departamento;

    private String direccion;

    private String barrio;

    private String tipoEstudiante;
}
