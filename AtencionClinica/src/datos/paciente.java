//lenin huamani rojas, jeferson huaman acosta, marcia perez salas, segundo baradales rueda, erick julon saldaña
package datos;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class paciente {

    private String Nombre;
    private String dni;
    private int Edad;
    private String especialidad;
    private String doctor;
    private String fecha;

    public paciente(String Nombre, String dni, int Edad, String especialidad, String doctor, String fecha) {
        this.Nombre = Nombre;
        this.dni = dni;
        this.Edad = Edad;
        this.especialidad = especialidad;
        this.doctor = doctor;
        this.fecha = fecha; 
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public paciente() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void guardar(PrintWriter Escribe) {
        Escribe.println(Nombre);
        Escribe.println(dni);
        Escribe.println(Edad);
        Escribe.println(especialidad);
        Escribe.println(doctor);
    }
    public paciente cargar(BufferedReader Almacen) {
        String Nom, dni,doc,espe,fe;
        int edad;
        try {
            Nom = Almacen.readLine();
            dni = Almacen.readLine();
             doc = Almacen.readLine();
              espe = Almacen.readLine();
            edad = Integer.parseInt(Almacen.readLine());
            fe = Almacen.readLine();
            return new paciente (Nom, dni, edad,doc,espe,fe);
        } catch (Exception e) {
        }
        return null;
    }
    
    
    
    
    
    
    
    

}
