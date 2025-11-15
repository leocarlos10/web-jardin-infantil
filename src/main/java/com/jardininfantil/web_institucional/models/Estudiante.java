package com.jardininfantil.web_institucional.models;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

public class Estudiante {

    @Getter
    @Setter
    private Long estudiante_id;
    @Getter
    @Setter
    private Long acudiente_id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String segundo_nombre;
    @Getter
    @Setter
    private String primer_apellido;
    @Getter
    @Setter
    private String segundo_apellido;
    @Getter
    @Setter
    private String numero_registro_civil;
    @Getter
    @Setter
    private LocalDate fecha_exp;
    @Getter
    @Setter
    private LocalDate fecha_nacimiento;
    @Getter
    @Setter
    private int tipo_sangre;
    @Getter
    @Setter
    private String sexo;
    @Getter
    @Setter
    private String correo_padres;
    @Getter
    @Setter
    private int edad;
    @Getter
    @Setter
    private String lugar_nacimiento;
    @Getter
    @Setter
    private String municipio;
    @Getter
    @Setter
    private String departamento;
    @Getter
    @Setter
    private String direccion;
    @Getter
    @Setter
    private String barrio;
    @Getter
    @Setter
    private String tipo_estudiante;

    // Constructor vacío
    public Estudiante() {
    }

    // Constructor con todos los parámetros
    public Estudiante(Long estudiante_id, Long acudiente_id, String nombre, String segundo_nombre,
            String primer_apellido, String segundo_apellido, String numero_registro_civil,
            LocalDate fecha_exp, int tipo_sangre, LocalDate fecha_nacimiento, String municipio,
            String departamento, String direccion, String barrio, String tipo_estudiante,
            String sexo, String correo_padres, int edad, String lugar_nacimiento) {
        this.estudiante_id = estudiante_id;
        this.acudiente_id = acudiente_id;
        this.nombre = nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.numero_registro_civil = numero_registro_civil;
        this.fecha_exp = fecha_exp;
        this.tipo_sangre = tipo_sangre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.municipio = municipio;
        this.departamento = departamento;
        this.direccion = direccion;
        this.barrio = barrio;
        this.tipo_estudiante = tipo_estudiante;
        this.sexo = sexo;
        this.correo_padres = correo_padres;
        this.edad = edad;
        this.lugar_nacimiento = lugar_nacimiento;
    }
}
