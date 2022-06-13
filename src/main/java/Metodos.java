import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Metodos {
    GitHub github;
    GHRepository NombreRepositorio;

    /**
     * @param Repositorio Este método recibirá por parámetro el nombre del repositorio.
     */
    public void crearRepositorio(String Repositorio) {
        try {
            NombreRepositorio = github.createRepository(Repositorio).create();

        } catch (IOException e) {
            System.out.println("No se ha podido conectar " + e.getMessage());
        }

    }

}
