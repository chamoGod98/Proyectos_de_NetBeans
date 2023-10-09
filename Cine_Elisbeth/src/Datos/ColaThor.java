/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import TColas.*;

public class ColaThor {
    
    private static TCola objetos = new TColaDin();
    
    public static void adicionar(Object C){
        objetos.Insertar(C);
    }
    
    public static TCola consultar(){
        return objetos;
    }
    
}
