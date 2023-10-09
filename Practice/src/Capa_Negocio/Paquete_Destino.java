/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Negocio;

import Capa_Datos.Lista_Paquete_Destino;
import TListas.*;

/**
 *
 * @author jefer
 */
public class Paquete_Destino {
    private String codPaquete;
    private String codDestino;

    public String getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(String codPaquete) {
        this.codPaquete = codPaquete;
    }

    public String getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(String codDestino) {
        this.codDestino = codDestino;
    }
    
    public static TLista ConsultarTodo(){
        return Lista_Paquete_Destino.consultar();
    }
}
