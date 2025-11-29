package com.jardininfantil.web_institucional.dto.estudiante;

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
public class EstudianteResponse {
    private Long estudianteId;
    private Long acudienteId;
    private String nombreAcudiente;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String tipoDocumento;
    private String numeroDocumento;
    private String genero;
    private String direccion;
    private String telefono;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
