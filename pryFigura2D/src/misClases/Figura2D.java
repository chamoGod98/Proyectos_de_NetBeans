
package misClases;

public abstract class Figura2D {
    
    private float base;
    private float altura;
    
    public abstract float calcularArea();
    
    public void setBase(float base) {
        this.base=base;
    }
    
    public void setAltura(float altura) {
        this.altura=altura;
    }
    
    public float getBase() {
        return base;
    }
    
    public float getAltura() {
        return altura;
    }
    
    
    
}
