package com.example.calupe.retodeezer;


public class lista {

    private String nombre;
    private String usuario;
    private String canciones;

    public lista(String nombre, String usuario, String canciones) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCanciones() {
        return canciones;
    }

}
