
package huamanacostajefferson_1;

import java.util.Scanner;

public class HuamanAcostaJefferson_1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int montoApuesta,n1,n2,n3,a1,a2,a3;
        
        System.out.println("Ingrese el monto a apostar:");
        montoApuesta=teclado.nextInt();
        System.out.println("Ingrese 3 números:");
        n1=teclado.nextByte();
        n2=teclado.nextByte();
        n3=teclado.nextByte();
        
        a1= (int) (Math.random()*3)+1;
        a2= (int) (Math.random()*3)+1;
        a3= (int) (Math.random()*3)+1;
        
        if (n1!=a1) {
            if (n2==a2) {
                if (n3==a3) {
                    montoApuesta=montoApuesta*3;
                } else {
                    montoApuesta=montoApuesta*2;
                }
            } else {
                if (n3==a3) {
                    montoApuesta=montoApuesta*2;
                } if (n3!=a3) {
                    montoApuesta=montoApuesta;
            }
        } 

    } else if (n2!=a2) {
                if (n1==a1) {
                    if (n3==a3) {
                        montoApuesta=montoApuesta*3;
                    } else {
                        montoApuesta=montoApuesta*2;
                    } 
                } else {
                    if (n3==a3) {
                        montoApuesta=montoApuesta*2;
                    } else {
                        montoApuesta=montoApuesta;
                    }
                }
            } else if (n3!=a3) {
                if (n1==a1) {
                    if (n2==a2) {
                        montoApuesta=montoApuesta*3;
                    } else {
                        montoApuesta=montoApuesta*2;
                    }
                } else {
                    if (n1!=a1) {
                        montoApuesta=montoApuesta*3;
                    } else {
                        montoApuesta=montoApuesta;
                    }
                }
            } else {
                montoApuesta=montoApuesta*4;
            }
            
            System.out.println("Sus números ingresados son: " + n1 + " " + n2 + " " + n3);
            System.out.println("Sus números generados son: " + a1 + " " + a2 + " " + a3);
            System.out.println("Ganó " + montoApuesta);
            
                
                }
    
}

