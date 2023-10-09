
package Capa_Datos;

import Capa_Negocio.Participante;
import java.util.ArrayList;

public class Lista_Participantes {
    
    private static ArrayList<Participante> ListaParticipantes = new ArrayList<Participante>();
    
    public static void registrar(Participante obj) {
        ListaParticipantes.add(obj);
    }
    
    public static ArrayList consultar() {
        return ListaParticipantes;
    }
    
}
