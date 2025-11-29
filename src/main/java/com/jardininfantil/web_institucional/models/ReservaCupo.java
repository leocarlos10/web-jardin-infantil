package com.jardininfantil.web_institucional.models;

import com.jardininfantil.web_institucional.models.enums.EstadoReserva;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservaCupo {
    private Long idReserva;
    private Long estudianteId;
    private String gradoSolicitado;
    private EstadoReserva estadoReserva;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
