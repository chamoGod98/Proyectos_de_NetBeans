package Ejercicio1;

public class Ejercicio1 {
    
    private float altura;
    private float peso;
    
    public Ejercicio1(float altura, float peso) {
        this.altura=altura;
        this.peso=peso;
    }
    
    public float calcularIMC() {
        return this.peso/(altura*altura);
    }
    
    public String calcularClasificacion() {
        String respuesta="";
        if (calcularIMC()<16) {
            respuesta="INFRAPESO: DELGADEZ SEVERA";
        } else if (calcularIMC()>=16 | calcularIMC()<=16.99) {
            respuesta="INFRAPESO: DELGADEZ MODERADA";
        } else if (calcularIMC()>=17 | calcularIMC()<=18.49) {
            respuesta="INFRAPESO: DELGADEZ ACEPTABLE";
        } else if (calcularIMC()>=18.50 | calcularIMC()<=24.99) {
            respuesta="PESO NORMAL";
        } else if (calcularIMC()>=25 | calcularIMC()<=29.99) {
            respuesta="SOBREPESO";
        } else if (calcularIMC()>=30 | calcularIMC()<=34.99) {
            respuesta="OBESO: TIPO I";
        } else if (calcularIMC()>=35 | calcularIMC()<=40.99) {
            respuesta="OBESO: TIPO II";
        } else if (calcularIMC()>40) {
            respuesta="OBESO: TIPO III";
        }
        return respuesta;
    }
    
}
