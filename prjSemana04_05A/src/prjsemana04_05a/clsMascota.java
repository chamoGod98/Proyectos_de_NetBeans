
package prjsemana04_05a;

public class clsMascota {
    private String nombre;
    private String raza;
    private String tipo;
    private Boolean sexo;
    private String fechaNac;
    private Boolean estado;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre=nombre;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza=raza;
    }

    public String getTipo() {
        return tipo;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    
    
    
}
