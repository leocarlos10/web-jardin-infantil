package com.jardininfantil.web_institucional.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.jardininfantil.web_institucional.models.enums.EstadoPago;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagoMatricula {
    private Long idPago;
    private Long matriculaId;
    private LocalDate fechaPago;
    private BigDecimal monto;
    private String metodoPago;
    private String referencia;
    private EstadoPago estadoPago;
    private String comprobante;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
