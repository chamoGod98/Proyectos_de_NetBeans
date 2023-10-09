
package negocio;

import datos.ListaPersonal;
import java.util.Vector;

public class Personal {
    
    private String dni;
    private String nombre;
    private float sueldoBasico;
    private int cantidadHorasExtras;

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setCantidadHorasExtras(int cantidadHorasExtras) {
        this.cantidadHorasExtras = cantidadHorasExtras;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public int getCantidadHorasExtras() {
        return cantidadHorasExtras;
    }
    
    public float calcularPagoHorasExtras() {
        
        float valorHoraExtra=0;
        float incrementoExtra=0;
        float pagoHorasExtras=0;
        
        valorHoraExtra=(this.sueldoBasico/30)/8;
        incrementoExtra=(float) ((valorHoraExtra*0.25)+valorHoraExtra);
        pagoHorasExtras=this.cantidadHorasExtras*incrementoExtra;
        
        return pagoHorasExtras;
        
    }
    
    public float calcularDescuentoAFP() {
        
        float descuentoAFP=0;
        
        descuentoAFP=(float) ((this.sueldoBasico+this.calcularPagoHorasExtras())*0.13);
        
        return descuentoAFP;
        
    }
    
    public float calcularSueldoNeto() {
        return (this.sueldoBasico+this.calcularPagoHorasExtras())-this.calcularDescuentoAFP();
    }
    
    public void agregar() {
        ListaPersonal.agregar(this);
    }
    
    public Vector obtenerListado() {
        return ListaPersonal.consultar();
    }
}
