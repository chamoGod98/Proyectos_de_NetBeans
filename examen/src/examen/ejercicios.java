
package examen;

import java.util.Scanner;

public class ejercicios {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int x=10;
        System.out.println("Resultado de X: x= "+x);
        int y=x++;
        System.out.println("Resultado de X y Y: X= "+x+", y= "+y);
        int z=++y;
        System.out.println("Resultado de Z y Y: Z= "+z+", y= "+y);
        int w=z--;
        System.out.println("Resultado de W y Z: w= "+w+", z= "+z);
        int v=--w;
        System.out.println("Resultado de V y W: v= "+v+", w= "+w);
    }
    
}
