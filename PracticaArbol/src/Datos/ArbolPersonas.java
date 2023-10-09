/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Logica.CompararPersonaEdad;
import Logica.Persona;
import TArboles.TArbolBB;
import TArboles.TArbolBin;
import javax.swing.JOptionPane;

/**
 *
 * @author jefer
 */
public class ArbolPersonas {
    
    private static TArbolBB objetos = new TArbolBB(new CompararPersonaEdad());
    
    public static void Adicionar(Persona info){
        objetos.Adicionar(info);
    }
    
    public static TArbolBB Obtener(){
        return objetos;
    }
    
    public void InOrden(TArbolBin A){
        if (A.getRaiz()==null) {
            return;
        } else {
            Persona obj = (Persona)A.ObtenerDato();
            InOrden(A.Izq());
            JOptionPane.showMessageDialog(null, obj.getNombre() + ": " + obj.getEdad());
            InOrden(A.Der());
        }
    }
    
    public void PreOrden(TArbolBin A){
        if (A.getRaiz()==null) {
            return;
        } else {
            Persona obj = (Persona)A.ObtenerDato();
            JOptionPane.showMessageDialog(null, obj.getNombre() + ": " + obj.getEdad());
            PreOrden(A.Izq());
            PreOrden(A.Der());
        }
    }
    
    public void PostOrden(TArbolBin A){
        if (A.getRaiz()==null) {
            return;
        } else {
            Persona obj = (Persona)A.ObtenerDato();
            PostOrden(A.Izq());
            PostOrden(A.Der());
            JOptionPane.showMessageDialog(null, obj.getNombre() + ": " + obj.getEdad());
        }
    }
    
}
