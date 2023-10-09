
public class C extends A{
    private float c;
    
    public float getC() {
        return c;
    }
    
    public void setC(float c) {
        this.c=c;
    }
    
    public float q() {
        return (float) Math.pow (getA()+this.c, 2)/getA();
    }
}
