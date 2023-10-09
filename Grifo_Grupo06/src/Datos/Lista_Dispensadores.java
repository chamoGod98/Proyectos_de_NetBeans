/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Logica.Dispensador;
import TListas.TLista;
import TListas.TListaDin;

/**
 *
 * @author jefer
 */
public class Lista_Dispensadores {
    
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
    
    public static int buscarNumDisp (int numDisp) {
        for(int i=0; i<objetos.Cantidad();i++){
            Dispensador obj = (Dispensador)objetos.Obtener(i);
            if(obj.getNumero()==numDisp)
                     return i;
        }
        return -1;
    }
    
}
