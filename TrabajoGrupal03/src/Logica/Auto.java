/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.ColaSalidaAutos;
import TDAColas.Cola;
import TDAColas.ColaDin;

public class Auto {
    private String numPlaca;
    private String propietario;
    private String marca;
    private String modelo;
    private int horaSalida;
    private int minutosSalida;

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getMinutosSalida() {
        return minutosSalida;
    }

    public void setMinutosSalida(int minutosSalida) {
        this.minutosSalida = minutosSalida;
    }

    
    public static Cola ListaAutosOrdenados(){
        Cola colaAutos = ColaSalidaAutos.consultar();
        int cantidadAutos = colaAutos.tamanio();
        Auto autos[] = new Auto[cantidadAutos];
        Auto aux;
        Cola listaOrdenada = new ColaDin();
        
        for (int i = 0; i < cantidadAutos; i++) {
            autos[i] = (Auto) colaAutos.recuperar(i);
        }
        
        for (int i = 0; i < cantidadAutos-1; i++) {
            for (int j = 0; j < cantidadAutos-1; j++) {
                if ((autos[j].getHoraSalida()>autos[j+1].getHoraSalida()) && (autos[j].getMinutosSalida()>autos[j+1].getMinutosSalida())) {
                    aux=autos[j];
                    autos[j]=autos[j+1];
                    autos[j+1]=aux;
                }
            }
        }
        for (int i = 0; i < cantidadAutos; i++) {
            listaOrdenada.offer(autos[i]);
        }
        return listaOrdenada;
    }
    
}
