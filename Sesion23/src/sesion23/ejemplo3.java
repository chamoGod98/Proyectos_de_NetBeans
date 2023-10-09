
package sesion23;

import java.util.Scanner;

public class ejemplo3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n1,n2,n3;
        String orden;
        
        System.out.println("Ingrese los 3 números:");
        
        n1=teclado.nextInt();
        n2=teclado.nextInt();
        n3=teclado.nextInt();
        
        if (n1!=n2 & n2!=n3 & n1!=n3) {
            //código de ordenación
            if (n1>n2){
                if (n2>n3){
                    orden = n1 + " " + n2 + " " + n3;
                }else
                {
                    if (n1>n3){
                        orden = n1 + " " + n3 + " " + n2;
                    } else {
                        orden = n3 + " " + n1 + " " + n2;
                    }
                }
            } else {
                if (n2>n3) {
                    if (n1>n3) {
                        orden = n2 + " " + n1 + " " + n3;
                    } else {
                        orden = n2 + " " + n3 + " " + n1;
                    }
                } else {
                    orden = n3 + " " + n2 + " " + n1;
                }
            }
            System.out.println("Los números ordenados son: " + orden);
        }else{
                System.out.println("Los números no son diferentes");
                }
    }
    
}
