package Datos;

import Negocio.Estudiante;
import java.util.ArrayList;

public class Lista_Estudiantes {
    
    private static ArrayList <Estudiante> lista = new ArrayList<Estudiante>();
    
    public static ArrayList verEstudiantes(){
        return lista;
    }
    
    public static void agregarEstudiante(Estudiante obj){
        lista.add(obj);
    }
    
    public int mostrarTamaño(){
        return lista.size();
    }
    
    public Estudiante obtener(int pos){
        Estudiante obj = lista.get(pos);
        return obj;
    }
    
}
