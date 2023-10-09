package sesion3;

import java.util.Scanner;

public class ejercicio2impares {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, j = 1, suma = 0;

        do {
            System.out.println("\nIngrese un número:");
            n = teclado.nextInt();
            if (n < 1) {
                System.out.println("\nIngrese un número válido");
            } else {
                break;
            }
        } while (n < 1);

        System.out.println("\nn=" + n);

        for (int i = 1; i <= n; i++) {
            suma = suma + i;
            System.out.println("La suma de los " + j + " primeros enteros impares es " + suma);
            i++;
            j++;
        }

    }

}
