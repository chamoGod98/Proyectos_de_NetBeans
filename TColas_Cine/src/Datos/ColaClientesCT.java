/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import TColas.*;

public class ColaClientesCT {
    
    private static TCola cola = new TColaEn();
    
    public static void adicionar(Object C){
        cola.Insertar(C);
    }
    
    public static TCola consultar(){
        return cola;
    }
    
}
