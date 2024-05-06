public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones; // private portege nuestro codigo de los usuarios MODIFICADORES DE ACCESO
    private int totalDeLasEvaluaciones;

    int getTotalDeLasEvaluaciones() {
        return  totalDeLasEvaluaciones;
    }

    void muestraFichaTecnica() { //Sout para todos
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su Fecha de lanzamiento: " + fechaLanzamiento);
        System.out.println("Su Duracion es de: " + duracionEnMinutos);
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
