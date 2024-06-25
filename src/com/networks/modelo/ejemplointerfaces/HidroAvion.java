package com.networks.modelo.ejemplointerfaces;

public class HidroAvion extends Vehiculo implements IObjetoVolador, Nautico{

    @Override
    public String volar() {
        return "El hidroavion está volando";
    }

    @Override
    public String despegar() {
        return "El hidroavion está despegando";
    }

    @Override
    public String aterrizar() {
        return "El hidroavion está aterrizando";
    }

    @Override
    public String atracar() {
        return "El hidroavion está atracando";
    }

    @Override
    public String navegar() {
        return "El hidroavion está navegando";
    }
}
