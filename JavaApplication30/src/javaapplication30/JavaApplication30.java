package javaapplication30;

import java.awt.HeadlessException;
import java.io.*;
import javax.swing.JOptionPane;
        
public class JavaApplication30 {

    public static void main(String[] args) {
        
        File Archivo;
        PrintWriter Escribir;
        String nombre;
        Archivo = new File("Ejemplo2.txt");
        
        if (!Archivo.exists()) {
            System.out.println("Archivo creado");
            try {
                Archivo.createNewFile();
            } catch (IOException ex) {}
        } else {
            System.out.println("El archivo ya existe");
            try {
                Escribir = new PrintWriter(Archivo);
                nombre = JOptionPane.showInputDialog(null,"Ingresa tu nombre");
                Escribir.println("USAT es la mejor de la región, "+nombre);
                System.out.println("Hola "+nombre+", procesando tu archivo...");
                Escribir.close();
            } catch (FileNotFoundException | HeadlessException e) {}
        }
        
    }
    
}
