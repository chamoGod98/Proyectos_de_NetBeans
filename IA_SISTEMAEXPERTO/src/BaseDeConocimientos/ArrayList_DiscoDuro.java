
package BaseDeConocimientos;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author GRUPO_06_IA_B
 */

public class ArrayList_DiscoDuro {

    private static ArrayList signosDD = new ArrayList();
    public static void agregarSignoDD() {
        DiscoDuro signo1 = new DiscoDuro();
        signo1.setSigno("Sobrecalentamiento general");
        signo1.setDescripcion("Se da por la temperatura del disco");
        DiscoDuro signo2 = new DiscoDuro();
        signo2.setSigno("Al abrir archivos o carpetas muestra mensaje que está dañado");
        signo2.setDescripcion("El disco duro almacena los archivos, carpetas que tenemos");
        DiscoDuro signo3 = new DiscoDuro();
        signo3.setSigno("Lentitud para abrir,leer,escribir y guardar archivos");
        signo3.setDescripcion("El disco duro almacena todos los datos y su capacidad");
        DiscoDuro signo4 = new DiscoDuro();
        signo4.setSigno("Dificultad para acceder a las unidades(C,D, u otra creada)");
        signo4.setDescripcion("Dado que el disco duro almacena las unidades de almacenamiento");
        DiscoDuro signo5 = new DiscoDuro();
        signo5.setSigno("Sonidos extraños como pítidos");
        signo5.setDescripcion("Es un sonido de un disco dañado");
        
        signosDD.add(signo1);
        signosDD.add(signo2);
        signosDD.add(signo3);
        signosDD.add(signo4);
        signosDD.add(signo5);

    }

    public static ArrayList consultarsignosDD() {
        return signosDD;
    }

    public static ArrayList consultarnombressignosDD() {
        ArrayList nombres = new ArrayList();
        for (Iterator it = signosDD.iterator(); it.hasNext();) {
            DiscoDuro disco = (DiscoDuro) it.next();
            nombres.add(disco.getSigno());
        }
        return nombres;
    }
    
     public static String obtenerDescripcionConsultarnombre(String nombre) {
        String desc = null;

        for (Iterator it = signosDD.iterator(); it.hasNext();) {
            DiscoDuro dd = (DiscoDuro) it.next();

            if (dd.getSigno().equalsIgnoreCase(nombre)) {

                desc = dd.getDescripcion();

            }
        }

        return desc;
    }

}
