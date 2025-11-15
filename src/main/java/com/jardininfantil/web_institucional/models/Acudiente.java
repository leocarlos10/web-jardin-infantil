package com.jardininfantil.web_institucional.models;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

public class Acudiente {
    
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
    private String ciudad;
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

    // Constructor vacío
    public Acudiente() {
    }

    // Constructor con todos los parámetros
    public Acudiente(Long acudiente_id, Long usuario_id, String nombre, String segundo_nombre, 
                     String primer_apellido, String segundo_apellido, String cedula, 
                     LocalDate fecha_expedicion_documento, LocalDate fecha_nacimiento, String ciudad, 
                     String direccion, String barrio, String telefono, String correo, 
                     String nivel_educativo, String ocupacion) {
        this.acudiente_id = acudiente_id;
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.cedula = cedula;
        this.fecha_expedicion_documento = fecha_expedicion_documento;
        this.fecha_nacimiento = fecha_nacimiento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.barrio = barrio;
        this.telefono = telefono;
        this.correo = correo;
        this.nivel_educativo = nivel_educativo;
        this.ocupacion = ocupacion;
    }
}
