/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import TArboles.TComparar;

/**
 *
 * @author jefer
 */
public class CompararPersonaEdad implements TComparar{
    
    public int Compara(Object o1, Object o2){
        Persona p1,p2;
        p1 = (Persona) o1;
        p2 = (Persona) o2;
        int difEdad = p1.getEdad() - p2.getEdad();
        if (difEdad==0) {
            return 0;
        } else if (difEdad <0) {
            return -1;
        } else {
            return 1;
        }
    }
    
}
