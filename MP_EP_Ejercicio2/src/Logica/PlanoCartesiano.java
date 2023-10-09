/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

public class PlanoCartesiano {
    
    private int puntoX;
    private int puntoY;

    public PlanoCartesiano(int puntoX, int puntoY) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
    }
    
    public String Cuadrante(){
        String texto = null;
        if (puntoX>0 && puntoY>0) {
            texto = "El punto ("+puntoX+","+puntoY+")"+" se encuentra en el I cuadrante";
        } else if (puntoX<0 && puntoY>0) {
            texto = "El punto ("+puntoX+","+puntoY+")"+" se encuentra en el II cuadrante";
        } else if (puntoX<0 && puntoY<0) {
            texto = "El punto ("+puntoX+","+puntoY+")"+" se encuentra en el III cuadrante";
        } else if (puntoX>0 && puntoY<0) {
            texto = "El punto ("+puntoX+","+puntoY+")"+" se encuentra en el IV cuadrante";
        } else {
            texto = "El punto ("+puntoX+","+puntoY+")"+" se encuentra sobre un eje de coordenadas";
        }
        return texto;
    }
    
}
