import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Metodos {
    GitHub github;
    GHRepository NombreRepositorio;

    /** Método que recibirá por parámetro el nombre del repositorio.
     * @param Repositorio
     */
    public void crearRepositorio(String Repositorio) {
        try {
            NombreRepositorio = github.createRepository(Repositorio).create();

        } catch (IOException e) {
            System.out.println("No se ha podido conectar " + e.getMessage());
        }

    }

    /** Método que recibirá por parámetro el token creado por nosotros mediante github.
     * Con él podremos acceder a github mediante token.
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



    /** Método que recibirá por parámetro la ruta donde se encuentra el archivo con el método de verificación.
     * Accedemos a github mediante un fichero.
     * @param Ruta
     */
    public void accesoFile(String Ruta) {
        try {
            github = new GitHubBuilder().fromPropertyFile(Ruta).build();

        } catch (IOException e) {
            System.out.println("Error accesoFile" + e.getMessage());
        } finally {
            System.out.println("Conectado con éxito.");
        }
    }

    /** Método para conectarte con tú usuario y contraseña (No recomendado)
     * @param user
     * @param psw
     */
    public void accesoUserPsw(String user, String psw) {
        try {
            github = new GitHubBuilder().withPassword(user, psw).build();
        } catch (IOException e) {
            System.out.println("Error conexion con usuario o contraseña " + e.getMessage());
        }

    }



}
