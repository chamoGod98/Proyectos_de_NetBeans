package sesion23;

import java.util.Scanner;

public class ejemplo1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
                   
        float n1,n2,prom;
        
        System.out.println("Ingrese la primera nota: ");
        n1=teclado.nextFloat();
        System.out.println("Ingrese la segunda nota: ");
        n2=teclado.nextFloat();
        
        prom=(n1+n2)/2;
        
        if (prom>=13.5) {
        System.out.println("Tu promedio es: " + prom + "(APROBADO) :)");
        }
        else {
            System.out.println("Tu promedio es: " + prom + "(DESAPROBADO) :(");
        }
    }
    
}
