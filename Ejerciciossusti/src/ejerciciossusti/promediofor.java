
package ejerciciossusti;

import java.util.Scanner;

public class promediofor {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        float prom,promF,acum=0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el promedio " + i);
            prom=teclado.nextFloat();
            acum=acum+prom;
        }
        promF=acum/10;
        System.out.println("El promedio final es: " + promF);
    }
    
}
