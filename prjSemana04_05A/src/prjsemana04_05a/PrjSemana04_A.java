
package prjsemana04_05a;

import java.util.Scanner;

public class PrjSemana04_A {
    
    static clsPersona objPersona;
    static clsMascota objMascota;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        clinicaVeterinaria();
    }
    
    public static void clinicaVeterinaria() {
        int op,rpta;
        objPersona=new clsPersona();
        do {
            op=menu();
            switch (op) {
                case 1: registrarCliente();
                    break;
                case 2: registrarMascota();
                    break;
                case 3: eliminarMascota();
                    break;
                case 4: modificarMascota();
                    break;
                case 5: consultarMascota();
                    break;
                case 6: mostrarMascota();
                    break;
                case 7: Salir();
                default:
                    throw new AssertionError();
            }
            do {
                System.out.print("¿Desea continuar (0-No/1-Sí)?: ");
                rpta=teclado.nextInt();
            } while (!(rpta==0) || rpta==1);
        } while (!(rpta==0));
    }
    
    public static int menu() {
        int op=0;
        do {
            System.out.println("CLÍNICA VETERINARIA");
            System.out.println("(1) Registrar nuevo cliente");
            System.out.println("(2) Registrar mascotas");
            System.out.println("(3) Eliminar mascota");
            System.out.println("(4) Modificar mascota");
            System.out.println("(5) Consultar mascotas");
            System.out.println("(6) Listar todas las mascotas");
            System.out.println("(7) Salir");
            System.out.println("Opción: ");
            op=teclado.nextInt();
        } while (!(op>=1 && op<=7));
        return op;
    }
    
    public static void registrarCliente() {
        teclado.nextLine();
        System.out.print("Nombre: ");
        objPersona.setNombres(teclado.nextLine());
        System.out.print("DNI: ");
        objPersona.setDni(teclado.nextLine());
        System.out.print("Dirección: ");
        objPersona.setDireccion(teclado.nextLine());
        System.out.print("Teléfono:");
        objPersona.setTelefono(teclado.nextLine());
        System.out.print("Correo: ");
        objPersona.setCorreo(teclado.nextLine());
    }
    
    public static void registrarMascota() {
        byte sex;
        objMascota=new clsMascota();
        teclado.nextLine();
        System.out.print("Nombre: ");
        objMascota.setNombre(teclado.nextLine());
        System.out.print("Tipo de mascota: ");
        objMascota.setTipo(teclado.nextLine());
        System.out.print("Raza: ");
        objMascota.setRaza(teclado.nextLine());
        objMascota.setEstado(Boolean.TRUE);
        do {
            System.out.println("(0) Hembra");
            System.out.println("(1) Macho");
            System.out.print("Opción: ");
            sex=teclado.nextByte();
        } while (!(sex==1 || sex==0));
        if (sex==1) objMascota.setSexo(Boolean.TRUE);
        else objMascota.setSexo(Boolean.FALSE);
        teclado.nextLine();
        System.out.print("Fecha de nacimiento: ");
        objMascota.setFechaNac(teclado.nextLine());
        
    }
    
    public static void eliminarMascota() {
        
    }
    
    public static void modificarMascota() {
        
    }
    
    public static void consultarMascota() {
        
    }
    
    public static void mostrarMascota() {
        
    }
    
    public static void Salir() {
        
    }
    
}
