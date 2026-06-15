import java.security.PublicKey;

public class OperacionesMate {

    //Constructor
    public OperacionesMate (){}


    //Metodos

    public String agregarNumero (String textoActual, String numero){
        if (textoActual.equals("0")){
            System.out.println(numero);
            return numero;
        }else {
            System.out.println(textoActual + numero);
            return textoActual + numero; //Agrega los digitos ingresados al numero almacenado
        }
    }

    public double convertirNum (String textoActual){
        double numero = Double.parseDouble(textoActual);//Convierte el texto en numero de tipo Double
        return numero;
    };

    public String calcularResultado (double num1, double num2, String operador){
        switch (operador){
            //Suma
            case "+":
                System.out.println(num1 + num2);
                return String.valueOf(num1 + num2);//Realiza la suma y devuelve el valor en String
            case "-":
                return String.valueOf(num1 - num2);
            case "X":
                return String.valueOf(num1 * num2);
            case "/":
                return String.valueOf(num1 / num2);
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);//Excepcion
        }
    }
}