package sesion01;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero,cifra1,cifra2,cifra3,suma;
        
        System.out.println("Ingrese un número de 3 cifras:");
        
        do {
            numero=teclado.nextInt();
            if (numero<100 | numero>999) {
                System.out.println("\nINTENTE NUEVAMENTE");
            } else {
                break;
            }
        } while (numero<100 | numero>999);
        
        cifra1=numero/100;
        cifra2=(numero/10)%10;
        cifra3=numero%10;
        
        suma=cifra1+cifra3;
        
        System.out.println("La suma de los extremos es "+suma);
        
        if (suma>cifra2) {
            System.out.println("\nLa suma de los extremos es mayor al dígito intermedio");
        } else if (suma<cifra2) {
            System.out.println("\nLa suma de los extremos es menor al dígito intermedio");
        } else if (suma==cifra2) {
            System.out.println("\nLa suma de los extremos es igual al dígito intermedio");
        }
        
    }
    
}
