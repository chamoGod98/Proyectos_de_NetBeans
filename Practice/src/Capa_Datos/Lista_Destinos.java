/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Datos;

import Capa_Negocio.Destino;
import TListas.*;

/**
 *
 * @author jefer
 */
public class Lista_Destinos {
    private static TLista objetos = new TListaDin();
    
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
    
    public int buscarCodDestino(String codDestino) {
        for (int i = 0; i < objetos.Cantidad(); i++) {
            Destino objD = (Destino)objetos.Obtener(i);
            if (objD.getCodigo().equalsIgnoreCase(codDestino)) {
                return i;
            }
        }
        return -1;
    }
}
