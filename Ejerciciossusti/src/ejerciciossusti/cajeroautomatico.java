package ejerciciossusti;

import java.util.Scanner;

public class cajeroautomatico {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;
        double saldo = 500, retiro, deposito;
        String opcionRetiro, opcionDeposito;
        System.out.println("\nBIENVENIDO");

        do {
            System.out.println("\n-------------------------------");
            System.out.println("\nElija una opción:");
            System.out.println("    1. Consulta de saldo");
            System.out.println("    2. Retiro de efectivo");
            System.out.println("    3. Depósito de efectivo");
            System.out.println("    4. Salir");
            opcion = teclado.nextInt();
            if (opcion >= 1 & opcion <= 4) {
                switch (opcion) {
                    case 1:
                        System.out.println("\nSu saldo actual es: " + saldo+" nuevos soles");
                        break;
                    case 2:
                        do {
                            System.out.println("\n¿Cuánto desea retirar?");
                            retiro = teclado.nextDouble();
                            if (retiro > saldo) {
                                System.out.println("\nUsted no cuenta con saldo disponible para realizar esta transacción");
                                break;
                            } else {
                                saldo = saldo - retiro;
                                System.out.println("\nRetiraste: " + retiro);
                                System.out.println("Su saldo actual es: " + saldo+ " nuevos soles");
                                System.out.println("\n¿Desea seguir retirando? s=sí  n=no");
                                opcionRetiro = teclado.next();
                            }
                        } while (opcionRetiro.equals("s") | retiro > saldo);
                        break;
                    case 3:
                        do {
                            System.out.println("\n¿Cuánto desea depositar?");
                            deposito = teclado.nextDouble();
                            saldo = saldo + deposito;
                            System.out.println("\nHa depositado: " + deposito);
                            System.out.println("Su saldo actual es: " + saldo+" nuevos soles");
                            System.out.println("\n¿Desea seguir retirando? s=sí  n=no");
                            opcionDeposito = teclado.next();
                        } while (opcionDeposito.equals("s"));
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("\nINGRESE UNA OPCIÓN VÁLIDA");
            }
        } while (opcion != 4);
        System.out.println("\nOPERACIÓN FINALIZADA");

    }

}
