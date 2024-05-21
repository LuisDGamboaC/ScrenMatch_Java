package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar", 1998);
        otraPelicula.evalua(6);
        var peliculaDeLd = new Pelicula("Lord of the rings", 2001);
        peliculaDeLd.evalua(10);
        Serie casaDragon = new Serie("La casa del Dragon", 2022);

        Pelicula pelicula1 = new Pelicula("Avatar", 2009);
        Pelicula pelicula2 = new Pelicula("The Matrix", 1999);
//        Pelicula pelicula3 = pelicula1;

//        System.out.println(pelicula3);

        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeLd);
        lista.add(casaDragon);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){ // con esto podemos eliminar la linea de abajo
//                Pelicula pelicula = (Pelicula) item; // convertimos item en pelicula usando casting
                System.out.println(pelicula.getClasificacion());
            }
        }
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas); // a, b, c, ...
        System.out.println("Lista de Artista odenada: "+ listaDeArtistas);

        // tituto lista
        Collections.sort(lista);
        System.out.println("lista de titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("lista ordenada por fecha: "+ lista);
    }
}
