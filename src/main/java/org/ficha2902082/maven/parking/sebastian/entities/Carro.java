package org.ficha2902082.maven.parking.sebastian.entities;

import org.ficha2902082.maven.parking.sebastian.entities.TipoVehiculo;
import org.*;

public class Carro {

    //sintaxis de atributos
    //1. Modifcdor de acceso 
    //2. Tipo de dato del atibuto
    //3. Nombre del atributo 
    // (camel   Case)
    public String placa;
    public TipoVehiculo tipoVehiculo;
    public Carro() {
        
    }
    public Carro(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

   
    



}
