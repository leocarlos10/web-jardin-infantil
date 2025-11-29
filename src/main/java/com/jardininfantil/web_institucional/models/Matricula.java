package com.jardininfantil.web_institucional.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.jardininfantil.web_institucional.models.enums.EstadoMatricula;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matricula {
    private Long idMatricula;
    private Long estudianteId;
    private LocalDate fecha;
    private String grado;
    private BigDecimal valorTotal;
    private BigDecimal contratoFirmado;
    private EstadoMatricula estadoMatricula;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
