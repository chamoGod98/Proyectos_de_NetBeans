package capa_logica;

public class Curso {
    
    private String codigo;
    private String nombre;
    private int ciclo;
    private int creditos;
    
    public Curso(String codigo, String nombre, int ciclo, int creditos)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.ciclo=ciclo;
        this.creditos=creditos;
    }
    
    public String mostrar()
    {
        return "CURSO\n"+"Código: "+getCodigo()+"\nNombre: "+getNombre()+"\nCiclo: "+getCiclo()+"\nCréditos: "+getCreditos()+"\n";
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
    
    public int getCiclo() {
        return ciclo;
    }
    
    public void setCiclo(int ciclo) {
        this.ciclo=ciclo;
    }
    
    public int getCreditos() {
        return creditos;
    }
    
    public void setCreditos(int creditos) {
        this.creditos=creditos;
    }
}
