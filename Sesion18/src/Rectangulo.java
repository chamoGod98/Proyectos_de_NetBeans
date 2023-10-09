
public class Rectangulo {
    private float base;
    private float altura;
    
    public Rectangulo(float base, float altura) {
    this.base=base;
    this.altura=altura;
}
    
    public float calcularArea(){
        return this.base*this.altura;
    }
    
    public float calcularPerimetro(){
        return (this.base+this.altura)*2;
    }
    
}
