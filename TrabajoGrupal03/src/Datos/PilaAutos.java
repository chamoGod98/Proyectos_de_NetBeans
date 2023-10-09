/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import TDAPilas.*;

/**
 *
 * @author jefer
 */
public class PilaAutos {
    
    private static Pila objetos = new PilaDin();
    
    public static void adicionar(Object dato){
        objetos.push(dato);
    }
    
    public static Pila consultar(){
        return objetos;
    }
    
}
