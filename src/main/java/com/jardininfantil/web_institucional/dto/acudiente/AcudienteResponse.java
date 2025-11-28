package com.jardininfantil.web_institucional.dto.acudiente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcudienteResponse {
    private Long acudienteId;
    private Long usuarioId;
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String numeroDocumento;
    private String telefono;
    private String correo;
    private String direccion;
    private String ocupacion;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
