package ejercicios;

import java.util.Scanner;

public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        if (numVictoriasA < 0 || numVictoriasB < 0 || numVictoriasA > 7 || numVictoriasB > 7) {
            return "Inválido";
        }
        if ((numVictoriasA == 7 && numVictoriasB < 5) || (numVictoriasB == 7 && numVictoriasA < 5)) {
            return "Inválido";
        }
        if (numVictoriasA >= 6 && numVictoriasA >= numVictoriasB + 2) {
            return "Ganó A";
        }
        if (numVictoriasB >= 6 && numVictoriasB >= numVictoriasA + 2) {
            return "Ganó B";
        }
        if (numVictoriasA == 7 && numVictoriasB == 6) {
            return "Ganó A";
        }
        if (numVictoriasB == 7 && numVictoriasA == 6) {
            return "Ganó B";
        }
        if (numVictoriasA < 7 && numVictoriasB < 7) {
            return "Aún no termina";
        }
        return "Inválido";
    }

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
