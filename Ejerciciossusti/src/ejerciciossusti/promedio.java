
package ejerciciossusti;

import java.util.Scanner;

public class promedio {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double acum=0,prom,promF;
        int i=0;
        
        do {
            System.out.println("Ingrese el promedio " + (i+1) + " (ingrese 0 para finalizar)");
            prom=teclado.nextDouble();
            acum=acum+prom;
            i=i+1;
        } while (prom!=0);
        
        promF=acum/(i-1);
        System.out.println("El promedio final es: " + promF);
        
        
    }
    
}
