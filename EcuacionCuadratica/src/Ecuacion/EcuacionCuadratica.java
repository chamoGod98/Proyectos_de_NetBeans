package Ecuacion;

public class EcuacionCuadratica {

    private double a, b, c;

    public void setA(int valor1) {
        this.a = valor1;
    }

    public double getA() {
        return a;
    }

    public void setB(int valor2) {
        this.a = valor2;
    }

    public double getB() {
        return b;
    }

    public void setC(int valor3) {
        this.a = valor3;
    }

    public double getC() {
        return c;
    }
    
    public double Discr(){
        double discriminante;
        a=getA();
        b=getB();
        c=getC();
        discriminante=Math.sqrt((b * b) - 4 * a * c);
        return discriminante;
    }

    public double resultado1() {
        double resultado1;
        resultado1 = -b + (Discr()) / (2 * a);
        return resultado1;
    }
    
    public double resultado2() {
        double resultado2;
        resultado2 = -b - Discr() / (2 * a);
        return resultado2;
    }
}
