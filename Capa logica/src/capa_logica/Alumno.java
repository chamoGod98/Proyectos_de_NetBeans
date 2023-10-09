package capa_logica;

public class Alumno {
    private String codigo;
    private String nombre;
    private int añoingreso;
    
    public Alumno(String codigo,String nombre, int añoingreso)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.añoingreso=añoingreso;
    }
    public String mostrar()
    {
        return "ALUMNO\n"+"Codigo: "+getCodigo()+"\nNombre: "+getNombre()+"\nAño de ingreso: "+getAñoingreso()+"\n";
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo=codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    
    public int getAñoingreso() {
        return añoingreso;
    }
    public void setAñoingreso(int añoingreso) {
        this.añoingreso=añoingreso;
    }
}

