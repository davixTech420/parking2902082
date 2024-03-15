package org.ficha2902082.maven.parking.sebastian;
//inportar dependencias 

import org.apache.http.config.Registry;
import org.ficha2902082.maven.parking.sebastian.entities.Carro;
import org.ficha2902082.maven.parking.sebastian.entities.Cliente;
import org.ficha2902082.maven.parking.sebastian.entities.Cupo;
import org.ficha2902082.maven.parking.sebastian.entities.Registro;
import org.ficha2902082.maven.parking.sebastian.entities.TipoDocumento;
import org.ficha2902082.maven.parking.sebastian.entities.TipoVehiculo;
import java.util.List;
import java.util.ArrayList;
import java.time.*;



public class Main {
    public static void main(String[] args) { 
        //crear dos cupos
        //instanciar dos cupos:
        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5; 
        cupito1.letra = 'A';

        Cupo cupito2 = new Cupo('B', 5.0, 2.5);


        //instanciar dos carros
    Carro carrito1 = new Carro("ASJ 466", TipoVehiculo.MOTO);
    Carro carrito2 = new Carro("SBG 207", TipoVehiculo.TAXI);


        //instanciar un cliente

        Cliente cli = new Cliente("jeferson stiven", "Torres Riscanevo", TipoDocumento.CC, 1021672252L, 3243745647L);

        //vincular carros al cliente 

        cli.addCar(carrito1);
        cli.addCar(carrito2);
        cli.addCar("ASJ 467", TipoVehiculo.MOTO);


        //declara una lista de registros 
        List<Registro> misResgistros = new ArrayList<>();

        //INSTANCIAR DOS REGISTROS
        Registro registro1 = new Registro(
            LocalDate.of(2024, Month.JANUARY, 23) ,
            LocalTime.of(15, 30, 34),
            LocalDate.of(2024, Month.FEBRUARY, 1),
            LocalTime.of(6, 30, 23),
            50000.00,
            cli.misCarros.get(0),
            cupito1
        );

        Registro registro2 = new Registro(
            LocalDate.of(2024, Month.DECEMBER, 15) ,
            LocalTime.of(10, 45, 15),
            LocalDate.of(2024, Month.APRIL, 7),
            LocalTime.of(13, 9, 54),
            70000.00,
            cli.misCarros.get(0),
            cupito2
        );
        //vincular los registros a la lista de registros 
        misResgistros.add(registro1);
        misResgistros.add(registro2);

        //recorrer la lista de registros
        for(Registro r : misResgistros ){

            System.out.println( " Placa: " + r.carro.placa + "|" + "Cupo: " + r.cupo.letra + "|" + "Valor: " + r.valor + "|" + "Fecha Inicio: " + r.fechaInicio.toString() + "|"
            + "Fecha Final" + r.fechaFin.toString() + "|"  );

        }
        
    }
}