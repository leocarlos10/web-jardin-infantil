package com.jardininfantil.web_institucional.models;

import java.time.LocalDate;
import com.jardininfantil.web_institucional.models.enums.EstadoPago;
import lombok.Getter;
import lombok.Setter;

public class PagoMatricula {
    
    @Getter @Setter
    private Long id_pago;
    @Getter @Setter
    private Long id_matricula;
    @Getter @Setter
    private String mes;
    @Getter @Setter
    private LocalDate fecha_pago;
    @Getter @Setter
    private EstadoPago estado;

    // Constructor vacío
    public PagoMatricula() {
    }

    // Constructor con todos los parámetros
    public PagoMatricula(Long id_pago, Long id_matricula, String mes, LocalDate fecha_pago, EstadoPago estado) {
        this.id_pago = id_pago;
        this.id_matricula = id_matricula;
        this.mes = mes;
        this.fecha_pago = fecha_pago;
        this.estado = estado;
    }
}
