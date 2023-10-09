
package ejerciciossusti;

import java.util.Scanner;

public class potencia {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese la base:");
        int base=teclado.nextInt();
        System.out.println("Ingrese el exponente:");
        int exponente=teclado.nextInt();
        int potencia=1;
        
        for (int i = 1; i <= exponente; i++) {
            potencia=potencia*base;
        }
        System.out.println("El resultado es: " + potencia);
        
    }
    
}
