package huamanacostaexamen;

import java.util.Scanner;

public class HuamanAcostaExamen {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String producto[] = new String[4];
        String precioProducto[] = new String[4];
        String usuario;
        String opción;
        int contraseña;

        System.out.println("\n'BIENVENIDO'");
        System.out.println("\nIngrese usuario y contraseña:");

        usuario = teclado.next();
        contraseña = teclado.nextInt();

        if ((usuario.equals("prueba")) & (contraseña == 123)) {
            System.out.println("Menú del sistema");
            System.out.println("    (I)ngresar productos");
            System.out.println("    (C)onsultar precio de productos");
            System.out.println("    (V)ender productos");
            System.out.println("    (B)ase de productos");
            System.out.println("    (S)alir");
            System.out.println("Su opción es:");
        } else {
            if ((usuario.equals("admin")) & (contraseña == 789)) {
                System.out.println("Menú del sistema");
                System.out.println("    (I)ngresar productos");
                System.out.println("    (C)onsultar precio de productos");
                System.out.println("    (V)ender productos");
                System.out.println("    (B)ase de productos");
                System.out.println("    (S)alir");
                System.out.println("    (M)antenimiento");
                System.out.println("Su opción es:");
            } else {
                System.out.println("EL USUARIO Y LA CONTRASEÑA NO COINCIDEN");
            }
        }

        opción = teclado.next();

        while ((opción != "I") | (opción != "C") | (opción != "V") | (opción != "B") | (opción != "S") | (opción != "M")) {
            if (opción.equals("I")) {
                for (int i = 0; i < 4; i++) {
                    System.out.println("Ingrese el nombre y precio del producto " + (i+1));
                    producto[i] = teclado.next();
                    precioProducto[i] = teclado.next();
                }

            }
        }

    }
}
