/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaDatos;

import TDAColas.Cola;
import TDAColas.ColaDin;

/**
 *
 * @author laboratorio_computo
 */
public class ColaMontanaRusa {
    public static Cola objC = new ColaDin();
    public static void adicionar(Object cli){
        objC.offer(cli);
    }
    public static Cola consultar(){
        return objC;
    }
}
