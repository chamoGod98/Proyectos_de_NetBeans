/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import Datos.*;
import TListas.*;
import TColas.*;

public class Cliente {

    private String nombre;
    private int edad;
    private String sexo;
    private String tipoTarjeta;
    private int numeroEntradas;
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

    public int getNumeroEntradas() {
        return numeroEntradas;
    }

    public void setNumeroEntradas(int numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
    }

    public float getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(float totalPagado) {
        this.totalPagado = totalPagado;
    }

    //A. Registrar un cliente (FrmRegistrar)
    //B. Atender un cliente (FrmAtenderClientes)
    //C. Mostrar el número de clientes atendidos por tipo de tarjeta
    public static int[] reporteC() {
        TLista LCCTA = ListaClientesCT_Atendidos.consultar();
        int cant[] = new int[3];
        Cliente obj;
        for (int i = 0; i < LCCTA.Cantidad(); i++) {
            obj = (Cliente) LCCTA.Obtener(i);
            if (obj.getTipoTarjeta().equalsIgnoreCase("Oro")) {
                cant[0]++;
            } else if (obj.getTipoTarjeta().equalsIgnoreCase("Plata")) {
                cant[1]++;
            } else {
                cant[2]++;
            }
        }
        return cant;
    }

    //D. Qué cliente por atender tiene la mayor edad
    public static TLista reporteD() {
        TCola CCCT = ColaClientesCT.consultar();
        TCola CCST = ColaClientesST.consultar();
        TLista lista = new TListaDin();
        Cliente obj;
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < CCCT.Cantidad(); i++) {
            obj = (Cliente) CCCT.Obtener(i);
            if (obj.getEdad() > mayor) {
                mayor = obj.getEdad();
            }
        }

        for (int i = 0; i < CCST.Cantidad(); i++) {
            obj = (Cliente) CCST.Obtener(i);
            if (obj.getEdad() > mayor) {
                mayor = obj.getEdad();
            }
        }

        for (int i = 0; i < CCCT.Cantidad(); i++) {
            obj = (Cliente) CCCT.Obtener(i);
            if (obj.getEdad() == mayor) {
                lista.Adicionar(obj);
            }
        }

        for (int i = 0; i < CCST.Cantidad(); i++) {
            obj = (Cliente) CCST.Obtener(i);
            if (obj.getEdad() == mayor) {
                lista.Adicionar(obj);
            }
        }

