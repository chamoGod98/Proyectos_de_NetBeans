
public class B extends A {
    private float b;
    
    public float getB() {
        return b;
    }
    
    public void setB(float b) {
        this.b=b;
    }
    
    public float p() {
        return (float) Math.sqrt(getA()+this.b)/getA();
    }
}
