/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import TColas.*;

public class ColaClientesST {
    private static TCola objetos = new TColaEn();
    
    public static void adicionar(Object dato){
        objetos.Insertar(dato);
    }
    
    public static TCola consultar(){
        return objetos;
    }
}
