
package Capa_Datos;

import Capa_Negocio.*;
import TListas.*;

public class Lista_Productos {
    
    private static TLista objetos = new TListaEn();
    
    public static void adicionar(Producto obj) {
        objetos.Adicionar(obj);
    }
    
    public static TLista consultar() {
        return objetos;
    }
    
}
