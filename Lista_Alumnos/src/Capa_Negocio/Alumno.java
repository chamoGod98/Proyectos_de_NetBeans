package Capa_Negocio;

import Capa_Datos.Lista;
import java.util.ArrayList;

public class Alumno {

    private String codigo;
    private String nombre;
    private int edad;
    private String sexo;
    private int ciclo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    //Reporte Listado General
    public static ArrayList consultarTodos() {
        return Lista.consultar();
    }

    public static ArrayList consultarSexo(String sexo) {
        ArrayList ListaPorSexo = new ArrayList();
        Alumno objAlumno;
        ArrayList lista = Alumno.consultarTodos();

        for (int i = 0; i < lista.size(); i++) {
            objAlumno = (Alumno) lista.get(i);
            if (objAlumno.getSexo().compareTo(sexo) == 0) {
                ListaPorSexo.add(objAlumno);
            }
        }
        return ListaPorSexo;
    }

    public static int[] nroHyM()

    {
        ArrayList lista = Lista.consultar();
        int cSexo[] = new int[2]; //arreglo de contadores
        for (int i = 0; i < lista.size(); i++) {
            Alumno objAlumno = (Alumno) lista.get(i);
            if (objAlumno.getSexo().equalsIgnoreCase("Masculino")) {
                cSexo[0]++;
            } else {
                cSexo[1]++;
            }
        }
        return cSexo;
    }
    
    public void MostrarPromedio(float promedio) {
        
        ArrayList lista = Lista.consultar();
        for (int i = 0; i < lista.size(); i++) {
            Alumno objAlumno = (Alumno) lista.get(i);
            
        }
    }

}
