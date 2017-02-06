package Pantalla;

import Excepciones.ValoresDiferentesException;
import Objetos.Lista;
import Objetos.Monomio;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pantalla extends JFrame {

    private final JLabel lblInsertaDatos;
    private final JTextField txtCoeficiente;
    private final JTextField txtExponente;
    private final JButton btnAgregar;
    private final JPanel pnlArriba;
    private final JLabel lblPolinomio1;
    private final JPanel pnlArribaA;
    private final JPanel pnlArribaB;
    private final JPanel pnlArribaC;
    private final JPanel pnlEnmedio;
    private final JLabel lblPolinomio2;
    private final JTextField txtCoeficiente2;
    private final JTextField txtExponente2;
    private final JButton btnAgregar2;
    private final JPanel pnlEnmedioA;
    private final JPanel pnlEnmedioB;
    private final JPanel pnlAbajo;
    private final JButton btnInsertarOtroPolinomio;
    private final JButton btnSimplificar;
    private final JButton btnResolver;
    private final JButton btnSumarPolinomios;
    private final JButton btnRestarPolinomios;
    private final JButton btnMultiplicarPolinomios;
    private final JButton btnDividirPolinomios;
    private final JPanel pnlAbajoA;
    private final JPanel pnlAbajoB;
    private final JPanel pnlAbajoC;
    private final JPanel pnlEnmedioC;
    private final JLabel lblSimplificar;
    private final JLabel lblSoluciondeX;
    private final Lista polinomio1;
    private final Lista polinomio2;

    public Pantalla() {
        super.setSize(700, 500);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setTitle("Simplificaciones de Funciones");
        super.getContentPane().setBackground(Color.WHITE);
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());

        //***************************************
        pnlArriba = new JPanel();
        pnlArriba.setLayout(new BorderLayout());

        lblInsertaDatos = new JLabel("Inserta los datos para crear Polinimios.");
        lblPolinomio1 = new JLabel("Polinomio 1");
        txtCoeficiente = new JTextField(3);
        txtExponente = new JTextField(2);
        btnAgregar = new JButton("Agregar");

        polinomio1 = new Lista();
        polinomio2 = new Lista();
        
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if ((txtCoeficiente.getText() != null) && (!txtCoeficiente.getText().equals(""))) {
                    if ((txtExponente.getText() != null) && (!txtExponente.getText().equals(""))) {
                        try {
                            polinomio1.agregarMonomio(new Monomio(txtCoeficiente.getText(), txtExponente.getText()));
                            txtCoeficiente.setText("");
                            txtExponente.setText("");
                        } catch (ValoresDiferentesException ex) {
                            Component frame = null;
                            JOptionPane.showMessageDialog(frame,
                                    "Caracter no numerico.",
                                    "ERROR",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        Component frame = null;
                        JOptionPane.showMessageDialog(frame,
                                "Caja de texto vacia.",
                                "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    Component frame = null;
                    JOptionPane.showMessageDialog(frame,
                            "Caja de texto vacia.",
                            "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pnlArribaA = new JPanel();
        pnlArribaA.add(lblInsertaDatos);
        pnlArribaA.setBackground(Color.white);
        pnlArribaB = new JPanel();
        pnlArribaB.add(lblPolinomio1);
        pnlArribaB.setBackground(Color.white);
        pnlArribaC = new JPanel();
        pnlArribaC.add(txtCoeficiente);
        pnlArribaC.add(new JLabel(" x "));
        pnlArribaC.add(txtExponente);
        pnlArribaC.add(btnAgregar);
        pnlArribaC.setBackground(Color.white);

        pnlArriba.add(pnlArribaA, BorderLayout.PAGE_START);
        pnlArriba.add(pnlArribaB, BorderLayout.CENTER);
        pnlArriba.add(pnlArribaC, BorderLayout.PAGE_END);

        super.add(pnlArriba, BorderLayout.PAGE_START);

        //***************************************
        pnlEnmedio = new JPanel();
        pnlEnmedio.setLayout(new BorderLayout());
        lblPolinomio2 = new JLabel("Polinomio 2");
        txtCoeficiente2 = new JTextField(3);
        txtExponente2 = new JTextField(2);
        btnAgregar2 = new JButton("Agregar");

        btnAgregar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if ((txtCoeficiente2.getText() != null) && (!txtCoeficiente2.getText().equals(""))) {
                    if ((txtExponente2.getText() != null) && (!txtExponente2.getText().equals(""))) {
                        try {
                            polinomio2.agregarMonomio(new Monomio(txtCoeficiente2.getText(), txtExponente2.getText()));
                            txtCoeficiente2.setText("");
                            txtExponente2.setText("");
                        } catch (ValoresDiferentesException ex) {
                            Component frame = null;
                            JOptionPane.showMessageDialog(frame,
                                    "Caracter no numerico.",
                                    "ERROR",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        Component frame = null;
                        JOptionPane.showMessageDialog(frame,
                                "Caja de texto vacia.",
                                "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    Component frame = null;
                    JOptionPane.showMessageDialog(frame,
                            "Caja de texto vacia.",
                            "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        pnlEnmedioA = new JPanel();
        pnlEnmedioA.add(lblPolinomio2, BorderLayout.PAGE_START);
        pnlEnmedioB = new JPanel();
        pnlEnmedioB.add(txtCoeficiente2);
        pnlEnmedioB.add(new JLabel(" x "));
        pnlEnmedioB.add(txtExponente2);
        pnlEnmedioB.add(btnAgregar2);
        pnlEnmedioC = new JPanel();
        pnlEnmedioC.setBackground(Color.yellow);
        lblSimplificar = new JLabel();
        lblSoluciondeX = new JLabel();
        pnlEnmedioC.add(lblSimplificar);

        pnlEnmedio.add(pnlEnmedioA, BorderLayout.PAGE_START);
        pnlEnmedio.add(pnlEnmedioB, BorderLayout.CENTER);
        pnlEnmedio.add(pnlEnmedioC, BorderLayout.PAGE_END);

        pnlEnmedio.setVisible(false);
        super.add(pnlEnmedio, BorderLayout.CENTER);

        //***************************************
        pnlAbajo = new JPanel();
        pnlAbajo.setLayout(new BorderLayout());

        pnlAbajoA = new JPanel();
        pnlAbajoA.setBackground(Color.white);
        btnSimplificar = new JButton("Simplificar");
        btnResolver = new JButton("Resolver");
        pnlAbajoA.add(btnSimplificar);
        pnlAbajoA.add(btnResolver);
        pnlAbajo.add(pnlAbajoA, BorderLayout.PAGE_START);

        btnResolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                polinomio1.recorrerLista();
            }
        });
        
        btnSimplificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                polinomio1.ordenarPorExponente();
                polinomio1.simplificar();
                polinomio1.recorrerLista();
                lblSimplificar.setText(polinomio1.toString());
            }
        });

        pnlAbajoB = new JPanel();
        pnlAbajoB.setBackground(Color.white);
        btnSumarPolinomios = new JButton("Sumar Polinomios");
        btnRestarPolinomios = new JButton("Restar Polinomios");
        btnMultiplicarPolinomios = new JButton("Multiplicar Polinomios");
        btnDividirPolinomios = new JButton("Dividir Polinomios");
        pnlAbajoB.add(btnSumarPolinomios);
        pnlAbajoB.add(btnRestarPolinomios);
        pnlAbajoB.add(btnMultiplicarPolinomios);
        pnlAbajoB.add(btnDividirPolinomios);
        pnlAbajo.add(pnlAbajoB, BorderLayout.CENTER);
        pnlAbajoB.setVisible(false);

        pnlAbajoC = new JPanel();
        pnlAbajoC.setBackground(Color.white);
        btnInsertarOtroPolinomio = new JButton("Insertar Segundo Polinomio");
        pnlAbajoC.add(btnInsertarOtroPolinomio);
        pnlAbajo.add(pnlAbajoC, BorderLayout.PAGE_END);
        btnInsertarOtroPolinomio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pnlEnmedio.setVisible(true);
                btnInsertarOtroPolinomio.setVisible(false);
                pnlAbajoB.setVisible(true);
            }
        });

        super.add(pnlAbajo, BorderLayout.PAGE_END);

        //***************************************
        super.setVisible(true);
    }

}
