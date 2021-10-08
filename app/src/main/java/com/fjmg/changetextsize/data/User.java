package com.fjmg.changetextsize.data;

import java.io.Serializable;

/**
 * Clase que encapsula un message de un usuario que ha inicido sesion
 */

public class User implements Serializable
{
    private String nombre;
    private String email;


        public User(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
