
package arreglo;

import java.util.Scanner;

public class arreglosesionultima {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int numeros[]= new int [5];
        int acum=0;
        
        float prom;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el dato " +(i+1));
            numeros[i]=teclado.nextInt();
            acum=acum+numeros[i];
        }
        
        prom=(float)(acum/5);
        System.out.println("El promedio es:" + prom);
        }
        
    }
    

