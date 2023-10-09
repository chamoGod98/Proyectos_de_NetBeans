package ejerciciossusti;

import java.util.Scanner;

public class mesesdelaño {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        String mesesyDias[][]=new String[12][2];
        
        //Meses
        mesesyDias[0][0]="enero";
        mesesyDias[1][0]="febrero";
        mesesyDias[2][0]="marzo";
        mesesyDias[3][0]="abril";
        mesesyDias[4][0]="mayo";
        mesesyDias[5][0]="junio";
        mesesyDias[6][0]="julio";
        mesesyDias[7][0]="agosto";
        mesesyDias[8][0]="septiembre";
        mesesyDias[9][0]="octubre";
        mesesyDias[10][0]="noviembre";
        mesesyDias[11][0]="diciembre";
        
        //Número de días
        mesesyDias[0][1]="31";
        mesesyDias[1][1]="28 y 29";
        mesesyDias[2][1]="31";
        mesesyDias[3][1]="30";
        mesesyDias[4][1]="31";
        mesesyDias[5][1]="30";
        mesesyDias[6][1]="31";
        mesesyDias[7][1]="31";
        mesesyDias[8][1]="30";
        mesesyDias[9][1]="31";
        mesesyDias[10][1]="30";
        mesesyDias[11][1]="31";
        
        String nombreMes;
        
        System.out.println("\nIngrese el mes a consultar:");
        
        int i;
        do {
            nombreMes=teclado.next();
            nombreMes=nombreMes.toLowerCase();
            for (i = 0; i < 12; i++) {
                if (nombreMes.equals(mesesyDias[i][0])) {
                    System.out.println("\n" +nombreMes + " tiene " + mesesyDias[i][1] + " días");
                    break;
                } else if (i==11){
                    System.out.println("\nEl mes no existe. Ingrese un mes válido:");
                    break;
                }
            }
        } while (!nombreMes.equals(mesesyDias[i][0]));
        
    }

}
