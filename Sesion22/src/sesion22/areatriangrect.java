
package sesion22;

import java.util.Scanner;

public class areatriangrect {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double area,base,altura;
        
        System.out.println("Ingrese la base: ");
        base=teclado.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura=teclado.nextDouble();
        
        area=(base*altura)/2;
        
        System.out.println("El área del triángulo rectángulo es: " + area);
    }
    
}
