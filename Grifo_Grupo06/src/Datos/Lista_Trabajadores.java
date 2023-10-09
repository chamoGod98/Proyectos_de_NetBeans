/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Logica.Trabajador;
import TListas.TLista;
import TListas.TListaDin;

/**
 *
 * @author jefer
 */
public class Lista_Trabajadores {
    
    private static TLista objetos = new TListaDin();
    
    public static void adicionar(Object dato){
        objetos.Adicionar(dato);
    }
    
    public static TLista consultar(){
        return objetos;
    }
    
    public static void eliminar(int pos){
        objetos.Eliminar(pos);
    }
    
    public static int buscarCodTrab (String codTrab) {
        for(int i=0; i<objetos.Cantidad();i++){
            Trabajador obj = (Trabajador)objetos.Obtener(i);
            if(obj.getCodigo()==codTrab)
                     return i;
        }
        return -1;
    }
    
}
