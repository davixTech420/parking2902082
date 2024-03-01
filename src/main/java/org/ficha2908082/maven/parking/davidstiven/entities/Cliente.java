package org.ficha2908082.maven.parking.davidstiven.entities;
import org.ficha2908082.maven.parking.davidstiven.entities.*;
import java.util.ArrayList;
import java.util.List;


public class Cliente {

    public String  Nombre;
    public String Apellido;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long celular;
    public List<Carro> misCarros = new ArrayList<Carro>();

//metodo 1 añadir un carro
//definir metodo
//modificar acceso
//tipo de dato de retorno
// nombre del metodo
// parametros (entradas ,salidas) 

public void addCar(Carro c){
    this.misCarros.add(c);
}

//sobrecarga del metodo
public void addCar(String placa, TipoVehiculo tipoVehiculo ){
    // construir o instnciar el objeto 
    Carro c = new Carro();
    c.placa = placa;
    c.tipoVehiculo = tipoVehiculo;
    this.misCarros.add(c);
}

//sobrecarga de metodos 
//en una clase  se permiten metodos con el mismo nombre
//pero con diferente firma

   

}
