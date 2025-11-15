package com.jardininfantil.web_institucional.models;

import lombok.Getter;
import lombok.Setter;

public class Administrador {
    
    @Getter @Setter
    private Long admin_id;
    @Getter @Setter
    private Long usuario_id;
    @Getter @Setter
    private String cargo;

    // Constructor vacío
    public Administrador() {
    }

    // Constructor con todos los parámetros
    public Administrador(Long admin_id, Long usuario_id, String cargo) {
        this.admin_id = admin_id;
        this.usuario_id = usuario_id;
        this.cargo = cargo;
    }
}
