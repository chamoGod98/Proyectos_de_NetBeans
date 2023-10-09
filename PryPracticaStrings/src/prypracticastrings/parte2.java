package prypracticastrings;

public class parte2 {

    public static void main(String[] args) {
        String s1 = "hola a todos";
        char arregloChar[] = new char[5];
        System.out.printf("s1: %s", s1);
        System.out.printf("Longitud de s1: %d", s1.length());
        System.out.print("La cadena invertida es: ");
        for (int cuenta = s1.length() - 1; cuenta >= 0; cuenta--) {
            System.out.printf("%s",s1.charAt(cuenta));
        }
    }

}
