package sesion22;

import java.util.Scanner;

public class areatriang {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double area,p,a,b,c,const1,const2,const3,radicando;
        
        System.out.println("Ingrese el primer lado: ");
        a=teclado.nextDouble();
        System.out.println("Ingrese el segundo lado: ");
        b=teclado.nextDouble();
        System.out.println("Ingrese el tercer lado: ");
        c=teclado.nextDouble();
        
        p=(a+b+c)/2;
        const1=p-a;
        const2=p-b;
        const3=p-c;
        radicando=p*const1*const2*const3;
        
        area=Math.sqrt(radicando);
        
        System.out.println("El área de la figura es: " + area);
        System.out.printf(area +" = %.2f %n",area);
        
    }
    
}
