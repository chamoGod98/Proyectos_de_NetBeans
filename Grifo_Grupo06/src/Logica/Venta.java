/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Calendar;

/**
 *
 * @author laboratorio_computo
 */
public class Venta {
 
    private String numeroSerie;
    private int numeroCorrelativo;
    private String tipoDocumento;
    private int dniCliente; //Atributo relación (CLIENTE-VENTA)
    private int numeroDispensador; //Atributo relación (DISPENSADOR-VENTA)
    private int codigoTrabajador; //Atributo relación (TRABAJADOR-VENTA)
    private float numeroGalones;
    private double montoTotal;
    private String medioDePago;
    private Calendar fechaVenta;

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getNumeroCorrelativo() {
        return numeroCorrelativo;
    }

    public void setNumeroCorrelativo(int numeroCorrelativo) {
        this.numeroCorrelativo = numeroCorrelativo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getNumeroDispensador() {
        return numeroDispensador;
    }

    public void setNumeroDispensador(int numeroDispensador) {
        this.numeroDispensador = numeroDispensador;
    }

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public float getNumeroGalones() {
        return numeroGalones;
    }

    public void setNumeroGalones(float numeroGalones) {
        this.numeroGalones = numeroGalones;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    public Calendar getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Calendar fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
}
