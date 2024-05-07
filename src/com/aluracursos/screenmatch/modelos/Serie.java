package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    int temporadas;
    int episodioPorTemporadas;
    int minutosPorEpisodio;

    public int getDuracionEnMinutos() {
        return temporadas * episodioPorTemporadas * minutosPorEpisodio;
    }

    //Getter
    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodioPorTemporadas() {
        return episodioPorTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    //Setter

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodioPorTemporadas(int episodioPorTemporadas) {
        this.episodioPorTemporadas = episodioPorTemporadas;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
