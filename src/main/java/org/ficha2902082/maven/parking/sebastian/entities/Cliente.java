package org.ficha2902082.maven.parking.sebastian.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String apellidos;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long celular;
    public List<Carro> misCarros;

    //metodo 1: añadir carro al cliente
    //definir metodo
    //  - modficador acceso 
    //  - tpo de dato de retorno 
    //  - nombre del metodo 
    //parametros(Entradas, inputs):
    //  1. Tipo de dato del parametro 
    //  2. Nombre del paramero 

    



    

    public Cliente(String nombre, 
                   String apellidos, 
                   TipoDocumento tipoDocumento, 
                   Long numeroDocumento, 
                   Long celular) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.celular = celular;
        this.misCarros = new ArrayList<Carro>();
    }




    public void addCar(Carro c ){

        this.misCarros.add(c);

    }

    //sobrecarga del metodo addCar
    public void addCar( String placa, TipoVehiculo tipoVehiculo ){

        //construir(instanciar)
        Carro c = new Carro();
        c.placa = placa;
        c.tipoVehiculo = tipoVehiculo;
        this.misCarros.add(c);

    }

    //Sobrecarga de metodos:
    //En una clase se permite metodos 
    //con el mismo nombre 
    //con diferente firma 


}
