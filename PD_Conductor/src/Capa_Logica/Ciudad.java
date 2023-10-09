/*
 Un conductor maneja de un pueblo origen a un pueblo destino, pasando por varios
pueblos. Registrar la nombre que visita y el tiempo de permanencia en cada lugar (en
minutos).
 */
package Capa_Logica;

import Capa_Datos.PilaCiudad;
import TPilas.TPila;
import TPilas.TPilaDin;
import TPilas.TPilaEn;

/**
 *
 * @author Franko
 */
public class Ciudad {

    private String nombre, origen, destino;
    private int tiempoPermanencia;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTiempoPermanencia() {
        return tiempoPermanencia;
    }

    public void setTiempoPermanencia(int tiempoPermanencia) {
        this.tiempoPermanencia = tiempoPermanencia;
    }

    public static TPila ConsultarTodo() throws Exception {
        return PilaCiudad.Obtener();
    }

    //a. Registrar cada ciudad
    //b. Extraer una ciudad
    public static Object Extraer() throws Exception {
        TPila Pila = Ciudad.ConsultarTodo();
        Ciudad objCiudad = null;
        objCiudad = (Ciudad) Pila.Pop();

        return objCiudad;

    }

    //c. Una vez en el pueblo destino, el conductor debe regresar a casa por el mismo camino. Muestre el camino recorrido tanto de ida como de vuelta.
    public static TPila CaminoVuelta() throws Exception {
        TPila PilaOriginal = Ciudad.ConsultarTodo();
       TPila PilaVuelta = new TPilaEn();
       Ciudad objCiudad=null;
       int n=PilaOriginal.Cantidad();

       for (int i = 0; i < n; i++) {
           objCiudad = (Ciudad) PilaOriginal.Pop();
           PilaVuelta.Push(objCiudad); //Camino de vuelta
       }
       
        return PilaVuelta;

    }

    //d. Mostrar el tiempo total de permanencia en dichos lugares.
    public static int TiempoTotalPermanecia() throws Exception {
        TPila PilaOriginal = Ciudad.ConsultarTodo();
       int sumaTiempo = 0;
       int n=PilaOriginal.Cantidad();
       for (int i = 0; i < n; i++) {
           Ciudad objCiudad = (Ciudad) PilaOriginal.Pop();
           sumaTiempo += objCiudad.getTiempoPermanencia();
       }
        return sumaTiempo;

    }

    //e. Extraer las ciudades en las que permaneció menos de 60 minutos.
    public static TPila Menos60Min() throws Exception {
        TPila PilaOriginal = Ciudad.ConsultarTodo();
        TPila PilaFiltrada = new TPilaEn();
        int n = PilaOriginal.Cantidad();

        for (int i = 0; i < n; i++) {
            Ciudad objCiudad = (Ciudad) PilaOriginal.Pop();
            if (objCiudad.getTiempoPermanencia() < 60) {
                PilaFiltrada.Push(objCiudad);
            }
        }
        return PilaFiltrada;
    }
}
