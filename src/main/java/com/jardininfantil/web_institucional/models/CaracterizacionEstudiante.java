package com.jardininfantil.web_institucional.models;

import lombok.Getter;
import lombok.Setter;

public class CaracterizacionEstudiante {
    
    @Getter @Setter
    private Long id_caracterizacion;
    @Getter @Setter
    private Long estudiante_id;
    @Getter @Setter
    private boolean beneficiario_renta_ciudadana;
    @Getter @Setter
    private int numero_miembro_familia;
    @Getter @Setter
    private String estrato_sisben;
    @Getter @Setter
    private String nivel_sisben;
    @Getter @Setter
    private String EPS;
    @Getter @Setter
    private String regimen_contributivo;
    @Getter @Setter
    private String regimen_subsidiado;
    @Getter @Setter
    private boolean pertenece_comunidad_indigena;
    //nombre de comunidad indigena
    @Getter @Setter
    private String nombre_co_indigena;
    @Getter @Setter
    private boolean desplazado;
    @Getter @Setter
    private String municipio_expulsor;
    @Getter @Setter
    private boolean discapacidad;
    @Getter @Setter
    private String tipo_discapacidad;
    @Getter @Setter
    private boolean hijo_unico;
    @Getter @Setter
    private String Enfermedades;
    @Getter @Setter
    private boolean viene_colegio_privado;
    @Getter @Setter
    private String nombre_colegio;
    @Getter @Setter
    private boolean viene_hogar_ICBF;
    @Getter @Setter
    private String nombre_hogar_ICBF;

    // Constructor vacío
    public CaracterizacionEstudiante() {
    }

    // Constructor con todos los parámetros
    public CaracterizacionEstudiante(Long id_caracterizacion, Long estudiante_id, 
                                     boolean beneficiario_renta_ciudadana, int numero_miembro_familia, 
                                     String estrato_sisben, String nivel_sisben, String EPS, 
                                     String regimen_contributivo, String regimen_subsidiado, 
                                     boolean pertenece_comunidad_indigena, String nombre_co_indigena, 
                                     boolean desplazado, String municipio_expulsor,  boolean discapacidad, 
                                     String tipo_discapacidad, boolean hijo_unico, String Enfermedades, 
                                     boolean viene_colegio_privado, String nombre_colegio, 
                                     boolean viene_hogar_ICBF, String nombre_hogar_ICBF) {
        this.id_caracterizacion = id_caracterizacion;
        this.estudiante_id = estudiante_id;
        this.beneficiario_renta_ciudadana = beneficiario_renta_ciudadana;
        this.numero_miembro_familia = numero_miembro_familia;
        this.estrato_sisben = estrato_sisben;
        this.nivel_sisben = nivel_sisben;
        this.EPS = EPS;
        this.regimen_contributivo = regimen_contributivo;
        this.regimen_subsidiado = regimen_subsidiado;
        this.pertenece_comunidad_indigena = pertenece_comunidad_indigena;
        this.nombre_co_indigena = nombre_co_indigena;
        this.desplazado = desplazado;
        this.municipio_expulsor = municipio_expulsor;
        this.discapacidad = discapacidad;
        this.tipo_discapacidad = tipo_discapacidad;
        this.hijo_unico = hijo_unico;
        this.Enfermedades = Enfermedades;
        this.viene_colegio_privado = viene_colegio_privado;
        this.nombre_colegio = nombre_colegio;
        this.viene_hogar_ICBF = viene_hogar_ICBF;
        this.nombre_hogar_ICBF = nombre_hogar_ICBF;
    }
}
