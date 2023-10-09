package arreglo;

import java.util.Scanner;

public class arreglobidim {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String paisyCapital[][] = new String[4][2];

        paisyCapital[0][0] = "Perú";
        paisyCapital[1][0] = "México";
        paisyCapital[2][0] = "Ecuador";
        paisyCapital[3][0] = "Colombia";
        paisyCapital[0][1] = "Lima";
        paisyCapital[1][1] = "Ciudad de México";
        paisyCapital[2][1] = "Quito";
        paisyCapital[3][1] = "Bogotá";

        System.out.println("País" + "         Capital");
        System.out.println(" ");

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 2; j++) {
                System.out.print("");
                System.out.print(paisyCapital[i][j] + " ");

            }
            System.out.println("\n");
        }
    }
}
