package com.jardininfantil.web_institucional.models;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

public class CancelarMatricula {
    
    @Getter @Setter
    private Long id_cancelar_matricula;
    @Getter @Setter
    private Long id_matricula;
    @Getter @Setter
    private String motivo;
    @Getter @Setter
    private LocalDate fecha_retiro;
    @Getter @Setter
    private String documento_soporte;

    // Constructor vacío
    public CancelarMatricula() {
    }

    // Constructor con todos los parámetros
    public CancelarMatricula(
        Long id_cancelar_matricula, 
        Long id_matricula, 
        String motivo, 
        LocalDate fecha_retiro,
        String documento_soporte) {
        this.id_cancelar_matricula = id_cancelar_matricula;
        this.id_matricula = id_matricula;
        this.motivo = motivo;
        this.fecha_retiro = fecha_retiro;
        this.documento_soporte = documento_soporte;
    }
}
