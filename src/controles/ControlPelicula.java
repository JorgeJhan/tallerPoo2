package controles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Pelicula;
import vista.Ventana;

/**
 *
 * @author jhanc
 */
public class ControlPelicula implements ActionListener {

    private final ArrayList<Pelicula> listaDePeliculas;
    Pelicula unidades = new Pelicula();
    private final Ventana vista;
    private int totalBoletas;

    // constructor sobrecargado con los parametros.
    public ControlPelicula(ArrayList<Pelicula> listaPel, Ventana vista) {
        // se igualan los objetos con los parametros.
        this.listaDePeliculas = listaPel;
        this.vista = vista;

        // se implementan los botones para que funcionen a partir de la vista.
        this.vista.btnConsultar.addActionListener(this);
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnCalcular.addActionListener(this);
        this.vista.btnImprimir.addActionListener(this);
        this.vista.inputTotalBoletas.setFocusable(false);
        //listaPel.add(new Pelicula(nombre, director, totalBoletas, reseña, totalBoletas))

        listaPel.add(new Pelicula("rapidos y furiosos 8", "Felix Gary Gray", 2017, "toda la saga es muy buena"));
        listaPel.add(new Pelicula("El sendero de la anaconda", "Alessandro Angulo", 2019, "muy Interesante"));
        listaPel.add(new Pelicula("Dogman", "Matteo Garrone", 2019, "muy Regular"));
        listaPel.add(new Pelicula("Ted", "Seth MacFarlane", 2012, "Un osito se convierte real es chistosa!"));
        listaPel.add(new Pelicula("Us", "Jordan Peele", 2019, "exelente y disponible en netflix"));
        listaPel.add(new Pelicula("Spider-Man: Lejos de casa", "Jon Watts", 2019, "exelente y moderna la pelicula"));
        listaPel.add(new Pelicula("Cold War", "Pawel Pawlikowski", 2019, " la recomiendo!"));
        listaPel.add(new Pelicula("Monos", "Alejandro Landes", 2019, "otra pelicula colombiana mala"));
        listaPel.add(new Pelicula("Toy Story 4", "Josh Cooley", 2019, "Interesante y muy bonita para niños"));
        listaPel.add(new Pelicula("Liga de la Justicia", "Zack Snyder", 2017, "la mejor de todas "));
        listaPel.add(new Pelicula("proyecto x", "Nima Nourizadeh", 2012, "muy buena la pelicula , en especial si eres adolecente"));
    }

    public void iniciarVentana() {
        vista.setTitle("---FILMES---");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textoBoton = e.getActionCommand();
        if (textoBoton.equalsIgnoreCase("Consultar")) {
            consultarPelicula();
        } else if (textoBoton.equalsIgnoreCase("Agregar")) {
            // mando parametros al metodo agregar para guardar lo que se escribe en las cajas de textos.

        } else if (textoBoton.equalsIgnoreCase("Calcular")) {
            totalBoletasPelis();
        } else if (textoBoton.equalsIgnoreCase("Imprimir")) {
            // Llamo el metodo imprimir para que se vea la lista de los vehiculos.
            imprimirDatos();
        } else {
            JOptionPane.showMessageDialog(null, "este boton no sirve");
        }
    }

    public void totalUnidades() {
        unidades.setUnidadesVendidas(Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese las boletas vendidas de esta pelicula")));
        vista.inputUnidades.setText(Integer.toString(unidades.getUnidadesVendidas()));
        totalBoletasPelis();
    }

    public void totalBoletasPelis() {
        totalBoletas += unidades.getUnidadesVendidas();
        vista.inputTotalBoletas.setText(Integer.toString(totalBoletas));
    }

    public void consultarPelicula() {
        limpiarCajas();
        String nombrePeli;
        boolean enoontrado = false; // variable booleana para validar si fue encontrado el vehiculo.
        nombrePeli = JOptionPane.showInputDialog("Ingrese el nombre de la pelicula a buscar ");

        // RECORRREMOS CON EL BUCLE FOREACH 
        for (Pelicula elemento : listaDePeliculas) {
            if (elemento.getNombre().equalsIgnoreCase(nombrePeli)) {
                vista.inputNombrePelicula.setText(elemento.getNombre());
                vista.inputDirector.setText(elemento.getDirector());
                vista.inputAño.setText(Integer.toString(elemento.getAño()));
                vista.inputReseña.setText(elemento.getReseña());
                enoontrado = true;
                break;
            }
        }
        if (enoontrado == false) {
            JOptionPane.showMessageDialog(null, "No se encontraron peliculas con ese nombre");
        }
        totalUnidades();
    }

    public void imprimirDatos() {
        String listaCompleta = "";
        Iterator it = listaDePeliculas.iterator(); //se recorre la lista
        while (it.hasNext()) {
            listaCompleta += "\n" + it.next().toString();
        }
        JOptionPane.showMessageDialog(null, "LISTA DE PELICULAS" + listaCompleta);
    }

    public void limpiarCajas() //limpiar las casillas
    {
        JTextField cajaDeTexto;
        for (int i = 0; i < vista.pan1.getComponentCount(); i++) {
            if (vista.pan1.getComponent(i).getClass().getName().equals("javax.swing.JTextField")) {
                cajaDeTexto = (JTextField) vista.pan1.getComponent(i);
                cajaDeTexto.setText("");
            }
        }
    }

}
