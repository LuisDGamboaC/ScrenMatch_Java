package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.excepcion.ErrorEnDuracionException;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.w3c.dom.ls.LSOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create(); //la primera letra la convetimos el mayuscula para el TituloOmdb title, year


// escribiendo la lista de peliculas en JSON
        while (true) {
            System.out.println("Escriba el nombre de la pelicula");
            var busqueda = lectura.nextLine(); // escribimos el nombre en la terminal

            if (busqueda.equalsIgnoreCase("salir")) {
                break;
            }

            String direccion = "https://www.omdbapi.com/?t=" +
                    busqueda.replace(" ", "+") +
                    "&apikey=a8ad97eb";

            try {

                HttpClient client = HttpClient.newHttpClient(); // pedimos datos
                HttpRequest request = HttpRequest.newBuilder() // que obtenemos al pedir al server
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(miTituloOmdb);

//        Titulo miTitulo = gson.fromJson(json, Titulo.class);
                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Titulo convertido: " + miTitulo);

                titulos.add(miTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Error: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error en la URL");

            } catch (ErrorEnDuracionException e) {
                System.out.println(e.getMessage());
            }
        }
//        catch (Exception e) {
//            System.out.println("Ocurrio un error insesperado"); // si esta exception no se peude coloca el exception que creamos
            System.out.println(titulos);
            FileWriter escritura = new FileWriter("titulos.json"); // grabando datos en un archivo
            escritura.write(gson.toJson(titulos));
            escritura.close();// siempre cerrarla par auq eno este lento el programamatrix
            System.out.println("finalizo la ejecucion del programa!");
        }
    }

