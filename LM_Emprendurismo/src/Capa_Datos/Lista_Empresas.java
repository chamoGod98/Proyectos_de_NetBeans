/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Datos;

import Capa_Logica.Empresa;
import TListas.*;

/**
 *
 * @author jefer
 */
public class Lista_Empresas {
    
    private static TLista objetos = new TListaDin();
    
    public static void adicionar(Object C) {
        objetos.Adicionar(C);
    }

    public static TLista consultar() {
        return objetos;
    }
    
    public static Object obtener(int pos) {
        return objetos.Obtener(pos);
    }
    

    public static void eliminar(int pos)
    {
        objetos.Eliminar(pos);
    }
    
    public static int buscarCodEmpresa (String codEmpresa){
        for(int i=0; i<objetos.Cantidad();i++){
            Empresa objEmpresa = (Empresa)objetos.Obtener(i);
            if(objEmpresa.getCodigo().equalsIgnoreCase(codEmpresa))
                     return i;
        }
        return -1;
    }
    
}
