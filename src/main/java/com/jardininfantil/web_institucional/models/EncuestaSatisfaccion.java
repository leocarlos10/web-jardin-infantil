package com.jardininfantil.web_institucional.models;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

public class EncuestaSatisfaccion {
    
    @Getter @Setter
    private Long id_encuesta;
    @Getter @Setter
    private Long acudiente_id;
    @Getter @Setter
    private LocalDate fecha;
    @Getter @Setter
    private String nombre_respondedor;
    @Getter @Setter
    private String respuestas;

    // Constructor vacío
    public EncuestaSatisfaccion() {
    }

    // Constructor con todos los parámetros
    public EncuestaSatisfaccion(Long id_encuesta, Long acudiente_id, LocalDate fecha, 
                                String nombre_respondedor, String respuestas) {
        this.id_encuesta = id_encuesta;
        this.acudiente_id = acudiente_id;
        this.fecha = fecha;
        this.nombre_respondedor = nombre_respondedor;
        this.respuestas = respuestas;
    }
}
