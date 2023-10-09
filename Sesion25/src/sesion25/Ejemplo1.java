
package sesion25;

import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int vidas=5;
        vidas=vidas-1;
        System.out.println(vidas); //vidas=4
        
        //usando incremento - decremento en posfijo
        
        vidas--;
        System.out.println(vidas);
        
        vidas++;
        System.out.println(vidas);
        
        ++vidas; //usando incremento en prefijo
        System.out.println(vidas);
        
        int premio=100;
        premio=premio + vidas++;
        System.out.println(premio);
        
        System.out.println(vidas);
        
        //usando incremento-decremento en prefijo;
        
        premio=premio + ++vidas;
        System.out.println(premio); //premio=112
        System.out.println(vidas); //vidas=7
        
    }
    
}
