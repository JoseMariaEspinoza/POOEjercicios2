package com.networks.presentacion;

import com.networks.modelo.Planta;
import com.networks.modelo.PlantaTropical;

public class ProbarPlanta {
    public static void main(String[] args) {
//
        Planta objPlantaTropical = new PlantaTropical("Palmera", 'E');
        System.out.println(objPlantaTropical.regar(5, 15));

    }
}