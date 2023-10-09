/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import TListas.*;
import Datos.*;

public class Cliente {
    private String nombre;
    private int edad;
    private String sexo;
    private String tipoTarjeta;
    private int numEntradas;
    private float totalPagado;

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

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public int getNumEntradas() {
        return numEntradas;
    }

    public void setNumEntradas(int numEntradas) {
        this.numEntradas = numEntradas;
    }

    public float getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(float totalPagado) {
        this.totalPagado = totalPagado;
    }
    
    //Reporte C
    public static int[] reporteC(){
        TLista listaAtCT=ListaClientesAtendidosCT.consultar();
        Cliente obj;
        int cont[]=new int[3]; //0 para Oro, 1 para Plata, 2 para Black
        for (int i = 0; i < listaAtCT.Cantidad(); i++) {
            obj=(Cliente)listaAtCT.Obtener(i);
            if (obj.getTipoTarjeta().equalsIgnoreCase("Oro")) {
                cont[0]++;
            } else if (obj.getTipoTarjeta().equalsIgnoreCase("Plata")) {
                cont[1]++;
            } else {
                cont[2]++;
            }
        }
        return cont;
    }
}
