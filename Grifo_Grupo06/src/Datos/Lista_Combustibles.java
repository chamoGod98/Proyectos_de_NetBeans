/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Logica.Combustible;
import TListas.*;

public class Lista_Combustibles {
    
    private static TLista objetos = new TListaDin();
    
    public static void adicionar(Object dato){
        objetos.Adicionar(dato);
    }
    
    public static TLista consultar(){
        return objetos;
    }
    
    public static void eliminar(int pos){
        objetos.Eliminar(pos);
    }
    
    public int buscarCodComb (String codComb) {
        for(int i=0; i<objetos.Cantidad();i++){
            Combustible obj = (Combustible)objetos.Obtener(i);
            if(obj.getCodigo()==codComb)
                     return i;
        }
        return -1;
    }
    
}
