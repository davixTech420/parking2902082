package org.ficha2908082.maven.parking.davidstiven;

import org.ficha2908082.maven.parking.davidstiven.entities.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // nueva ventana
        JFrame ventana = new JFrame();
        ventana.setTitle("Control de vehiculos");
        ventana.setSize(500, 500);
        // INSTAncias de carros

        // instancia numero uno
        Carro carrito1 = new Carro();
        carrito1.placa = "ASB 345";
        carrito1.tipoVehiculo = TipoVehiculo.CAMIONETA;

        Carro carrito2 = new Carro();
        carrito2.placa = "ABC 777";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;

        Carro carrito3 = new Carro();
        carrito3.placa = "AOK 354";
        carrito3.tipoVehiculo = TipoVehiculo.MOTO;

        Cliente cliente1 = new Cliente();
        cliente1.Nombre = "David";
        cliente1.Apellido = "Garcia";
        cliente1.tipoDocumento = TipoDocumento.CC;
        cliente1.numeroDocumento = 1032677592L;
        cliente1.celular = 3242855700L;

        //añadir carros al cliente
        //invocar el metodo o llamarlo ejecutarlo el metodo definido
        // el metodo definido
        cliente1.addCar(carrito1);
        cliente1.addCar(carrito2);
        cliente1.addCar("ASD 456", TipoVehiculo.TAXI);

        


        JTextArea etiqueta = new JTextArea("\n  Carro: \n" +
                "Placa:" + carrito1.placa + "\n" +
                "tipoVehiuclo: " + carrito1.tipoVehiculo + "\n");





Box box = Box.createVerticalBox();

        JTextArea eti2 = new JTextArea("\n  Cliente:\n" +
                "name : " + cliente1.Nombre + "\n" +
                "documento: " + cliente1.numeroDocumento + "\n" +
                "Tipo de documento: " + cliente1.tipoDocumento + "\n" +
                "Celular: " + cliente1.celular + "\n" +
                "Vehiculos : " 
                );


                
                for( Carro c : cliente1.misCarros ){
                    JTextArea eti3 = new JTextArea("\n  Carro: \n" +
                    "Placa:" + c.placa + "\n" +
                    "tipoVehiuclo: " + c.tipoVehiculo  + "____________");
                    box.add(eti3);
                }
        box.add(etiqueta);
        box.add(eti2);
        

        // Agregar el BoxLayout a la ventana
        ventana.add(box);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

}
