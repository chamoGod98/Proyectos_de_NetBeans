package BaseDeConocimientos;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author GRUPO_06_IA_B
 */

public class ArrayList_Ventilador {

    private static ArrayList signosV = new ArrayList();

    public static void agregarSignoVentilador() {
        Ventilador signo1 = new Ventilador();
        signo1.setSigno("Se apaga inesperadamente");
        signo1.setDescripcion("El ventilador ya no emite aire para regular la temperatura");
        Ventilador signo2 = new Ventilador();
        signo2.setSigno("Ruido fuerte al encender y se mantiene");
        signo2.setDescripcion("El ventilador no está moviendose correctamente");
        Ventilador signo3 = new Ventilador();
        signo3.setSigno("Sobrecalentamiento general");
        signo3.setDescripcion("El ventilador no regula correctamente la temperatura");
        Ventilador signo4 = new Ventilador();
        signo4.setSigno("No enciende");
        signo4.setDescripcion("El ventilador ya no emite aire para regular la temperatura");
        Ventilador signo5 = new Ventilador();
        signo5.setSigno("Se reinicia inesperadamente");
        signo5.setDescripcion("El ventilador no emite correctamente el aire");
        
        signosV.add(signo1);
        signosV.add(signo2);
        signosV.add(signo3);
        signosV.add(signo4);
        signosV.add(signo5);
    }

    public static ArrayList consultarsignosV() {
        return signosV;
    }

    public static ArrayList consultarnombressignosV() {
        ArrayList nombres = new ArrayList();
        for (Iterator it = signosV.iterator(); it.hasNext();) {
            Ventilador ventilador = (Ventilador) it.next();
            nombres.add(ventilador.getSigno());
        }
        return nombres;
    }

    public static String obtenerDescripcionConsultarnombre(String nombre) {
        String desc = null;

        for (Iterator it = signosV.iterator(); it.hasNext();) {
            Ventilador ventilador = (Ventilador) it.next();

            if (ventilador.getSigno().equalsIgnoreCase(nombre)) {

                desc = ventilador.getDescripcion();

            }
        }

        return desc;
    }

}
