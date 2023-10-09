package sesion23;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        byte numMes;

        System.out.println("Ingrese el número del mes:");
        numMes = teclado.nextByte();

        switch (numMes) {
            case 12,1,2:
                System.out.println("Verano");
                break;
            case 3,4,5:
                System.out.println("Otoño");
                break;
            case 6,7,8:
                System.out.println("Invierno");
                break;
            case 9,10,11:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Estación desconocida");
                break;
        }

    }

}
