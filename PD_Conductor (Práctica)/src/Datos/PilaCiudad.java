/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import TListas.*;
import TPilas.*;

public class PilaCiudad {
    private static TPila objetos = new TPilaDin();
    
    public static void adicionar(Object dato){
        objetos.Push(dato);
    }
    
    public static TPila consultar(){
        return objetos;
    }
}
