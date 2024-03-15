package org.ficha2902082.maven.parking.sebastian.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {

    //atributos intrisecos
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFin;
    public LocalTime horaFin;
    public Double valor;

//atributos de relacion
public Carro carro;
public Cupo cupo;

//cons po defecto
public Registro() {
}


//cons parametrizado
public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, Double valor,
        Carro carro, Cupo cupo) {
    this.fechaInicio = fechaInicio;
    this.horaInicio = horaInicio;
    this.fechaFin = fechaFin;
    this.horaFin = horaFin;
    this.valor = valor;
    this.carro = carro;
    this.cupo = cupo;
}


}
