
package misClases;

public class Rectangulo extends Figura2D {
    
    @Override
    public float calcularArea() {
        float area;
        area=getBase()*getAltura();
        return area;
    }
    
}
