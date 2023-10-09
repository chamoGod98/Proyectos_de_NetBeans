package Cliente;

import Datos.Lista_Estudiantes;
import Negocio.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;

public class Consola {

    /* ------------------- borrar aquí
    public static void main(String[] args) {
        
        ArrayList lista = Lista_Estudiantes.verEstudiantes();
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        String nombre;
        float calificacion;
        OUTER:
        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1: Agregar calificacion");
            System.out.println("2: Ver calificaciones de estudiantes");
            System.out.println("3: Ver calificacion promedio");
            System.out.println("4: Ver calificación mas alta y mas baja");
            System.out.println("5: Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    {
                        System.out.println("Ingrese el nombre del estudiante:");
                        nombre=teclado.next();
                        System.out.println("Ingrese la calificación:");
                        calificacion=teclado.nextFloat();
                        Estudiante obj = new Estudiante();
                        obj.setNombre(nombre);
                        obj.setCalificacion(calificacion);
                        lista.add(obj);
                        System.out.println("Calificación registrada");
                        System.out.println("");
                        break;
                    }
                case 2:
                    System.out.println("Estudiante      -        Nota");
                    for (int i = 0; i < lista.size(); i++) {
                        Estudiante obj = new Estudiante();
                        obj=(Estudiante) lista.get(i);
                        System.out.println(obj.getNombre() + " - " +obj.getCalificacion());
                    }   break;
                case 3:
                    {
                        Estudiante obj = new Estudiante();
                        float promedio = obj.mostrarPromedio();
                        System.out.println("La calificación promedio es: "+promedio);
                        break;
                    }
                case 4:
                    {
                        Estudiante obj = new Estudiante();
                        float mM[] = obj.mostrarCalificacionMenorYMayor();
                        System.out.println("La calificació      n más baja es: "+mM[0]);
                        System.out.println("La calificación más alta es: "+mM[1]);
                        break;
                    }
                case 5:
                    break OUTER;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (opcion>0 | opcion<5);
        
    }
    */ // --------------------- borrar aquí
    
}
