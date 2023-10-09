package Capa_Datos;

import Capa_Negocio.Alumno;
import java.util.ArrayList;

public class Lista {

    private static ArrayList<Alumno> ListaAlumnos = new ArrayList<Alumno>();

    public static void adicionar(Alumno obj) {
        ListaAlumnos.add(obj);
    }

    public static ArrayList consultar() {
        return ListaAlumnos;
    }

}
