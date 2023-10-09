package sesion21;

public class ejerciciopractico4 {

    public static void main(String[] args) {
        
        float costopasaje=45,costoPoliza,costoUniv,costoalumno,costoAgencia,peaje=100;
        int alumno=30;
       
        costoPoliza=15*costopasaje/100;
        costoUniv=35*costopasaje/100;
        costoalumno=costopasaje+costoPoliza-costoUniv;
        costoAgencia=(float) alumno*costopasaje+costoPoliza*costopasaje*alumno+peaje;
        
        System.out.println("El costo por alumno es: " + costoalumno);
        System.out.println("El pago a la agencia de viaje es: " + costoAgencia);
    }
    
}
