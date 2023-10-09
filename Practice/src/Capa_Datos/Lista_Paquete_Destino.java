/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Datos;

import Capa_Negocio.Destino;
import Capa_Negocio.Paquete;
import TListas.*;
import Capa_Negocio.Paquete_Destino;

/**
 *
 * @author jefer
 */
public class Lista_Paquete_Destino {
    private static TLista objetos = new TListaEn();
    
    public static void adicionar(Object c){
        objetos.Adicionar(c);
    }
    
    public static void eliminar(int pos){
        objetos.Eliminar(pos);
    }
    
    public static TLista consultar(){
        return objetos;
    }
    
    public static Object obtener(int pos){
        return objetos.Obtener(pos);
    }
    
    //Dado el paquete, me retorna sus destinos
    public static TLista paqPorDest(String codPaquete){
        TLista lista = new TListaEn();
        Lista_Destinos LD = new Lista_Destinos();
        for (int i = 0; i < objetos.Cantidad(); i++) {
            Paquete_Destino objPaqDest = (Paquete_Destino)objetos.Obtener(i);
            if (objPaqDest.getCodPaquete().equalsIgnoreCase(codPaquete)) {
                Destino objD = (Destino)Lista_Destinos.obtener(LD.buscarCodDestino(codPaquete));
                lista.Adicionar(objD);
            }
        }
        return lista;
    }
    
    public static TLista destPorPaq(String codDestino){
        TLista lista=new TListaEn();
        Lista_Paquetes LP=new Lista_Paquetes();
        for (int i = 0; i < objetos.Cantidad(); i++) {
            Paquete_Destino objPaqDest=(Paquete_Destino)objetos.Obtener(i);
            if (objPaqDest.getCodDestino().equalsIgnoreCase(codDestino)) {
                Paquete objP=(Paquete)Lista_Paquetes.obtener(LP.buscarCodPaquete(codDestino));
                lista.Adicionar(objP);
            }
        }
        return lista;
    }
    
    public static int validaAsignacion(String codDestino, String codPaquete){
        TLista lista=Lista_Paquete_Destino.consultar();
        for (int i = 0; i < lista.Cantidad(); i++) {
            Paquete_Destino objPD = (Paquete_Destino)lista.Obtener(i);
            if (objPD.getCodDestino().equalsIgnoreCase(codDestino)&&objPD.getCodPaquete().equalsIgnoreCase(codPaquete)) {
                return i;
            }
        }
        return -1;
    }
}
