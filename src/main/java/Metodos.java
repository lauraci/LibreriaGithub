import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Metodos {
    GitHub github;
    GHRepository NombreRepositorio;

    /** Este método recibirá por parámetro el nombre del repositorio.
     * @param Repositorio
     */
    public void crearRepositorio(String Repositorio) {
        try {
            NombreRepositorio = github.createRepository(Repositorio).create();

        } catch (IOException e) {
            System.out.println("No se ha podido conectar " + e.getMessage());
        }

    }

    /** Este método recibirá por parámetro el token creado por nosotros mediante github.
     * @param Token
     */
    public void accesoToken(String Token) {
        try {
            github = new GitHubBuilder().withOAuthToken(Token).build();
            github = GitHub.connect();
        } catch (IOException e) {

        } finally {
            System.out.println("Conectado con éxito");
        }
    }

}
