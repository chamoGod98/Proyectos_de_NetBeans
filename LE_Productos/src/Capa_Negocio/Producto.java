// Elabore un programa orientado a objetos en 3 capas, aplicando Listas Enlazadas, que permita llevar el registro de los Productos que vende una empresa comercial. Siendo los atributos de los productos: código, nombre del producto, tipo (Puede ser: consumo masivo, consumo hogares), producción (expresado en kilos), lote (Puede ser: lotes desde 1 hasta 5) y el costo (por kilo).
// Desarrollar lo siguiente:
//  a. Registrar un producto.
//  b. Dado el tipo, mostrar los productos.
//  c. Mostrar los productos cuya producción es menor a un valor ingresado.
//  d. ¿Cuál es el producto de mayor producción?
//  e. Dado el producto, mostrar el total producido en cada lote.
//  f. Dado el código del producto, eliminarlo de la lista.


package Capa_Negocio;

import Capa_Datos.Lista_Productos;
import TListas.TLista;
import TListas.TListaEn;

public class Producto {
    
    String codigo;
    String nombreProducto;
    String tipoProducto;
    float cantProduccion;
    int lote;
    float costoPorKg;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public float getCantProduccion() {
        return cantProduccion;
    }

    public void setCantProduccion(float cantProduccion) {
        this.cantProduccion = cantProduccion;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public float getCostoPorKg() {
        return costoPorKg;
    }

    public void setCostoPorKg(float costoPorKg) {
        this.costoPorKg = costoPorKg;
    }
    
    //Consultar todos los productos
    public static TLista consultarTodos(){
        return Lista_Productos.consultar();
    }
    
    //Dado el tipo, mostrar los productos
    public static TLista listaPorTipoProducto(String tipoProducto){
        TLista lista = Lista_Productos.consultar();
        TLista listaPorTipo = new TListaEn();
        
        for (int i = 0; i < lista.Cantidad(); i++) {
            Producto objProducto = (Producto)lista.Obtener(i);
            if (objProducto.getTipoProducto().compareTo(tipoProducto)==0) {
                listaPorTipo.Adicionar(objProducto);
            }
        }
        return listaPorTipo;
    }
    
    //Mostrar los productos cuya producción es menor a un valor ingresado
    public static TLista ProductosConMenorProduccion(float cantProduccion){
        TLista lista = Lista_Productos.consultar();
        TLista listaProdMenorProduccion = new TListaEn();
        
        for (int i = 0; i < lista.Cantidad(); i++) {
            Producto objProducto = (Producto)lista.Obtener(i);
            if (objProducto.getCantProduccion()<cantProduccion) {
                listaProdMenorProduccion.Adicionar(objProducto);
            }
        }
        return listaProdMenorProduccion;
    }
    
    //¿Cuál es el producto de mayor producción?
    public static TLista ProductoConMayorProduccion() {
        TLista lista = Producto.consultarTodos();
        TLista listaProductoMayor = new TListaEn();
        float mayor = 0;  
        
        for (int i = 0; i < lista.Cantidad(); i++) {
            Producto objProducto = (Producto) lista.Obtener(i);
            if (objProducto.getCantProduccion() > mayor) 
                mayor = objProducto.getCantProduccion();
        }
        for (int i = 0; i < lista.Cantidad(); i++) {
            Producto objProducto = (Producto) lista.Obtener(i);
            if (objProducto.getCantProduccion() == mayor) {
                listaProductoMayor.Adicionar(objProducto);
            }
        }
        return listaProductoMayor;
    }
    
    //Dado el producto, mostrar el total producido en cada lote
    public static float TotalPorLote(String nombreProducto) {
        TLista lista = Producto.consultarTodos();
        float cantProd = 0;
        for (int i = 0; i < lista.Cantidad(); i++) {
            Producto objProducto = (Producto) lista.Obtener(i);
            if (objProducto.getNombreProducto().compareTo(nombreProducto)==0) {
                cantProd=objProducto.getCantProduccion();
            }
        }
        return cantProd;
    }
    
    //Dado el código del producto eliminarlo de la lista
    public static void EliminarProducto(String codigo) {
        TLista lista = Producto.consultarTodos();
        for (int i = 0; i < lista.Cantidad(); i++) {
            Producto objProducto = (Producto) lista.Obtener(i);
            if (objProducto.getCodigo().compareTo(codigo)==0) {
                lista.Eliminar(i);
            }
        }
    }
}
