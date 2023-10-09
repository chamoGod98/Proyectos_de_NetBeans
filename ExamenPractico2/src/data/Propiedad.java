
package data;

public abstract class Propiedad {
    
    private int codigo;
    private int habitacion;
    private double ancho;
    private double largo;
    private double precio;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getPrecio() {
        return precio;
    }
    
    public double area() {
        double area;
        area=this.getLargo()*this.getAncho();
        return area;
    }
    
}
