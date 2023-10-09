/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import TDAColas.Cola;
import TDAColas.ColaDin;
import TDAListas.*;

/**
 *
 * @author jefer
 */
public class ColaSalidaAutos {
    private static Cola objetos = new ColaDin();
    
    public static void adicionar(Object dato){
        objetos.offer(dato);
    }
    
    public static Cola consultar(){
        return objetos;
    }
}
