package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion { // no puede haber 2 extends o dos madres pero si un implements
    private String director;

//    public Pelicula(String nombre) { // constructor en lugar de escribir peliculaDeLd.setNombre() solo lo escribimos en el new Pelicula("Lord of the rings"); es un objeto
//        this.setNombre(nombre);
//    }

    public Pelicula(String nombre, int fechaLanzamiento) {
        super(nombre, fechaLanzamiento); // super llma al construcot de la clase madre en este caso titulo
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() { // creamos el resultado
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + "(" + this.getFechaLanzamiento() + ")";
    }
}
