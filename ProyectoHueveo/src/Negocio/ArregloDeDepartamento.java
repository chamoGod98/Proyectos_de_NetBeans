/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Data.Departamento;
import java.util.Vector;
/**
 *
 * @author jefer
 */
public class ArregloDeDepartamento {
    private static Vector <Object> lista = new Vector<Object>();
    
    public static Vector consultar(){ //cargarDepartamentos()
        return lista;
    }
    
    public static void agregar(Object obj){
        lista.addElement(obj);
    }
    
    public static Object obtener(int pos){
        return lista.get(pos);
    }
    
    public static Object buscar(String codDepartamento){
        Vector lista = ArregloDeDepartamento.consultar();
        Object elemento=null;
        for (int i = 0; i < lista.size(); i++) {
            Departamento objDepartamento = (Departamento)lista.get(i);
            if (objDepartamento.getCodigo().equalsIgnoreCase(codDepartamento)) {
                elemento=lista.elementAt(i);
            }
        }
        return elemento;
    }
    
    public static void eliminar(int pos){
        lista.removeElementAt(pos);
    }
    
    public static Vector precioMenor(){
        Vector lista = ArregloDeDepartamento.consultar();
        Vector listaF = new Vector();
        double menor=0;
        for (int i = 0; i < lista.size(); i++) {
            Departamento objDepartamento = (Departamento)lista.get(i);
            if (objDepartamento.getPrecio()<menor) {
                menor=objDepartamento.getPrecio();
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            Departamento objDepartamento = (Departamento)lista.get(i);
            if (objDepartamento.getPrecio()==menor) {
                listaF.addElement(objDepartamento);
            }
        }
        return listaF;
    }
    
    public static Vector precioMayor(){
        Vector lista = ArregloDeDepartamento.consultar();
        Vector listaF = new Vector();
        double mayor=0;
        for (int i = 0; i < lista.size(); i++) {
            Departamento objDepartamento = (Departamento)lista.get(i);
            if (objDepartamento.getPrecio()>mayor) {
                mayor=objDepartamento.getPrecio();
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            Departamento objDepartamento = (Departamento)lista.get(i);
            if (objDepartamento.getPrecio()==mayor) {
                listaF.addElement(objDepartamento);
            }
        }
        return listaF;
    }
}
