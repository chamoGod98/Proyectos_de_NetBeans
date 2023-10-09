/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author jefer
 */
public class Pedido {
    
    private float pp1;
    private float pp2;
    private float pB;
    private float pP;

    public void setPp1(float pp1) {
        this.pp1 = pp1;
    }

    public void setPp2(float pp2) {
        this.pp2 = pp2;
    }

    public void setpB(float pB) {
        this.pB = pB;
    }

    public void setpP(float pP) {
        this.pP = pP;
    }
    
    public float pedido1(){
        float total;
        total=pp1+pB;
        return total;
    }
    
    public float pedido2(){
        float total;
        total=pp1+pp2+pB;
        return total;
    }
    
    public float pedido3(){
        float total;
        total=pp1+pp2+pB+pP;
        return total;
    }
    
}
