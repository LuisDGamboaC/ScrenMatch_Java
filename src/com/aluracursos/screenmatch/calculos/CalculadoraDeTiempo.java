package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){ // incluimos las titulos
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
//    public void incluye(Serie serie){ // incluimos las series
//        tiempoTotal += serie.getDuracionEnMinutos();
//    }
}
