package com.networks.modelo;

public class Cactus extends Planta{
    public Cactus(String nombre, char tipo) {
        super(nombre, tipo);
    }
    @Override
    public String regar(int cantidad, int tiempo) {
        return "Regando un cactus"
        +"La planta " + getNombre() +
                " se debe regar cada " + tiempo + " dias con " + cantidad + " litros de agua";
    }
}
