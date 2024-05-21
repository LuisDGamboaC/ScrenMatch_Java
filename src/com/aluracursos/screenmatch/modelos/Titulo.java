package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorEnDuracionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
//    @SerializedName("Title") // cuando la compu lea el codigo que idetifique title como nombre
    private String nombre;
    @SerializedName("Year") // ya no es necesario añadir esto ya que hicimos el tituloomdb
    private int fechaLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones; // private portege nuestro codigo de los usuarios MODIFICADORES DE ACCESO
    private int totalDeLasEvaluaciones;

    //constructo se colo debajo de los atributos

    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) { // capturar error
        this.nombre = miTituloOmdb.title();
        this.fechaLanzamiento = Integer.parseInt(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")) {
            throw new ErrorEnDuracionException("No pude convertir la duracion," + "porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ", "")); // solo lelegimmos los numero del string "60 min"
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }


    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    //Setters
    public void setNombre(String nombre) { // fue creado con un SETTER click derecho Generate
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    // Valor de las evaluaciones
    public int getTotalDeLasEvaluaciones() {
        return  totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica() { //Sout para todos
        System.out.println("Titulo: " + nombre);
        System.out.println("Su Fecha de lanzamiento: " + fechaLanzamiento);
        System.out.println("Su Duracion es de: " + getDuracionEnMinutos()); // elige si estamos en serie o pelicula y muestra su valor dependiendo si esatmos en serie o pelicula
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) { // para que pueda leer el codigo Collections.sort()
        return this.getNombre().compareTo(otroTitulo.getNombre()); //ordena los nombres
    }

    @Override
    public String toString() {
        return "(nombre= '" + nombre +
                ", fechaLanzamiento= " + fechaLanzamiento +
                ", duracion= " + duracionEnMinutos+")";
    }
}
