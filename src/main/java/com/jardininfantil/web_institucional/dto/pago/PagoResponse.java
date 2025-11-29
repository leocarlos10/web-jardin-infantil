package com.jardininfantil.web_institucional.dto.pago;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PagoResponse {
    private Long idPago;
    private Long matriculaId;
    private LocalDate fechaPago;
    private BigDecimal monto;
    private String metodoPago;
    private String referencia;
    private String estadoPago;
    private String comprobante;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
