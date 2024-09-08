import java.util.Scanner;

public class LetraONumero {
    public static String evaluar(char caracter) {
        int codigoAscii = (int) caracter;
        
        if (codigoAscii >= 48 && codigoAscii <= 57) {
            return "Es número";
        }
        if (codigoAscii >= 65 && codigoAscii <= 90) {
            return "Es letra mayúscula";
        }
        if (codigoAscii >= 97 && codigoAscii <= 122) {
            return "Es letra minúscula";
        }
        return "No es letra ni número";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
