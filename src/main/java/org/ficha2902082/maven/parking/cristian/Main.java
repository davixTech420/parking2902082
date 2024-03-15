package org.ficha2902082.maven.parking.cristian;

import org.ficha2902082.maven.parking.cristian.entities.Cupo;
import org.ficha2902082.maven.parking.cristian.entities.TipoDocumento;
import org.ficha2902082.maven.parking.cristian.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.cristian.entities.Carro;
import org.ficha2902082.maven.parking.cristian.entities.Cliente;
import org.ficha2902082.maven.parking.cristian.entities.Empleado;
import org.ficha2902082.maven.parking.cristian.entities.Registro;
import java.util.List;
import java.util.ArrayList;
import java.time.*;

public class Main {
    public static void main(String[] args) {


        //Instanciar empleado

        Empleado emple1 = new Empleado();
        emple1.nombre = "Simon";
        emple1.codigo = 4321;

        Empleado emple2 = new Empleado();
        emple2.nombre = "David";
        emple2.codigo = 3210;

        Empleado emple3 = new Empleado();
        emple3.nombre = "Ruperto";
        emple3.codigo = 1234;
        Empleado emple4 = new Empleado();
        emple4.nombre = "Ronaldo";
        emple4.codigo = 12345;
        Empleado emple5 = new Empleado();
        emple5.nombre = "Ras";
        emple5.codigo = 12345;

    

        // Crear dos cupos
        // Instanciar dos cupos:
        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra = 'A';

        Cupo cupito2 = new Cupo('B',
                5.0,
                2.5);
                
                Cupo cupito3 = new Cupo('C',
                5.0,
                2.5);
                Cupo cupito4 = new Cupo('D',
                5.0,
                2.5);
                Cupo cupito5 = new Cupo('E',
                5.0,
                2.5);




        // Instanciar dos carros:
        Carro carrito1 = new Carro("ASJ 456",
                TipoVehiculo.MOTO);
        Carro carrito2 = new Carro("DFR 234",
                TipoVehiculo.CAMIONETA);

        // Instanciar un cliente:
        Cliente cli = new Cliente("Cristian",
                "Buitrago",
                TipoDocumento.CC,
                25234234L,
                3005555555L);

        // vincular carros al cliente
        cli.addCar(carrito1);
        cli.addCar(carrito2);
        cli.addCar("ERT TYU",
                TipoVehiculo.CAMION);

        // Declara una lista de Registros
        List<Registro> misRegistros = new ArrayList<>();

        // Instanciar dos Registros E/S
        Registro registro1 = new Registro(
                LocalDate.of(2024, Month.JANUARY, 23),
                LocalTime.of(15, 30, 34),
                LocalDate.of(2024, Month.FEBRUARY, 1),
                LocalTime.of(6, 30, 23),
                50000.00,
                cli.misCarros.get(0),
                cupito1, emple1 );

        LocalDate fi1 = LocalDate.of(2023, Month.DECEMBER, 24);
        LocalTime hi1 = LocalTime.of(11, 32, 0);
        LocalDate ff1 = LocalDate.of(2023, Month.JANUARY, 24);
        LocalTime hf1 = LocalTime.of(12, 32, 0);
        Double valorR2 = 50000.0;

        Registro registro2 = new Registro(fi1, hi1, ff1, hf1, valorR2, cli.misCarros.get(0), cupito2, emple2);

        

        LocalDate fi2 = LocalDate.of(2023, Month.DECEMBER, 22);
        LocalTime hi2 = LocalTime.of(10, 32, 0);
        LocalDate ff2 = LocalDate.of(2023, Month.JANUARY, 24);
        LocalTime hf2 = LocalTime.of(12, 32, 0);
        Double valorR3 = 60000.0;


        Registro registro3 = new Registro(fi2, hi2, ff2, hf2, valorR3, cli.misCarros.get(0), cupito3, emple3);

        LocalDate fi3 = LocalDate.of(2023, Month.DECEMBER, 22);
        LocalTime hi3 = LocalTime.of(10, 32, 0);
        LocalDate ff3 = LocalDate.of(2023, Month.JANUARY, 24);
        LocalTime hf3 = LocalTime.of(12, 32, 0);
        Double valorR4 = 70000.0;

        Registro registro4 = new Registro(fi3,hi3,ff3,hf3, valorR4, cli.misCarros.get(0),cupito4, emple4);

        LocalDate fi4 = LocalDate.of(2023, Month.DECEMBER, 22);
        LocalTime hi4 = LocalTime.of(10, 32, 0);
        LocalDate ff4 = LocalDate.of(2023, Month.JANUARY, 24);
        LocalTime hf4 = LocalTime.of(12, 32, 0);
        Double valorR5 = 60000.0;


        Registro registro5 = new Registro(fi4, hi4, ff4, hf4, valorR4, cli.misCarros.get(0), cupito4, emple5);



        // vincular los registros a la lista
        // de registros
        misRegistros.add(registro1);
        misRegistros.add(registro2);
        misRegistros.add(registro3);
        misRegistros.add(registro4);
        misRegistros.add(registro5);


        




        // Recorrer la lista de registros
        for (Registro r : misRegistros) {
            System.out.println("Placa: " +
                    r.carro.placa + "|" +
                    "Cupo: " +
                    r.cupo.letra + "|" +
                    "Valor: " +
                    r.valor + "|" +
                    "Fecha Inicio: " +
                    r.fechaInicio.toString() + "|" + 
                    r.empleado.codigo

            );
        }

    }

}