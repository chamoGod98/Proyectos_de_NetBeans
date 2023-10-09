/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

public class Ejercicio1 {

    private double X;

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double resultado(double x) {
        double Z=0;
        if (x > 0) {
            Z = (Math.pow(Math.pow(x, 3) + 100, 1 / 4)) / x;
        } else if (x < 0) {
            Z = ((Math.pow(x, 2)) + (x * 3) + 2) / (x * 2);
        } else if (x==0) {
            Z= (x+(x+5)-4)/((x*3)-6);
        }
        Z=Double.parseDouble(String.format("%.2f", Z));
        return  Z;
    }

}
