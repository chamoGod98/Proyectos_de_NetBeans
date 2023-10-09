package sesion21;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
                
        float F,C;
        
        System.out.println(" ");
        System.out.println("Ingrese la temperatura en grados Celsius (°C):");
        C = teclado.nextFloat();
        
        F = 9*C/5+32;
        System.out.println(" ");
        System.out.println("La temperatura en grados Farenheit (°F) es: " + F);
    }
    
}
