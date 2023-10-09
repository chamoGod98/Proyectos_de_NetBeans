
package Capa_Datos;

import TColas.TCola;
import TColas.TColaEn;

public class LineaBelleza_Normal {
    
    public static TCola objetos = new TColaEn();
    
    public static void agregar(Object cli){
        objetos.Insertar(cli);
    }
    
    public static TCola consultar(){
        return objetos;
    }
    
}
