package org.ficha2902082.maven.parking.sebastian.entities;

public class Cupo {

    public char letra;
    public Double largo;
    public Double ancho;

    //un metodo especial en una entidad 
    //1: se ejeuta automaticamente cuando se crea un objeto
    //constructor por defecto
    public Cupo() {
    }

    //constructor con parametros
    public Cupo(char letra, 
                Double largo, 
                Double ancho) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
    }



}
