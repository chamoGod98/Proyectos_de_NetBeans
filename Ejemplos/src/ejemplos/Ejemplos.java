package ejemplos;

import java.util.Scanner;

public class Ejemplos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nota[] = new int[5];

        String calificacion[] = new String[5];

        calificacion[0] = "Deficiente";
        calificacion[1] = "En proceso";
        calificacion[2] = "Logrado";
        calificacion[3] = "Sobresaliente";
        calificacion[4] = "Excepcional";
        
        String respuesta[] = new String[5];
        
        respuesta[0]="no info";
        respuesta[1]="no info";
        respuesta[2]="no info";
        respuesta[3]="no info";
        respuesta[4]="no info";

        for (int i = 0; i < 5; i++) {
            System.out.println("\nIngrese la nota " + (i+1));
            do {
                nota[i] = teclado.nextInt();
                if (nota[i] < 0 | nota[i] > 20) {
                    System.out.println("\nINGRESE UNA NOTA VÁLIDA ENTRE 0 Y 20");
                } else {
                    if (nota[i] <= 8) {
                        respuesta[i]=calificacion[0];
                    } else if (nota[i] >= 9 & nota[i] <= 13) {
                        respuesta[i]=calificacion[1];
                    } else if (nota[i] >= 14 & nota[i] <= 16) {
                        respuesta[i]=calificacion[2];
                    } else if (nota[i] >= 17 & nota[i] <= 18) {
                        respuesta[i]=calificacion[3];
                    } else if (nota[i] >= 19 & nota[i] <= 20) {
                        respuesta[i]=calificacion[4];
                    }
                }
            } while (nota[i] < 0 | nota[i] > 20);
        }
        
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota "+ nota[i] +"  "+respuesta[i]);
        }

    }

}
