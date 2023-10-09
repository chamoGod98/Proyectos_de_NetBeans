/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import TListas.*;

public class ListaClientesST_Atendidos {
    
    public static TLista lista = new TListaEn();
    
    public static void adicionar(Object C){
        lista.Adicionar(C);
    }
    
    public static TLista consultar(){
        return lista;
    }
    
}
