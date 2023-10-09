package sesion01;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cant = 500;
        int numP;

        System.out.println("BIENVENIDO");
        
        do {
            System.out.println("Ingrese el número de pizzas en su pedido:"); //Siempre muestra 
            do {
                numP=teclado.nextInt();
                if (numP<=0 | numP>500) {
                    System.out.println("\nINGRESE UNA CANTIDAD VÁLIDA");
                } else {
                    cant=cant-numP;
                    System.out.println("\nVENTA REALIZADA");
                    System.out.println("Número de pizzas disponibles: "+cant);
                }
            } while (numP<=0 | numP>500);
            if (cant<100 & cant>0) {
                System.out.println("\nAVISO: Número de pizzas menor a 100");
            }
        } while (cant > 0 & cant < 500);

    }

}
