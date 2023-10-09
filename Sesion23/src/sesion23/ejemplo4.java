
package sesion23;

import java.util.Scanner;

public class ejemplo4 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        byte numMes;
        
        System.out.println("Ingrese el número del mes:");
        numMes=teclado.nextByte();
        
        if (numMes==1) {
            System.out.println("El mes es Enero");
        }else if (numMes==2){
            System.out.println("El mes es Febrero");
        }else if (numMes==3){
            System.out.println("El mes es Marzo");
        }else if (numMes==4){
            System.out.println("El mes es Abril");
        }else if (numMes==5){
            System.out.println("El mes es Mayo");
        }else if (numMes==6){
            System.out.println("El mes es Junio");
        }else if (numMes==7){
            System.out.println("El mes es Julio");
        }else if (numMes==8){
            System.out.println("El mes es Agosto");
        }else if (numMes==9){
            System.out.println("El mes es Septiembre");
        }else if (numMes==10){
            System.out.println("El mes es Octubre");
        }else if (numMes==11){
            System.out.println("El mes es Noviembre");
        }else if (numMes==12){
            System.out.println("El mes es Diciembre");
    } else {
            System.out.println("Mes desconocido");
}
        
            
    }
    
}
