/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author laboratorio_computo
 */
public class Dispensador {
    
    private int numero;
    private int numeroCombustibles;
    private String estado;
    private int codigoTrabajador; //Atributo relación (TRABAJADOR-DISPENSADOR)

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroCombustibles() {
        return numeroCombustibles;
    }

    public void setNumeroCombustibles(int numeroCombustibles) {
        this.numeroCombustibles = numeroCombustibles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }
    
}
