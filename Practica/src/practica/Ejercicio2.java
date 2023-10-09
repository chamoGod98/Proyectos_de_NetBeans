
package practica;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String sexo;
        System.out.println("Ingrese sexo (M) Masculino (F) Femenino");
        sexo = teclado.next();
        sexo = sexo.toUpperCase();
        switch (sexo) {
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Femenino");
                break;
            default:
                if (sexo.length() > 1) {
                    System.out.println("Ingrese una sola letra");
                } else {
                    System.out.println("Letra desconocidad");

                }

        }
    }
}
