package sesion21;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        String nombre;
        char sexo;
        int añoNac,edad;
        float altura,sueldo;
        
        System.out.println("Ingrese el nombre del trabajador");
        nombre = teclado.next();
        
        System.out.println("Ingrese el naño de nacimiento");
        añoNac = teclado.nextInt();
        
        System.out.println("Ingrese la altura");
        altura = teclado.nextFloat();
        
        System.out.println("Ingrese la edad");
        edad = teclado.nextInt();
        
        System.out.println("Ingrese el sueldo (en soles)");
        sueldo = teclado.nextFloat();
        
        System.out.println("Ingrese el sexo");
        sexo = teclado.next().charAt(0);
        
        System.out.println(" ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Año da nacimiento: " + añoNac);
        System.out.println("Altura: " + altura);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Sexo: " + sexo);
        
    }
    
}
