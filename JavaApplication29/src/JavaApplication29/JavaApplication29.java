package JavaApplication29;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class JavaApplication29 {

    public static void main(String[] args) {
        
        File file = new File("Archivo de texto de prueba.txt");
        
        if (!file.exists()) 
        {
            try {
                file.createNewFile();
                System.out.println(file.getName()+" ha sido creado");
            } catch (IOException ex) {ex.printStackTrace();}
        } else {
            JOptionPane.showMessageDialog(null, "El archivo ya ha sido creado");
        }
        
    }
    
}
