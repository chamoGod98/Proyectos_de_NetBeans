/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author jefer
 */
public class Venta {

    private float monto;

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float Dscto() { //Método que retorna el descuento de la venta
        float dscto = 0;
        if (monto > 950) {
            dscto = (float) (monto * 0.07);
        } else if (monto > 0 && monto <= 950) {
            dscto = (float) (monto * 0.025);
        }
        dscto=Float.parseFloat(String.format("%.2f",dscto));
        return dscto;
    }

    public float subTotal() { //Método que retorna el subtotal de la venta
        float subTotal = monto - Dscto();
        subTotal=Float.parseFloat(String.format("%.2f",subTotal));
        return subTotal;
    }

    public float IGV() { //Método que retorna el IGV
        float IGV = (float) (subTotal() * 0.18);
        IGV=Float.parseFloat(String.format("%.2f",IGV));
        return IGV;
    }

    public float montoTotalVenta() {
        float montoFinal = subTotal() + IGV();
        montoFinal=Float.parseFloat(String.format("%.2f",montoFinal));
        return montoFinal;
    }
}
