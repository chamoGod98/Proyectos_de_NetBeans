package ejerciciossusti;

import java.util.Scanner;

public class Ejerciciossusti {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double n1, n2, resultado=0;
        int operacion;
        String continuar;
        System.out.println("BIENVENIDO");
        System.out.println("\nIngrese dos números:");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            do {
                System.out.println("\nElija una opción:");
                operacion = teclado.nextInt();
                switch (operacion) {
                    case 1:
                        resultado = n1 + n2;
                        break;
                    case 2:
                        resultado = n1 - n2;
                        break;
                    case 3:
                        resultado = n1 * n2;
                        break;
                    case 4:
                        resultado = n1 / n2;
                        break;
                    default:
                        System.out.println("\nIngrese una opción correcta");
                }
            } while ((operacion <= 1 | operacion >= 4));
            System.out.println("El resultado es: " + resultado);
            System.out.println("\n¿Desea continuar? s=sí n=no");
            continuar = teclado.next();
        } while (continuar.equals("s"));

    }

}
