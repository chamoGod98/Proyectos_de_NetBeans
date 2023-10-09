package Negocio;

import Datos.Lista_Estudiantes;

public class Estudiante {
    
    private String nombre;
    private float calificacion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCalificacion() {
        return calificacion;
    }
    
    public float mostrarPromedio(){
        float prom=0;
        float cont=0;
        int cantAlumn=0;
        
        Lista_Estudiantes lista = new Lista_Estudiantes();
        Estudiante obj = new Estudiante();
        for (int i = 0; i < lista.mostrarTamaño(); i++) {
            obj=lista.obtener(i);
            cont=cont + obj.getCalificacion();
            cantAlumn++;
        }
        prom=cont/cantAlumn;
        return prom;
    }
    
    public float[] mostrarCalificacionMenorYMayor(){
        Lista_Estudiantes lista = new Lista_Estudiantes();
        Estudiante obj = new Estudiante();
        float arr[] = new float[2];
        float menor = Float.MAX_VALUE,mayor=Float.MIN_VALUE;
        for (int i = 0; i < lista.mostrarTamaño(); i++) {
            obj=lista.obtener(i);
            if (obj.getCalificacion()<menor) {
                menor=obj.getCalificacion();
            }
        }
        
        for (int i = 0; i < lista.mostrarTamaño(); i++) {
            obj=lista.obtener(i);
            if (obj.getCalificacion()>mayor) {
                mayor=obj.getCalificacion();
            }
        }
        arr[0]=menor;
        arr[1]=mayor;
        return arr;
    }
    
}
