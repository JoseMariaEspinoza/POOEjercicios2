package com.networks.modelo.ejemplointerfaces;

public class Superman extends Kriptoniano implements IObjetoVolador{
    @Override
    public String volar() {
        return "Superman esta volando";
    }

    @Override
    public String despegar() {
        return "Superman está despegando";
    }

    @Override
    public String aterrizar() {
        return "Superman está aterrizando";
    }
}
