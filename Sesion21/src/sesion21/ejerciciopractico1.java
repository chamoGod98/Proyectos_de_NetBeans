
package sesion21;

import java.util.Scanner;

public class ejerciciopractico1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        float baseM,basem,altura,area;
        
        System.out.println(" ");
        System.out.println("Ingrese la base mayor:");
        baseM = teclado.nextFloat();
        System.out.println("Ingrese la base menor:");
        basem = teclado.nextFloat();
        System.out.println("Ingrese la altura:");
        altura = teclado.nextFloat();
        
        area=(baseM+basem)*altura/2;
        System.out.println("El area del trapecio regular es: " + area);
    }
    
}
