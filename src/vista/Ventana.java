package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author jhanc
 */
public class Ventana extends JFrame {

    //DECLARO
    public JButton btnCalcular, btnConsultar, btnAgregar, btnImprimir; // botones.
    public JTextField inputNombrePelicula, inputDirector, inputAño, inputReseña, inputTotalBoletas, inputUnidades; // objetos de las cajas de textos
    JLabel header, labelNombre, labelDirector, labelAñoPelicula, labelReseña, labelTotalBoletas; // objetos de la las etiquetas.
    public JPanel pan1;

    //INSTANCIO
    public Ventana() {
        setBounds(400, 200, 600, 300);
        setLayout(new BorderLayout());
        header = new JLabel("Exhibicion de film");
        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setFont(new Font("Serif", Font.PLAIN, 24));
        add(header, BorderLayout.NORTH);

        pan1 = new JPanel();

        add(pan1, BorderLayout.CENTER);

        labelNombre = new JLabel("NOMBRE PELICULA:  ");
        labelDirector = new JLabel("DIRECTOR: ");
        labelAñoPelicula = new JLabel("AÑO");

        labelReseña = new JLabel("RESEÑA: ");
        labelTotalBoletas = new JLabel("TOTAL DE BOLETAS : ");
        btnConsultar = new JButton("Consultar");
        btnAgregar = new JButton("Agregar");
        btnCalcular = new JButton("Calcular");
        btnImprimir = new JButton("Imprimir");

        inputNombrePelicula = new JTextField(15);
        inputDirector = new JTextField(15);
        inputAño = new JTextField(15);
        inputUnidades = new JTextField(15);
        inputReseña = new JTextField(30);
        inputTotalBoletas = new JTextField(15);

        btnAgregar.setPreferredSize(new Dimension(150, 30));
        btnCalcular.setPreferredSize(new Dimension(150, 30));
        btnImprimir.setPreferredSize(new Dimension(150, 30));
        btnConsultar.setPreferredSize(new Dimension(150, 30));

        pan1.add(labelNombre, BorderLayout.CENTER);
        pan1.add(inputNombrePelicula, BorderLayout.CENTER);
        pan1.add(labelDirector, BorderLayout.CENTER);
        pan1.add(inputDirector, BorderLayout.CENTER);
        pan1.add(labelAñoPelicula, BorderLayout.CENTER);
        pan1.add(inputAño, BorderLayout.CENTER);
        pan1.add(labelReseña, BorderLayout.CENTER);
        pan1.add(inputReseña, BorderLayout.CENTER);
        pan1.add(btnAgregar);
        pan1.add(btnCalcular);
        pan1.add(btnConsultar);
        pan1.add(btnImprimir);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cierra con la x 

    }

}
