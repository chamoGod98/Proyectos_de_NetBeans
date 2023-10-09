
package Capa_Datos;

import TColas.TCola;
import TColas.TColaDin;

public class LineaSalud_Atendidos {
    
    public static TCola objetos = new TColaDin();
    
    public static void agregar(Object cli){
        objetos.Insertar(cli);
    }
    
    public static TCola consultar(){
        return objetos;
    }

}
