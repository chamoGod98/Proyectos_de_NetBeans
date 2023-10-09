
package arreglo;

import java.util.Scanner;

public class Ejerciciov2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int dias_del_mes [] =new int[12];
        dias_del_mes[0] = 31;
        dias_del_mes[1] = 28;
        dias_del_mes[2] = 31;
        dias_del_mes[3] = 30;
        dias_del_mes[4] = 31;
        dias_del_mes[5] = 30;
        dias_del_mes[6] = 31;
        dias_del_mes[7] = 31;
        dias_del_mes[8] = 30;
        dias_del_mes[9] = 31;
        dias_del_mes[10] = 30;
        dias_del_mes[11] = 31;
        
        String nombre_mes [] =new String[12];
        nombre_mes[0] = "enero";
        nombre_mes[1] = "febrero";
        nombre_mes[2] = "marzo";
        nombre_mes[3] = "abril";
        nombre_mes[4] = "mayo";
        nombre_mes[5] = "junio";
        nombre_mes[6] = "julio";
        nombre_mes[7] = "agosto";
        nombre_mes[8] = "septiembre";
        nombre_mes[9] = "octubre";
        nombre_mes[10] = "noviembre";
        nombre_mes[11] = "diciembre";
        
        int i=0;
        String mes;
        System.out.println("Ingrese el mes a consultar:");
        mes=teclado.next().toLowerCase();
        
        while (!mes.equals(nombre_mes[i])) {
            i++;
            if (i==12) {
                break;
            }
        }
        
        if (i<=11) { 
            System.out.println(nombre_mes[i] + " tiene " + dias_del_mes[i] + " días ");
        } else {
            System.out.println("El mes ingresado es desconocido");
        }
        
        
            
    }
    
}
