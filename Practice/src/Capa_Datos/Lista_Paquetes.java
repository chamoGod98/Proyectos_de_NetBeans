/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Datos;

import Capa_Negocio.Paquete;
import TListas.*;

/**
 *
 * @author jefer
 */
public class Lista_Paquetes {
    
    private static TLista objetos = new TListaEn();
    
    public static void adicionar(Object c){
        objetos.Adicionar(c);
    }
    
    public static void eliminar(int pos){
        objetos.Eliminar(pos);
    }
    
    public static TLista consultar(){
        return objetos;
    }
    
    public static Object obtener(int pos){
        return objetos.Obtener(pos);
    }
    
    public int buscarCodPaquete(String codPaquete) {
        for (int i = 0; i < objetos.Cantidad(); i++) {
            Paquete objP = (Paquete)objetos.Obtener(i);
            if (objP.getCodigo().equalsIgnoreCase(codPaquete)) {
                return i;
            }
        }
        return -1;
    }
    
}
