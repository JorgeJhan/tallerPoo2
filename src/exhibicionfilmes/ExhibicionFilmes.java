package exhibicionfilmes;

import controles.ControlPelicula;
import vista.Ventana;
import java.util.ArrayList;
import modelo.Pelicula;

/**
 *
 * @author jhanc
 */
public class ExhibicionFilmes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Pelicula> lista = new ArrayList<Pelicula>();

        Ventana ven = new Ventana();
        ControlPelicula vC = new ControlPelicula(lista, ven);
        vC.iniciarVentana();

    }

}
