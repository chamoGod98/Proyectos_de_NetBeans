/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Datos;

import Capa_Logica.Proyecto;
import TListas.*;
/**
 *
 * @author jefer
 */
public class Lista_Proyectos {
    
    private static TLista objetos = new TListaEn();
    
    public static void adicionar(Object C) {
        objetos.Adicionar(C);
    }

    public static TLista consultar() {
        return objetos;
    }
    
    public static Object obtener(int pos) {
        return objetos.Obtener(pos);
    }
    

    public static void eliminar(int pos)
    {
        objetos.Eliminar(pos);
    }
    
    public int buscarCodProyecto (String codProyecto){
        for(int i=0; i<objetos.Cantidad();i++){
            Proyecto objProyecto = (Proyecto)objetos.Obtener(i);
            if(objProyecto.getCodigo().equalsIgnoreCase(codProyecto))
                     return i;
        }
        return -1;
    }
}
