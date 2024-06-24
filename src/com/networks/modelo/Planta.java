package com.networks.modelo;

public abstract class Planta {
    private String nombre;
    private char tipo; // 'E'-->exterior, 'I'-->interior

    public abstract String regar(int cantidad, int tiempo);
    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + "tipo=" + tipo + '}';
    }


    public Planta(String nombre, char tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

}
