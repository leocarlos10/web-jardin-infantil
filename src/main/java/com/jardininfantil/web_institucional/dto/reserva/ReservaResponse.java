package com.jardininfantil.web_institucional.dto.reserva;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservaResponse {
    private Long idReserva;
    private Long estudianteId;
    private String nombreEstudiante;
    private String estadoReserva;
    private String gradoSolicitado;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
