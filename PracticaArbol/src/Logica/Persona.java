/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.ArbolPersonas;
import TArboles.TArbolBB;
import TArboles.TArbolBin;

/**
 *
 * @author jefer
 */
public class Persona {
    
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public static TArbolBB ConsultarTodo() throws Exception{
        return ArbolPersonas.Obtener();
    }
    
}