        return lista;
    }

    //E. Mostrar los clientes Black cuyo total pagado sea mayor a un valor ingresado
    public static TLista reporteE(float valorIng) {
        TLista LCCTA = ListaClientesCT_Atendidos.consultar();
        Cliente obj;
        TLista listaF = new TListaDin();
        for (int i = 0; i < LCCTA.Cantidad(); i++) {
            obj = (Cliente) LCCTA.Obtener(i);
            if (obj.getTipoTarjeta().equalsIgnoreCase("Black") && obj.getTotalPagado() > valorIng) {
                listaF.Adicionar(obj);
            }
        }
        return listaF;
    }

    //F. Mostrar el número de clientes hombres y mujeres, atendidos y por atender
    public static int[] reporteF() {
        TCola CCST = ColaClientesST.consultar();
        TCola CCCT = ColaClientesCT.consultar();
        TLista LCSTA = ListaClientesST_Atendidos.consultar();
        TLista LCCTA = ListaClientesCT_Atendidos.consultar();
        Cliente obj;
        int cant[] = new int[4]; //cant[0] para hombres y cant[1] para mujeres (por atender); cant[2] para hombres y cant[3] para mujeres (atendidos)

        for (int i = 0; i < CCST.Cantidad(); i++) { //Clientes sin tarjeta por atender
            obj = (Cliente) CCST.Obtener(i);
            if (obj.getSexo().equalsIgnoreCase("Masculino")) {
                cant[0]++;
            } else {
                cant[1]++;
            }
        }
        for (int i = 0; i < CCCT.Cantidad(); i++) { //Clientes con tarjeta por atender
            obj = (Cliente) CCCT.Obtener(i);
            if (obj.getSexo().equalsIgnoreCase("Masculino")) {
                cant[0]++;
            } else {
                cant[1]++;
            }
        }
        for (int i = 0; i < LCSTA.Cantidad(); i++) { //Clientes sin tarjeta atendidos
            obj = (Cliente) LCSTA.Obtener(i);
            if (obj.getSexo().equalsIgnoreCase("Masculino")) {
                cant[2]++;
            } else {
                cant[3]++;
            }
        }
        for (int i = 0; i < LCCTA.Cantidad(); i++) { //Clientes con tarjeta atendidos
            obj = (Cliente) LCCTA.Obtener(i);
            if (obj.getSexo().equalsIgnoreCase("Masculino")) {
                cant[2]++;
            } else {
                cant[3]++;
            }
        }
        return cant;
    }

    //G. Dado el nombre de la persona, mostrar cuántas veces ha ido al cine y el promedio del total pagado
    public static float[] reporteG(String nombre) {
        TLista LCSTA = ListaClientesST_Atendidos.consultar();
        TLista LCCTA = ListaClientesCT_Atendidos.consultar();
        float contador[] = new float[2]; //cont[0] para el número de veces que ha ido al cine, cont[1] para el promedio
        int contadorProm = 0;
        Cliente obj;//inicializamos el obj

        for (int i = 0; i < LCSTA.Cantidad(); i++) {
            obj = (Cliente) LCSTA.Obtener(i);//el obj recorre la lista de clientes sin tarjeta atendidos y llama al método obtener
            if (obj.getNombre().equalsIgnoreCase(nombre)) {
                contador[0]++;
                contadorProm += obj.getTotalPagado();
            }
        }

        for (int i = 0; i < LCCTA.Cantidad(); i++) {
            obj = (Cliente) LCCTA.Obtener(i);
            if (obj.getNombre().equalsIgnoreCase(nombre)) {
                contador[0]++;
                contadorProm += obj.getTotalPagado();
            }
        }

        contador[0] = Float.parseFloat(String.format("%.0f", contador[0]));//el Stringformat sirve para formatear e indicar cuantos decumales queremos que se muestren
        if (contador[0] > 0) {
            contador[1] = contadorProm / contador[0];
        } else {
            contador[1] = 0;
        }

        return contador;

        
        
    }
    
    //H. ¿Qué tipo de tarjeta tuvo la mayor cantidad de clientes?
    
    public static TLista reporteAdicional(){
        TCola CCCT = ColaClientesCT.consultar();
        TLista LCCTA = ListaClientesCT_Atendidos.consultar();
        TLista listaF = new TListaDin();
        int sN[] = new int[3];
        String tM[] = new String[3];
        tM[0] = "Oro";
        tM[1] = "Plata";
        tM[2] = "Black";
        int mayor=0;
        
        for (int i = 0; i < CCCT.Cantidad(); i++) {
            Cliente obj = (Cliente)CCCT.Obtener(i);
            if (obj.getTipoTarjeta().equalsIgnoreCase("Oro")) {
                sN[0]++;
            } else if (obj.getTipoTarjeta().equalsIgnoreCase("Plata")) {
                sN[1]++;
            } else {
                sN[2]++;
            }
        }
        
        for (int i = 0; i < LCCTA.Cantidad(); i++) {
            Cliente obj = (Cliente)LCCTA.Obtener(i);
            if (obj.getTipoTarjeta().equalsIgnoreCase("Oro")) {
                sN[0]++;
            } else if (obj.getTipoTarjeta().equalsIgnoreCase("Plata")) {
                sN[1]++;
            } else {
                sN[2]++;
            }
        }
        
        for (int i = 0; i < sN.length; i++) {
            if (sN[i]>mayor) {
                mayor=sN[i];
            }
        }
        
        for (int i = 0; i < sN.length; i++) {
            if (sN[i]==mayor) {
                listaF.Adicionar(tM[i]);
            }
        }
        
        return listaF;
    }
}
