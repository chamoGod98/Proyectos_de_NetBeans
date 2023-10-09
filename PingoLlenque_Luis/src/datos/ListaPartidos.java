/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;
import negocio.partidos;

/**
 *
 * @author jefer
 */
public class ListaPartidos {

    private static ArrayList<partidos> listaPart = new ArrayList<>();

    public static ArrayList<partidos> getListaEst() {
        return listaPart;
    }

    public static void setListaPart(Object est) {
        listaPart.add((partidos) est);
    }
    
    public static int tamañoLista(){
        return listaPart.size();
    }

}
