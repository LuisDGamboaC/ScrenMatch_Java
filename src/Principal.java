import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.Clasificacion;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(90);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones()); // no protege el codigo del usuario
        System.out.println("Média de evaluaciones de la película: " +miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del Dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodioPorTemporadas(10);
        casaDragon.muestraFichaTecnica();
        System.out.println("casaDragon tiempo total: " +casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula(); // el orden importa mucho
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo total: " +calculadora.getTiempoTotal()+ " minutos");

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones(); // calculamos el resutlado de la pelicula o serie
        filtroRecomendaciones.filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("casa targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(75);
        filtroRecomendaciones.filtro(episodio);

    }
}
