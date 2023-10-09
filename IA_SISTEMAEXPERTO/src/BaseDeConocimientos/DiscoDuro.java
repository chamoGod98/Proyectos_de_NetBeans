
package BaseDeConocimientos;

public class DiscoDuro {
    public String signo;
    public String descripcion;
    

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

     @Override
    public String toString() {
        return "Signo: " + signo + "- Descripcion: " + descripcion;
    }
}