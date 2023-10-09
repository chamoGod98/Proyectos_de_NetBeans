
package negocio;

import java.util.Vector;
import data.Propiedad;

public class ArregloDeCasa {
    
    private Vector datosCasa = new Vector();
    
    public void agregar(Object obj) {
        datosCasa.addElement(obj);
    }
    
    public void obtener(int pos) {
        datosCasa.get(pos);
    }
    
    public Vector buscar() {
        return datosCasa;
    }
    
    public void eliminar(int pos) {
        datosCasa.removeElementAt(pos);
    }
    
    public double precioMenor() {
        int preciomenor;
        datosCasa.get(preciomenor);
        return preciomenor;
    }
    
    public double precioMayor() {
        int preciomayor;
        datosCasa.get(preciomayor);
        return preciomayor;
    }
    
    public void cargarCasas() {
        datosCasa.get(datosCasa);
    }
    
    public void grabarCasas() {
        datosCasa.addElement(this);
    }
    
}
