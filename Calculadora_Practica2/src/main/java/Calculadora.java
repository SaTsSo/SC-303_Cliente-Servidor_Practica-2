
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
    private boolean mostrarResultado;
    private boolean operadorPresionado;


    //Constructor
    public Calculadora (){

        setContentPane(panelCalculadora);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setEnabled(true);
        setTitle("Calculadora");
        setSize(550, 600);
        setLocationRelativeTo(null); //Centra la ventana
        setVisible(true);

        lblResultado.setText("0"); //Establecer el Label de resultado en cero

        //Leer botones de numeros
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mostrarResultado){// con este if controlamos que no se precione multiples veces el boton igual y arroje multiples errores
                    textoActual = "0";// seteamos en 0 para no imprimir a la par del resultado
                }
                mostrarResultado = false; // reiniciamos el control de presion multiple del igual
                textoActual = operaciones.agregarNumero(textoActual, "0");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mostrarResultado){// con este if controlamos que no se precione multiples veces el boton igual y arroje multiples errores
                    textoActual = "0";// seteamos en 0 para no imprimir a la par del resultado
                }
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual

                textoActual = operaciones.agregarNumero(textoActual, "1");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mostrarResultado){// con este if controlamos que no se precione multiples veces el boton igual y arroje multiples errores
                    textoActual = "0";// seteamos en 0 para no imprimir a la par del resultado
                }
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual

                textoActual = operaciones.agregarNumero(textoActual, "2");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mostrarResultado){// con este if controlamos que no se precione multiples veces el boton igual y arroje multiples errores
                    textoActual = "0";// seteamos en 0 para no imprimir a la par del resultado
                }
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual

                textoActual = operaciones.agregarNumero(textoActual, "3");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mostrarResultado){ // con este if controlamos que no se precione multiples veces el boton igual y arroje multiples errores
                    textoActual = "0"; // seteamos en 0 para no imprimir a la par del resultado
                }
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual

                textoActual = operaciones.agregarNumero(textoActual, "4");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mostrarResultado){// con este if controlamos que no se precione multiples veces el boton igual y arroje multiples errores
                    textoActual = "0";// seteamos en 0 para no imprimir a la par del resultado
                }
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual

                textoActual = operaciones.agregarNumero(textoActual, "5");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mostrarResultado){// con este if controlamos que no se precione multiples veces el boton igual y arroje multiples errores
                    textoActual = "0";// seteamos en 0 para no imprimir a la par del resultado
                }
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual

                textoActual = operaciones.agregarNumero(textoActual, "6");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mostrarResultado){// con este if controlamos que no se precione multiples veces el boton igual y arroje multiples errores
                    textoActual = "0";// seteamos en 0 para no imprimir a la par del resultado
                }
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual

                textoActual = operaciones.agregarNumero(textoActual, "7");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mostrarResultado){// con este if controlamos que no se precione multiples veces el boton igual y arroje multiples errores
                    textoActual = "0";// seteamos en 0 para no imprimir a la par del resultado
                }
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual

                textoActual = operaciones.agregarNumero(textoActual, "8");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mostrarResultado){// con este if controlamos que no se precione multiples veces el boton igual y arroje multiples errores
                    textoActual = "0";// seteamos en 0 para no imprimir a la par del resultado
                }
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual

                textoActual = operaciones.agregarNumero(textoActual, "9");//Segun el numero digitado agrega el digito al numero almacenado
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });



        //Leer botones de operadores
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual

                if (!operadorPresionado) {// controlamos el presionamiento del operador
                    operador = "+";//Almacena el tipo de operacion en la variabel
                    System.out.println(operador);
                    numero1 = operaciones.convertirNum(textoActual);//Convierte en numero tipo Double el texto y almacena en variable
                    textoActual = "0";//Resetea el texto a cero
                    operadorPresionado = true;// hacemos que sea true para que no se presione varias veces el operador
                }
                lblResultado.setText(textoActual);//Modifica el texto en el label con el numero tipo String actual
            }
        });
        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual
                if (!operadorPresionado) {// controlamos el presionamiento del operador
                    operador = "-";
                    numero1 = operaciones.convertirNum(textoActual);
                    textoActual = "0";
                    operadorPresionado = true;// hacemos que sea true para que no se presione varias veces el operador
                }
                lblResultado.setText(textoActual);
            }
        });
        btnMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual
                if (!operadorPresionado) {// controlamos el presionamiento del operador
                    operador = "X";
                    numero1 = operaciones.convertirNum(textoActual);
                    textoActual = "0";
                    operadorPresionado = true;// hacemos que sea true para que no se presione varias veces el operador
                }
                lblResultado.setText(textoActual);
            }
        });
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarResultado = false;// reiniciamos el control de presion multiple del igual
                if (!operadorPresionado) { // controlamos el presionamiento del operador
                    operador = "/";
                    numero1 = operaciones.convertirNum(textoActual);
                    textoActual = "0";
                    operadorPresionado = true;// hacemos que sea true para que no se presione varias veces el operador
                }
                lblResultado.setText(textoActual);
            }
        });

        //Leer boton igual (=)
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if(mostrarResultado){
                        return; //Retornamos nada para que ignore la excepcion y errores
                    }
                    numero2 = operaciones.convertirNum(textoActual);

                    textoActual = operaciones.calcularResultado(
                            numero1,
                            numero2,
                            operador
                    );

                    lblResultado.setText(textoActual);
                    mostrarResultado = true;
                    operadorPresionado = false;


                } catch (ArithmeticException ex) {

                    lblResultado.setText("Error");

                    textoActual = "0";
                    numero1 = 0;
                    numero2 = 0;
                    operador = "";
                }
            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = "0"; //limpiamos el texto
                lblResultado.setText(textoActual);
                operadorPresionado = false; //controladores de presionamiento
                mostrarResultado= false;//controladores de presionamiento
            }
        });

        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = 0;
                numero2 = 0;
                operador = "";
                textoActual = "0";
                lblResultado.setText(textoActual); //limpiamos toda la vista
                operadorPresionado = false;//controladores de presionamiento
                mostrarResultado= false;//controladores de presionamiento
            }
        });

        btnPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoActual = operaciones.agregarPunto(textoActual); //agregamos punto al numero

                lblResultado.setText(textoActual);

            }
        });

    }


}
