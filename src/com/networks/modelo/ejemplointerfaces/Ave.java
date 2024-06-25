package com.networks.modelo.ejemplointerfaces;

public class Ave extends Animal implements IObjetoVolador{
    @Override
    public String volar() {
        return "El ave está volando";
    }

    @Override
    public String despegar() {
        return "El ave está despegando";
    }

    @Override
    public String aterrizar() {
        return "El ave está aterrizando";
    }
}
