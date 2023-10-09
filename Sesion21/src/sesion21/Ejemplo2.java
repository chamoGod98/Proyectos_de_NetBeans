
package sesion21;
import java.util.Scanner;
public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float a,b,c,d,e,prom;
        
        System.out.println("Ingrese la nota 1");
        a = teclado.nextFloat();
        System.out.println("Ingrese la nota 2");
        b = teclado.nextFloat();
        System.out.println("Ingrese la nota 3");
        c = teclado.nextFloat();
        System.out.println("Ingrese la nota 4");
        d = teclado.nextFloat();
        System.out.println("Ingrese la nota 5");
        e = teclado.nextFloat();
        
        prom = a+b+c+d+e/5;
        
        System.out.println("El promedio es: " + prom);
        
        
    }
    
}
