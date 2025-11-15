package com.jardininfantil.web_institucional.models;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

public class Familiar {
    
    @Getter @Setter
    private Long acudiente_id;
    @Getter @Setter
    private Long usuario_id;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String segundo_nombre;
    @Getter @Setter
    private String primer_apellido;
    @Getter @Setter
    private String segundo_apellido;
    @Getter @Setter
    private String cedula;
    @Getter @Setter
    private LocalDate fecha_expedicion_documento;
    @Getter @Setter
    private LocalDate fecha_nacimiento;
    @Getter @Setter
    private String municipio;
    @Getter @Setter
    private String direccion;
    @Getter @Setter
    private String barrio;
    @Getter @Setter
    private String telefono;
    @Getter @Setter
    private String correo;
    @Getter @Setter
    private String nivel_educativo;
    @Getter @Setter
    private String ocupacion;
    @Getter @Setter
    private String tipo_familiar;

    // Constructor vacío
    public Familiar() {
    }

    // Constructor con todos los parámetros
    public Familiar(Long acudiente_id, Long usuario_id, String nombre, String segundo_nombre, 
                    String primer_apellido, String segundo_apellido, String cedula, 
                    LocalDate fecha_expedicion_documento, LocalDate fecha_nacimiento, String municipio, 
                    String direccion, String barrio, String telefono, String correo, 
                    String nivel_educativo, String ocupacion, String tipo_familiar) {
        this.acudiente_id = acudiente_id;
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.cedula = cedula;
        this.fecha_expedicion_documento = fecha_expedicion_documento;
        this.fecha_nacimiento = fecha_nacimiento;
        this.municipio = municipio;
        this.direccion = direccion;
        this.barrio = barrio;
        this.telefono = telefono;
        this.correo = correo;
        this.nivel_educativo = nivel_educativo;
        this.ocupacion = ocupacion;
        this.tipo_familiar = tipo_familiar;
    }
}
