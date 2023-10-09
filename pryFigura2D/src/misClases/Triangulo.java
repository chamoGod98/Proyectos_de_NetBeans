
package misClases;

public class Triangulo extends Figura2D {
    
    @Override
    public float calcularArea() {
        float area;
        area=(getBase()*getAltura())/2;
        return area;
    }
    
}
