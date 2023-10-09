/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Datos;


import TPilas.TPila;
import TPilas.TPilaEn;

/**
 *
 * @author Franko
 */
public class PilaCiudad {
    private static TPila Objetos = new TPilaEn();
    
    public static void Adicionar(Object C){
        Objetos.Push(C);
    }
    public static TPila Obtener(){
        return Objetos;
    }
}
