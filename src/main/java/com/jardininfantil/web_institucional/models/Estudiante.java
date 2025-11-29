package com.jardininfantil.web_institucional.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    private Long estudianteId;
    private Long acudienteId;
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
