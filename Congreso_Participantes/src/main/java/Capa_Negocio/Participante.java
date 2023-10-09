package Capa_Negocio;

import Capa_Datos.Lista_Participantes;
import java.util.ArrayList;

public class Participante {

    String nombre;
    String sexo;
    String tipoParticipante;
    String univProcedencia;
    int costoParticipante;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoParticipante() {
        return tipoParticipante;
    }

    public void setTipoParticipante(String tipoParticipante) {
        this.tipoParticipante = tipoParticipante;
    }

    public String getUnivProcedencia() {
        return univProcedencia;
    }

    public void setUnivProcedencia(String univProcedencia) {
        this.univProcedencia = univProcedencia;
    }

    public float getCostoParticipante() {
        return costoParticipante;
    }

    public void setCostoParticipante(int costoParticipante) {
        this.costoParticipante = costoParticipante;
    }

    public static ArrayList consultarTodos() {
        return Lista_Participantes.consultar();
    }

    public static ArrayList consultarParticipantesInscritos(String univProcedencia, String tipoParticipante) {
        ArrayList ListaGeneral = new ArrayList();
        Participante objParticipante;
        ArrayList lista = Participante.consultarTodos();
        for (int i = 0; i < lista.size(); i++) {
            objParticipante = (Participante) lista.get(i);
            if (objParticipante.getUnivProcedencia().compareTo(univProcedencia) == 0 & objParticipante.getTipoParticipante().compareTo(tipoParticipante) == 0) {
                ListaGeneral.add(objParticipante);
            }
        }

        return ListaGeneral;
    }

    public static ArrayList listaPorSexo(String sexo) {
        ArrayList listaPorSexo = new ArrayList();
        Participante objParticipante;
        ArrayList lista = Participante.consultarTodos();

        for (int i = 0; i < lista.size(); i++) {
            objParticipante = (Participante) lista.get(i);
            if (objParticipante.getSexo().compareTo(sexo) == 0) {
                listaPorSexo.add(objParticipante);
            }
        }
        return listaPorSexo;
    }
    
    public static int numeroPregrado(String sexo) {
        int numPregrado;
        ArrayList listaPregrado=new ArrayList();
        Participante objPregrado;
        ArrayList lista=listaPorSexo(sexo);
        for (int i = 0; i < lista.size(); i++) {
            objPregrado=(Participante)lista.get(i);
            if (objPregrado.getTipoParticipante().equals("Pregrado")) {
                listaPregrado.add(objPregrado);
            }
        }
        numPregrado=listaPregrado.size();
        return numPregrado;
    }
    
    public static int numeroPosgrado(String sexo) {
        int numPosgrado;
        ArrayList listaPosgrado=new ArrayList();
        Participante objPosgrado;
        ArrayList lista=listaPorSexo(sexo);
        for (int i = 0; i < lista.size(); i++) {
            objPosgrado=(Participante)lista.get(i);
            if (objPosgrado.getTipoParticipante().equals("Pregrado")) {
                listaPosgrado.add(objPosgrado);
            }
        }
        numPosgrado=listaPosgrado.size();
        return numPosgrado;
    }
    
    public static int numeroAlumnosUSAT() {
        int numAlumnosUSAT;
        ArrayList listaAlumnosUSAT=new ArrayList();
        ArrayList lista=Participante.consultarTodos();
        Participante objParticipante;
        for (int i = 0; i < lista.size(); i++) {
            objParticipante=(Participante) lista.get(i);
            if (objParticipante.getUnivProcedencia().equals("USAT")) {
                listaAlumnosUSAT.add(objParticipante);
            }
        }
        numAlumnosUSAT=listaAlumnosUSAT.size();
        return numAlumnosUSAT;
    }
    
    public static float mostrarCostoAlumnosUSAT() {
        float costoTotalAlumnosUSAT, costoPorAlumno,acum=0;
        ArrayList lista=Participante.consultarTodos();
        Participante objParticipante;
        for (int i = 0; i < lista.size(); i++) {
            objParticipante=(Participante) lista.get(i);
            if (objParticipante.getUnivProcedencia().equals("USAT")) {
                costoPorAlumno=objParticipante.getCostoParticipante();
                acum += costoPorAlumno;
            }
        }
        costoTotalAlumnosUSAT=acum;
        return costoTotalAlumnosUSAT;
    }
}
