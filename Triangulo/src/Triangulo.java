public class Triangulo {
    
    public double valor1, valor2, valor3;
    
    public String ExistenciaTriangulo () {
        String respuesta;
        if (valor1+valor2>valor3 && valor2+valor3>valor1 && valor1+valor3>valor2) {
            respuesta = "Sí existe";
        } else {
            respuesta = "No existe";
        }
        return respuesta;
    }
    
    public double Perimetro() {
        double perimetro;
        perimetro=valor1+valor2+valor3;
        return perimetro;
    }
    public double Area() {
        double area,p=(valor1+valor2+valor3)/2;
        area=Math.sqrt(p*(p-valor1)*(p-valor2)*(p-valor3));
        area=Math.round(area*100.0)/100.0;
        return area;
    }
    
}
