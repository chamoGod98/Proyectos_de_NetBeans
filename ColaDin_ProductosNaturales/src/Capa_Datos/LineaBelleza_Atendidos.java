
package Capa_Datos;

import TColas.TCola;
import TColas.TColaDin;

public class LineaBelleza_Atendidos {
    
    public static TCola objetos = new TColaDin();

    public static void agregar(Object cli){
        objetos.Insertar(cli);
    }
    
    public static TCola consultar(){
        return objetos;
    }
    
}
