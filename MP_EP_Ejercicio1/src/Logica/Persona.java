/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

public class Persona {
    private float peso;
    private float altura;

    public Persona(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    public float calculoIMC(){
        float imc;
        imc=(float) (peso/Math.pow(altura, 2));
        imc=Float.parseFloat(String.format("%.2f", imc));
        return imc;
    }
}
