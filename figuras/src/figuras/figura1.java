package figuras;

import java.util.Scanner;

public class figura1 {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        //Elaborar un cuadrado
        
        int ancho;
        
        System.out.println("\nIngrese el ancho del lado:");
        do {
            ancho=teclado.nextInt();
            if (ancho>20 | ancho<3) {
                System.out.println("Ingrese un número menor que 3 o mayor que 20:");
            } else {
                break;
            }
        } while (ancho>20 | ancho<3);
        
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    
}
