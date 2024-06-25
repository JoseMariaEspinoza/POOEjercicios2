package com.networks.presentacion;

import com.networks.modelo.ejemplointerfaces.*;

public class ProbarInterfaces {
    public static void main(String[] args) {
    // Instanciar un avion con el nombre de objeto a1
        Avion a1 = new Avion();
    //Instanciar un avion con el nombre de objeto a2 en una referencia de ObjetoVolador
        IObjetoVolador a2 = new Avion();
    //Instanciar un avion con el nombre de objeto a3 en una referencia de ObjetoVolador
        IObjetoVolador a3 = new Avion();
    //Instanciar un ave con el nombre de a4
        Ave a4 = new Ave();
    //Instanciar un ave con el nombre de a5 usando el constructor completo
    //en una referencia de ObjetoVolador
        IObjetoVolador a5 = new Ave();
    //Instanciar un avión con el nombre de objeto a6 usando el constructor completo
    //en una referencia de ObjetoVolador
        IObjetoVolador a6 = new Avion();
    //Instanciar un Superman con el nombre de a7
    //en una referencia de ObjetoVolador
        IObjetoVolador a7 = new Superman();
//        objeto[0] = a1;
//        objeto[1] = a2;
//        objeto[2] = a3;
//        objeto[3] = a4;
//        objeto[4] = a5;
//        objeto[5] = a6;
//        objeto[6] = a7;
    //Instanciar un Hidroavion
    //Instanciar un Hidroavion con el nombre de objeto ha2 en una referencia Nautico
    //Instanciar una barcaza con el nombre de objeto b1
    //Instanciar una barcaza con el nombre de objeto b2, en una referencia de Nautico

        HidroAvion ha1 = new HidroAvion();
        Nautico ha2 = new HidroAvion();
        Barcaza b1 = new Barcaza();
        Nautico b2 = new Barcaza();
        IObjetoVolador a8 = new HidroAvion();
        HidroAvion ha3 = (HidroAvion) a8;

        IObjetoVolador[] objeto = {a1,a2,a3,a4,a5,a6,a7,a8};
        for(IObjetoVolador elemento : objeto) {
            System.out.println(elemento.despegar());
            System.out.println(elemento.volar());
            System.out.println(elemento.aterrizar() + "\n");
        }
        Nautico[] objeto2 = {ha1,ha2,b1,b2,ha3};
        for(Nautico elemento : objeto2) {
            System.out.println(elemento.atracar());
            System.out.println(elemento.navegar() + "\n");
        }
    }
}
