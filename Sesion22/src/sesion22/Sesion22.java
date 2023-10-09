package sesion22;

public class Sesion22 {

    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        
        System.out.println("Conversión de int a byte:");
        b = (byte) 1;
        System.out.println("i y b " + i + " " + b);
        System.out.println(" ");
        System.out.println("Conversión de double a int:");
        i = (int) d;
        System.out.println("d y i " + d + " " + i);
        System.out.println(" ");
        System.out.println("Conversión de double a byte:");
        b = (byte) d;
        System.out.println("d y b " + d + " " + b);
        
    }
    
}
