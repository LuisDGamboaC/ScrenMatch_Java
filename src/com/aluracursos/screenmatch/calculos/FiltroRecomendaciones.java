package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendaciones {

    public void filtro(Clasificacion clasificacion) { // mostramos el resultado
        if (clasificacion.getClasificacion() >=4) {
            System.out.println("Trending");
        } else if (clasificacion.getClasificacion()== 2) {
            System.out.println("popular");
        } else {
            System.out.println("Anañdir a lista d");
        }
    }
}
