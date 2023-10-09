
package medidordehabilidadesbasketball;

import java.util.Scanner;

public class MedidorDeHabilidadesBasketball {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String Habilidades[]=new String[10];
        int puntajes[]=new int[10];
        
        Habilidades[0]="Defensa";
        Habilidades[1]="Manejo de balón";
        Habilidades[2]="Salto/rebote";
        Habilidades[3]="Resistencia física";
        Habilidades[4]="Entradas/ataque";
        Habilidades[5]="Tiro";
        Habilidades[6]="Lectura/visión de juego";
        Habilidades[7]="Juego colectivo";
        Habilidades[8]="Precisión de pase de balón";
        Habilidades[9]="Teoría del basket";
        
        for (int i = 0; i < 10; i++) {
            System.out.println("\nIngrese el puntaje de "+Habilidades[i]+ ":");
            do {
                puntajes[i]=teclado.nextInt();
                if (puntajes[i]<0 | puntajes[i]>10) {
                    System.out.println("Ingrese un puntaje del 1 al 10:");
                }
            } while (puntajes[i]<0 | puntajes[i]>10);
        }
        
        System.out.println("\n"+Habilidades[0]+ ":                       "+puntajes[0]);
        System.out.println(Habilidades[1]+ ":               "+puntajes[1]);
        System.out.println(Habilidades[2]+ ":                  "+puntajes[2]);
        System.out.println(Habilidades[3]+ ":            "+puntajes[3]);
        System.out.println(Habilidades[4]+ ":               "+puntajes[4]);
        System.out.println(Habilidades[5]+ ":                          "+puntajes[5]);
        System.out.println(Habilidades[6]+ ":       "+puntajes[6]);
        System.out.println(Habilidades[7]+ ":               "+puntajes[7]);
        System.out.println(Habilidades[8]+ ":    "+puntajes[8]);
        System.out.println(Habilidades[9]+ ":             "+puntajes[9]);
        
    }
    
}
