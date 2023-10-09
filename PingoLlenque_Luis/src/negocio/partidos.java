/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import datos.ListaPartidos;
import java.util.ArrayList;

/**
 *
 * @author jefer
 */
public class partidos {
    
    /*equipo imaginario: deportivo usat*/
    
    String rival;
    String dia_fec;
    String mes_fec;
    String año_fec;
    int goles_a_favor;
    int goles_en_contra;
    String tipo_competicion; //liga, copa, amistoso
    String ciudad;

    public partidos(String rival, String dia_fec, String mes_fec, String año_fec, int goles_a_favor, int goles_en_contra, String tipo_competicion, String ciudad) {
        this.rival = rival;
        this.dia_fec = dia_fec;
        this.mes_fec = mes_fec;
        this.año_fec = año_fec;
        this.goles_a_favor = goles_a_favor;
        this.goles_en_contra = goles_en_contra;
        this.tipo_competicion = tipo_competicion;
        this.ciudad = ciudad;
    }
    
    public String getRival() {
        return rival;
    }

    public String getDia_fec() {
        return dia_fec;
    }

    public String getMes_fec() {
        return mes_fec;
    }

    public String getAño_fec() {
        return año_fec;
    }

    public int getGoles_a_favor() {
        return goles_a_favor;
    }

    public int getGoles_en_contra() {
        return goles_en_contra;
    }

    public String getTipo_competicion() {
        return tipo_competicion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public static String Reporte1_equiposVencidos(String año){
        
        ArrayList listaP = ListaPartidos.getListaEst();
        String equiposVencidos = "";
        
        for (int i = 0; i < listaP.size(); i++) {
            partidos objPartido = (partidos) listaP.get(i);
            if (objPartido.getAño_fec()==año && objPartido.getGoles_a_favor()>objPartido.getGoles_en_contra()) {
                equiposVencidos = equiposVencidos + objPartido.getRival() + ", ";
            }
        }
        return equiposVencidos;
    }
    
    public static int Reporte1_totalGolesFavor(String año){
        
        ArrayList listaP = ListaPartidos.getListaEst();
        int totalGolesFavor = 0;
        
        for (int i = 0; i < listaP.size(); i++) {
            partidos objPartido = (partidos) listaP.get(i);
            if (objPartido.getAño_fec()==año && objPartido.getGoles_a_favor()>objPartido.getGoles_en_contra()) {
                totalGolesFavor+=objPartido.getGoles_a_favor();
            }
        }
        return totalGolesFavor;
    }
    
    public static ArrayList Reporte2(String tipoCompetencia){
        
        ArrayList listaP = ListaPartidos.getListaEst();
        ArrayList listaF = new ArrayList();
        
        for (int i = 0; i < listaP.size(); i++) {
            partidos objPart = (partidos) listaP.get(i);
            if (objPart.getTipo_competicion().equalsIgnoreCase(tipoCompetencia)) {
                listaF.add(objPart);
            }
        }
        return listaF;
    }
    
}
