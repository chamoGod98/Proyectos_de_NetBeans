/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Logica;

import Capa_Datos.Lista_Empresas;
import Capa_Datos.Lista_Proyectos;
import TListas.*;
import java.util.Calendar;

/**
 *
 * @author jefer
 */
public class Proyecto {

    private String codigo;
    private String nombre;
    private String pais;
    private String fechaInicio;
    private int duracionMeses;
    private float costo;
    private String tipo;
    private String codEmpresa;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public static TLista consultarTodo() throws Exception {
        return Lista_Proyectos.consultar();
    }

    //c) Mostrar el proyecto de mayor costo de inversión.
    public static TLista ProyectoMayorCosto() {
        TLista lista = Lista_Proyectos.consultar();
        TLista listaF = new TListaEn();
        float max = 0;
        for (int i = 0; i < lista.Cantidad(); i++) {
            Proyecto objProyecto = (Proyecto) lista.Obtener(i);
            if (objProyecto.getCosto() > max) {
                max = objProyecto.getCosto();
            }
        }
        for (int i = 0; i < lista.Cantidad(); i++) {
            Proyecto objProyecto = (Proyecto) lista.Obtener(i);
            if (objProyecto.getCosto() == max) {
                listaF.Adicionar(objProyecto);
            }
        }
        return listaF;
    }

    //d) Dada una Empresa, mostrar el listado de proyectos que subvenciona.    
    //Filtramos los proyectos según la empresa, dado el código
    public static TLista proyectos_Empresa(String codEmpresa) throws Exception {

        TLista listaFiltrada = new TListaEn();
        TLista lista = Proyecto.consultarTodo();

        for (int i = 0; i < lista.Cantidad(); i++) {
            Proyecto objP = (Proyecto) lista.Obtener(i);
            if (objP.getCodEmpresa().equalsIgnoreCase(codEmpresa)) {
                listaFiltrada.Adicionar(objP);
            }
        }
        return listaFiltrada;

    }

    //e) Dada una Empresa, mostrar el número de proyectos por país.
    //Filtramos el nùmero de proyectos por paìs
    public static int[] numProyPorPais(String codEmpresa) throws Exception {
        TLista lista = Proyecto.consultarTodo();
        int numProyPais[] = new int[5];
        for (int i = 0; i < lista.Cantidad(); i++) {
            Proyecto objP = (Proyecto) lista.Obtener(i);
            if (objP.getCodEmpresa().equalsIgnoreCase(codEmpresa) && objP.getPais().equalsIgnoreCase("España")) {
                numProyPais[0]++;
            } else if (objP.getCodEmpresa().equalsIgnoreCase(codEmpresa) && objP.getPais().equalsIgnoreCase("México")) {
                numProyPais[1]++;
            } else if (objP.getCodEmpresa().equalsIgnoreCase(codEmpresa) && objP.getPais().equalsIgnoreCase("EEUU")) {
                numProyPais[2]++;
            } else if (objP.getCodEmpresa().equalsIgnoreCase(codEmpresa) && objP.getPais().equalsIgnoreCase("Puerto Rico")) {
                numProyPais[3]++;
            } else if (objP.getCodEmpresa().equalsIgnoreCase(codEmpresa) && objP.getPais().equalsIgnoreCase("Colombia")) {
                numProyPais[4]++;
            }
        }
        return numProyPais;
    }

    //g) Dado el tipo de empresa, mostrar los proyectos que subvencionó los años 2020 y 2021
    //Filtramos los proyectos entre los años 2020 y 2021
    public static TLista ProyPorTipoEmpresa20202021(String tipo) throws Exception {
        TLista listaEmp = Empresa.consultarTodo();
        TLista listaProy = Proyecto.consultarTodo();
        TLista listafiltrada = new TListaEn();
        for (int i = 0; i < listaEmp.Cantidad(); i++) {
            Empresa objEmp = (Empresa) listaEmp.Obtener(i);
            if (objEmp.getTipo().equalsIgnoreCase(tipo)) {
                Proyecto objP = new Proyecto();
                int posEmpresa = Lista_Empresas.buscarCodEmpresa(objP.getCodEmpresa());
                objP = (Proyecto) Lista_Proyectos.obtener(posEmpresa);
                if (objP.equals("2020") || objP.equals("2021")) {
                    listafiltrada.Adicionar(objP);
                }
            }
        }
        return listafiltrada;
    }

}
