package com.jardininfantil.web_institucional.models;

import com.jardininfantil.web_institucional.models.enums.RolUsuario;
import lombok.Getter;
import lombok.Setter;

public class Usuario {
    
    @Getter @Setter
    private String nombreUsuario;
    @Getter @Setter
    private String correo;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private RolUsuario tipo_Usuario;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con todos los parámetros
    public Usuario(String nombreUsuario, String correo, String password, RolUsuario tipo_Usuario) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.password = password;
        this.tipo_Usuario = tipo_Usuario;
    }

    
}
