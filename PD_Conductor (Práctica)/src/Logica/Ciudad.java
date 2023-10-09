/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.PilaCiudad;
import TPilas.*;

public class Ciudad {
    private String nombre;
    private int cantTiempo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantTiempo() {
        return cantTiempo;
    }

    public void setCantTiempo(int cantTiempo) {
        this.cantTiempo = cantTiempo;
    }
    
    public static TPila ConsultarTodo(){
        return PilaCiudad.consultar();
    }
    
    //Reporte C
    public static TPila reporteC(){
        TPila PilaOriginal = Ciudad.ConsultarTodo();
        TPila PilaCaminoVuelta = new TPilaEn();
        Ciudad obj;
        int n = PilaOriginal.Cantidad();
        
        for (int i = 0; i < n; i++) {
            obj = (Ciudad)PilaOriginal.Pop();
            PilaCaminoVuelta.Push(obj);
        }
        
        return PilaCaminoVuelta;
    }
}
