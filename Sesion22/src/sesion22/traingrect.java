
package sesion22;

import java.util.Scanner;

public class traingrect {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        double h,c1,c2,sumacatetos;
        
        System.out.println(" ");
        System.out.println("Ingrese la longitud del cateto 1: ");
        c1=teclado.nextDouble();
        System.out.println("Ingrese la longitud del cateto 2: ");
        c2=teclado.nextDouble();
        
        sumacatetos=c1+c2;
        h=Math.sqrt(sumacatetos);
        
        System.out.println(" ");
        System.out.println("La longitud de la hipotenusa es: " + h);
        System.out.printf(h +" = %.2f %n",h);
    }
    
}
