
package practica;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double montoT,montoP,vol,costoM3,d1=0.05,d2=0.1,d3=0.15;
        
        System.out.println("Ingrese el volumen del agua:");
        vol=teclado.nextDouble();
        System.out.println("Ingrese el costo por metro cúbico:");
        costoM3=teclado.nextDouble();
        
        montoP=vol*costoM3;
        if (montoP>0 & montoP<250) {
            montoT=montoP-(d1*montoP);
        } else {
            if (montoP>=250 & montoP<500) {
                montoT=montoP-(d2*montoP);
            } else {
                montoT=montoP-(d3*montoP);
                }
            }
        
        System.out.println("El monto parcial es: " + montoP);
        System.out.println("El descuento es: " + (montoT-montoP)/montoP);
        System.out.println("El monto total a pagar es: " + montoT);
        }
        
    }
