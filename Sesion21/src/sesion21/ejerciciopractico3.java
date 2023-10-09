package sesion21;

import java.util.Scanner;

public class ejerciciopractico3 {
   
    public static void main(String[] args) {
       Scanner teclado =new Scanner (System.in); 
       
       double areaTotal, areaCMa, areaCMe, areaCMen, diam ;
       
       System.out.println("Ingrese el diametro");
       
       diam=teclado.nextFloat();
       
       areaCMa=Math.PI*Math.pow(diam/2,2)/2;
       areaCMe=Math.PI*Math.pow(diam/4,2)/2;
       areaCMen=Math.PI*Math.pow(diam/8,2);
       areaTotal=areaCMa+areaCMe+areaCMen;
       
       System.out.println("El área de la figura sombreada es: " + areaTotal);
       
    }
    
}

