package com.networks.modelo.ejemplointerfaces;

public class Avion extends Vehiculo implements IObjetoVolador{
    @Override
    public String volar() {
        return "El avion está volando";
    }

    @Override
    public String despegar() {
        return "El avion está despegando";
    }

    @Override
    public String aterrizar() {
        return "El avion está aterrizando";
    }
}
