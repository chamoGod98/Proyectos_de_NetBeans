
package prjsemana04_05a;

import java.util.Arrays;

public class clsPersona {
    private String nombres;
    private String dni;
    private String direccion;
    private String telefono;
    private String correo;
    private clsMascota mascotas[];

    public clsPersona() {
        this.nombres = "";
        this.dni = "";
        this.direccion = "";
        this.telefono = "";
        this.correo = "";
        mascotas=new clsMascota[0];
    }
    
    public void agregarMascota(clsMascota objMascota) {
        mascotas=Arrays.copyOf(mascotas, mascotas.length-1);
        mascotas[mascotas.length-1]=new clsMascota();
        mascotas[mascotas.length-1]=objMascota;
    }
    
    public void eliminarMascota(String nombre) {
        boolean sw = false;
        clsMascota nuevo[]=mascotas;
        for (int i = 0; i < nuevo.length; i++) {
            if (nuevo[i].getNombre().equals(nombre)) {
                sw=true;
                for (int j = i; j < nuevo.length-1; j++) {
                    nuevo[j]=nuevo[j+1];
                }
                break;
            }
        }
        if (sw) {
            mascotas=new clsMascota[nuevo.length-1];
            for (int i = 0; i < nuevo.length-1; i++) {
                mascotas[i]=nuevo[i];
            }
        }
    }
    public clsMascota[] getMascotas() {
        return mascotas;
    }
    
    public int getTotalMascotas() {
        return mascotas.length;
    }

    public String getNombres() {
        return nombres;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setMascotas(clsMascota[] mascotas) {
        this.mascotas = mascotas;
    }
}
