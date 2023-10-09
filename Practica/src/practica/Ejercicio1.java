
package practica;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int LM,lm1,lm2;
        
        System.out.println("Ingrese el lado mayor:");
        LM=teclado.nextByte();
        System.out.println("Ingrese los lados menores:");
        lm1=teclado.nextByte();
        lm2=teclado.nextByte();
        
        if (LM<lm1+lm2) {
            if (LM == lm1 & lm1 == lm2 & LM == lm2) {
                System.out.println("El triángulo existe (equilátero)");
            } else {
                if (LM == lm1 | LM == lm2 | lm1 == lm2) {
                    System.out.println("El triángulo existe (isósceles)");
                } else {
                    if (LM != lm1 & LM != lm2 & lm1 != lm2) {
                        System.out.println("El triángulo existe (escaleno)");
                    }
                }
            }
        } else {
            System.out.println("El triángulo no existe");
        }
        
    }
    
}
