import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculadora extends JFrame {

    //Atributos
    private JPanel panelCalculadora;
    private JButton btn7;
    private JButton btn4;
    private JButton btn1;
    private JButton btnPunto;
    private JButton btn8;
    private JButton btn5;
    private JButton btn2;
    private JButton btn0;
    private JButton btn9;
    private JButton btn6;
    private JButton btn3;
    private JButton btnIgual;
    private JButton btnDivision;
    private JButton btnMultiplicacion;
    private JButton btnResta;
    private JButton btnSuma;
    private JButton btnC;
    private JButton btnBorrar;
    private JLabel lblResultado;

    private String textoActual = "0";
    private String operador = "";
    private double numero1 = 0;
    private double numero2 = 0;
    private OperacionesMate operaciones = new OperacionesMate (); //Instaciar objeto de OperacionesMate


    //Constructor
    public Calculadora (){

        setContentPane(panelCalculadora);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setEnabled(true);
        setTitle("Calculadora");
        setSize(500, 500);
        setVisible(true);

        lblResultado.setText("0"); //Establecer el Label de resultado en cero

        //Leer botones de numeros
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = operaciones.agregarNumero(textoActual, "0");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = operaciones.agregarNumero(textoActual, "1");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = operaciones.agregarNumero(textoActual, "2");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = operaciones.agregarNumero(textoActual, "3");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = operaciones.agregarNumero(textoActual, "4");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = operaciones.agregarNumero(textoActual, "5");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = operaciones.agregarNumero(textoActual, "6");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = operaciones.agregarNumero(textoActual, "7");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = operaciones.agregarNumero(textoActual, "8");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = operaciones.agregarNumero(textoActual, "9");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });



        //Leer botones de operadores
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador = "+";//Almacena el tipo de operacion en la variabel
                System.out.println(operador);
                numero1 = operaciones.convertirNum(textoActual);//Convierte en numero tipo Double el texto y almacena en variable
                textoActual = "0";//Resetea el texto a cero
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador = "-";
                numero1 = operaciones.convertirNum(textoActual);
                textoActual = "0";
                lblResultado.setText(textoActual);
            }
        });
        btnMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador = "X";
                numero1 = operaciones.convertirNum(textoActual);
                textoActual = "0";
                lblResultado.setText(textoActual);
            }
        });
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador = "/";
                numero1 = operaciones.convertirNum(textoActual);
                textoActual = "0";
                lblResultado.setText(textoActual);
            }
        });

        //Leer boton igual (=)
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    numero2 = operaciones.convertirNum(textoActual);

                    textoActual = operaciones.calcularResultado(
                            numero1,
                            numero2,
                            operador
                    );

                    lblResultado.setText(textoActual);

                } catch (ArithmeticException ex) {

                    lblResultado.setText("Error");

                    textoActual = "0";
                    numero1 = 0;
                    numero2 = 0;
                    operador = "";
                }
            }
        });

    }


}
