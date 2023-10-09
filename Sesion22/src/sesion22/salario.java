
package sesion22;

import java.util.Scanner;

public class salario {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int nDias;
        float salario,montDia;
        
        System.out.println("Ingrese el número de días que trabajó el obrero:");
        nDias=teclado.nextInt();
        System.out.println("Ingrese el monto por día:");
        montDia=teclado.nextFloat();
        
        salario=montDia*nDias;
        
        System.out.println("El salario del trabajador es: " + salario);
        System.out.printf(salario +" = %.2f %n",salario); //opcional
    }
    
}
