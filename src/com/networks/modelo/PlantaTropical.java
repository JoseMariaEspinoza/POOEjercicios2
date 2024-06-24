package com.networks.modelo;

public class PlantaTropical extends Planta{
    public PlantaTropical(String nombre, char tipo) {
        super(nombre, tipo);
    }
    @Override
    public String regar(int cantidad, int tiempo) {
        return "Regando una planta tropical"
        + "La planta " + getNombre() +
                " se debe regar cada " + tiempo + " dias con " + cantidad + " litros de agua";
    }
}

