/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Logica;

import Capa_Datos.Lista_Empresas;
import Capa_Datos.Lista_Proyectos;
import TListas.*;

/**
 *
 * @author jefer
 */
public class Empresa {
    
    private String codigo;
    private String nombre;
    private String tipo;
    private float InvMaxima;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setInvMaxima(float InvMaxima) {
        this.InvMaxima = InvMaxima;
    }

    

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public float getInvMaxima() {
        return InvMaxima;
    }
    
    public static TLista consultarTodo() throws Exception {
        return Lista_Empresas.consultar();
    }
    
    //f) Dado el año de inicio, mostrar el número de empresas de inversión por tipo
    //Filtramos el nùmero de empresas de inversiòn por tipo
    public static int[] numEmpPorTipoDadoAño(int año) throws Exception {
        TLista listaEmpresas = Lista_Empresas.consultar();
        TLista listaProyectos = Lista_Proyectos.consultar();
        int[] cEmpresa = new int[2];
        for (int i = 0; i < listaEmpresas.Cantidad(); i++) {
            Empresa objEmp = (Empresa) listaEmpresas.Obtener(i);
            TLista listaProyectos = Proyecto.proyectos_Empresa(objEmp.getCodigo());
            boolean bandera=false;
            for (int j = 0; j < listaProyectos.Cantidad()||bandera==true; j++) {
                Proyecto objProy = (Proyecto) listaProyectos.Obtener(j);
                if (objProy.getFechaInicio()==año) {
                    if (objEmp.getTipo().equalsIgnoreCase("Pública")) {
                        cEmpresa[0]++;
                    } else if (objEmp.getTipo().equalsIgnoreCase("Privada")) {
                        cEmpresa[1]++;
                    }
                    bandera=true;
                }
            }
        }
        return cEmpresa;
    }
    
    
}
