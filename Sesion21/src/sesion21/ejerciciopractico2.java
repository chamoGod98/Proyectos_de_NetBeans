
package sesion21;

import java.util.Scanner;

public class ejerciciopractico2 {

    public static void main(String[] args) {
           
        Scanner teclado = new Scanner (System.in);
        
        int n1,n2,n3,n4;
        float prom;
        
        System.out.println(" ");
        System.out.println("Ingrese la nota 1:");
        n1=teclado.nextInt();
        System.out.println("Ingrese la nota 2:");
        n2=teclado.nextInt();
        System.out.println("Ingrese la nota 3:");
        n3=teclado.nextInt();
        System.out.println("Ingrese la nota 4:");
        n4=teclado.nextInt();
        
        prom=(15*n1/100) + (15*n2/100) + (35*n3/100) + (35*n4/100);
        
        System.out.println(" ");
        System.out.println("El promedio final es: " + prom);
        
    }
    
}
