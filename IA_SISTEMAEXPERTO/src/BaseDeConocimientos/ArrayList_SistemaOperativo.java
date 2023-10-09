
package BaseDeConocimientos;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author GRUPO_06_IA_B
 */

public class ArrayList_SistemaOperativo {
    
     private static ArrayList signosSO = new ArrayList();

    public static void agregarSignoSO() {
        SistemaOperativo signo1 = new SistemaOperativo();
        signo1.setSigno("Pantalla Azul");
        signo1.setDescripcion("El SO no se ejecuta correctamente");
        SistemaOperativo signo2 = new SistemaOperativo();
        signo2.setSigno("Dificultad para habilitar audio y cámara");
        signo2.setDescripcion("El SO guarda las configuraciones del sistema");
        SistemaOperativo signo3 = new SistemaOperativo();
        signo3.setSigno("Cierre inesperado de aplicaciones recién instaladas o actualizadas");
        signo3.setDescripcion("El SO revisa si las aplicaciones son compatibles");
        SistemaOperativo signo4 = new SistemaOperativo();
        signo4.setSigno("Se reinicia inesperadamente");
        signo4.setDescripcion("El SO no se ejecuta correctamente");
        SistemaOperativo signo5 = new SistemaOperativo();
        signo5.setSigno("Sistema bloqueado");
        signo5.setDescripcion("El SO administra los recursos del hardware");
        
        signosSO.add(signo1);
        signosSO.add(signo2);
        signosSO.add(signo3);
        signosSO.add(signo4);
        signosSO.add(signo5);

    }

    public static ArrayList consultarsignosSO() {
        return signosSO;
    }

    public static ArrayList consultarnombressignosSO() {
        ArrayList nombres = new ArrayList();
        for (Iterator it = signosSO.iterator(); it.hasNext();) {
            SistemaOperativo disco = (SistemaOperativo) it.next();
            nombres.add(disco.getSigno());
        }
        return nombres;
    }
    
     public static String obtenerDescripcionConsultarnombre(String nombre) {
        String desc = null;

        for (Iterator it = signosSO.iterator(); it.hasNext();) {
            SistemaOperativo dd = (SistemaOperativo) it.next();

            if (dd.getSigno().equalsIgnoreCase(nombre)) {

                desc = dd.getDescripcion();

            }
        }

        return desc;
    }
}
