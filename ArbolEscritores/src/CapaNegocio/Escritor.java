
package CapaNegocio;

import CapaDatos.ArbolEscritores;
import TArboles.*;

public class Escritor {
    
    private String codEscritor;
    private String nombre;
    private int edad;
    private String sexo;

    public String getCodEscritor() {
        return codEscritor;
    }

    public void setCodEscritor(String codEscritor) {
        this.codEscritor = codEscritor;
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
    
    
    public static TArbolBin consultarTodos() {
        return ArbolEscritores.obtener();
    }

    
}
