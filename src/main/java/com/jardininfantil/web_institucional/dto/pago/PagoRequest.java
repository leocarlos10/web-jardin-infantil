package com.jardininfantil.web_institucional.dto.pago;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoRequest {

    @NotNull(message = "El ID de la matrícula es requerido")
    private Long matriculaId;

    @NotNull(message = "La fecha de pago es requerida")
    private LocalDate fechaPago;

    @NotNull(message = "El monto es requerido")
    @Positive(message = "El monto debe ser positivo")
    private BigDecimal monto;

    @NotBlank(message = "El método de pago es requerido")
    private String metodoPago;

    private String referencia;

    private String comprobante;
}
