package com.jardininfantil.web_institucional.models;

import java.time.LocalDate;
import com.jardininfantil.web_institucional.models.enums.EstadoMatricula;
import lombok.Getter;
import lombok.Setter;

public class Matricula {

    @Getter
    @Setter
    private Long id_matricula;
    @Getter
    @Setter
    private Long estudiante_id;
    @Getter
    @Setter
    private LocalDate fecha;
    @Getter
    @Setter
    private String grado;
    @Getter
    @Setter
    private Double valor_total;
    @Getter
    @Setter
    private Double contrato_firmado;
    @Getter
    @Setter
    private EstadoMatricula estado_matricula;

    // Constructor vacío
    public Matricula() {
    }

    // Constructor con todos los parámetros
    public Matricula(Long id_matricula, Long estudiante_id, LocalDate fecha, String grado,
            Double valor_total, Double contrato_firmado, EstadoMatricula estado_matricula) {
        this.id_matricula = id_matricula;
        this.estudiante_id = estudiante_id;
        this.fecha = fecha;
        this.grado = grado;
        this.valor_total = valor_total;
        this.contrato_firmado = contrato_firmado;
        this.estado_matricula = estado_matricula;
    }
}
