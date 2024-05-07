package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio  implements Clasificacion { // implements nos deja guardar este episodio y su info en calsificacion y usar el getCalsificaciones
    private int numero;
    private String nombre;
    private Serie serie; // correlacion entre la serie y su episodio
    private int totalVisualizaciones;

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Serie getSerie() {
        return serie;
    }
    //setter

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getClasificacion() { // medimos el resultado si es bueno o malo o un 4 o 2
        if (totalVisualizaciones > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
