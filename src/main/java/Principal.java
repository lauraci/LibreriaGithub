import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        Metodos git = new Metodos();

        //Crea repositorio con el nombre indicado en el parámetro
        git.crearRepositorio("LauraRepo");


        /**  Conectar a github con archivo de configuración
         *   git.accesoFile("/Users/laura/Desktop/Laura/git.txt");
         */


        /**  Conectar GitHub mediante Token
         *   git.accesoToken("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");
         */
    }

    }
}