package capa_presentacion;

import capa_logica.Alumno;
import capa_logica.Curso;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int rpta;
        do {
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("    [1] Registrar curso");
            System.out.println("    [2] Registrar alumno");
            System.out.println("    [3] Salir");
            System.out.println("Ingrese una opción:");
            rpta=teclado.nextInt();
            switch (rpta) {
                case 1:
                    String codigocur;
                    String nombrecur;
                    int creditocur;
                    int ciclocur;
                    
                    System.out.println("REGISTRO DE LOS DATOS DEL CURSO");
                    System.out.println("Ingrese código:");
                    codigocur=teclado.next();
                    System.out.println("Ingrese nombre del curso:");
                    nombrecur=teclado.next();
                    System.out.println("Ingrese la cantidad de créditos del curso:");
                    creditocur=teclado.nextInt();
                    System.out.println("Ingrese ciclo del curso:");
                    ciclocur=teclado.nextInt();
                    
                    Curso objCur = new Curso(codigocur,nombrecur,creditocur,ciclocur);
                    
                    System.out.println(objCur.mostrar());
                    break;
                case 2:
                    String codigoalu;
                    String nombrealu;
                    int añoingalu;
                    
                    System.out.println("INGRESO DE LOS DATOS DEL ALUMNO:");
                    System.out.println("Ingres el código:");
                    codigoalu=teclado.next();
                    System.out.println("Ingrese el nombre:");
                    nombrealu=teclado.next();
                    System.out.println("Ingrese el año de ingreso:");
                    añoingalu=teclado.nextInt();
                    
                    Alumno objAlu = new Alumno(codigoalu,nombrealu,añoingalu);
                    System.out.println(objAlu.mostrar());
                    break;
                case 3:
                    System.out.println("SALIENDO DEL SISTEMA...");
                    break;
                default:
                    System.out.println("\nIngrese una opción válida\n");
                    break;
            }
        } while (rpta!=3);
        
    }
    
}
