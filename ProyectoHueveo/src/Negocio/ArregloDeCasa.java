/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Data.Casa;
import java.util.Vector;

/**
 *
 * @author jefer
 */
public class ArregloDeCasa {
    private static Vector <Object> lista = new Vector<Object>();
    
    public static Vector consultar(){ //cargarCasas()
        return lista;
    }
    
    public static void agregar(Object obj){
        lista.addElement(obj);
    }
    
    public static Object obtener(int pos){
        return lista.get(pos);
    }
    
    public static Object buscar(String codCasa){
        Vector lista = ArregloDeCasa.consultar();
        Object elemento=null;
        for (int i = 0; i < lista.size(); i++) {
            Casa objCasa = (Casa)lista.get(i);
            if (objCasa.getCodigo().equalsIgnoreCase(codCasa)) {
                elemento=lista.elementAt(i);
            }
        }
        return elemento;
    }
    
    public static void eliminar(int pos){
        lista.removeElementAt(pos);
    }
    
    public static Vector precioMenor(){
        Vector lista = ArregloDeCasa.consultar();
        Vector listaF = new Vector();
        double menor=0;
        for (int i = 0; i < lista.size(); i++) {
            Casa objCasa = (Casa)lista.get(i);
            if (objCasa.getPrecio()<menor) {
                menor=objCasa.getPrecio();
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            Casa objCasa = (Casa)lista.get(i);
            if (objCasa.getPrecio()==menor) {
                listaF.addElement(objCasa);
            }
        }
        return listaF;
    }
    
    public static Vector precioMayor(){
        Vector lista = ArregloDeCasa.consultar();
        Vector listaF = new Vector();
        double mayor=0;
        for (int i = 0; i < lista.size(); i++) {
            Casa objCasa = (Casa)lista.get(i);
            if (objCasa.getPrecio()>mayor) {
                mayor=objCasa.getPrecio();
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            Casa objCasa = (Casa)lista.get(i);
            if (objCasa.getPrecio()==mayor) {
                listaF.addElement(objCasa);
            }
        }
        return listaF;
    }
}
