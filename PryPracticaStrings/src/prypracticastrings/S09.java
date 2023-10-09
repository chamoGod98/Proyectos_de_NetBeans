package prypracticastrings;
public class S09 {
public static void main(String[] args) {

    char arregloChar[]= {'f','e','l','i','z',' ','c','u','m','p','l','e','a','ñ','o','s'};
    String s = new String("Hola");
    
    String s1 = new String();
    String s2= new String(s);
    String s3=new String (arregloChar);
    String s4=new String(arregloChar,6,10);
    
        System.out.println("s1" + " = " + s1);
        System.out.println("s2" + " = " + s2);
        System.out.println("s3" + " = " + s3);
        System.out.println("s4" + " = " + s4);
}
    
}
