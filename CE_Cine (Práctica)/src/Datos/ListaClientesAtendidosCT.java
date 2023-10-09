/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import TListas.*;

public class ListaClientesAtendidosCT {
    public static TLista objetos = new TListaDin();
    
    public static void adicionar(Object dato){
        objetos.Adicionar(dato);
    }
    
    public static TLista consultar(){
        return objetos;
    }
}
