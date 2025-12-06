package com.jardininfantil.web_institucional.models;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Acudiente {
    private Long acudienteId;
    private Long usuarioId;
    private String nombre;
    private String segundoNombre; 
    private String apellido;
    private String segundoApellido; 
    private String tipoDocumento;
    private String numeroDocumento;
    private String telefono;
    private String correo;
    private String direccion;
    private String ocupacion;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
