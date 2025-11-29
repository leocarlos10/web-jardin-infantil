package com.jardininfantil.web_institucional.dto.acudiente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcudienteRequest {

    @NotNull(message = "El ID del usuario es requerido")
    private Long usuarioId;

    @NotBlank(message = "El nombre es requerido")
    private String nombre;

    @NotBlank(message = "El apellido es requerido")
    private String apellido;

    @NotBlank(message = "El tipo de documento es requerido")
    private String tipoDocumento;

    @NotBlank(message = "El número de documento es requerido")
    private String numeroDocumento;

    @NotBlank(message = "El teléfono es requerido")
    private String telefono;

    @Email(message = "El correo debe ser válido")
    @NotBlank(message = "El correo es requerido")
    private String correo;

    private String direccion;

    private String ocupacion;
}
