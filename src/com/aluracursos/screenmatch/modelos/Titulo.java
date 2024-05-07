package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones; // private portege nuestro codigo de los usuarios MODIFICADORES DE ACCESO
    private int totalDeLasEvaluaciones;

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
}
