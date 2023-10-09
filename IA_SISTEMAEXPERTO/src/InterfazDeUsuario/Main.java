package InterfazDeUsuario;

import BaseDeConocimientos.ArrayList_DiscoDuro;
import BaseDeConocimientos.ArrayList_SistemaOperativo;
import BaseDeConocimientos.ArrayList_Ventilador;

/**
 *
 * @author GRUPO_06_IA_B
 */

public class Main {

    public static void main(String[] args) {

        ArrayList_DiscoDuro.agregarSignoDD();
        ArrayList_Ventilador.agregarSignoVentilador();
        ArrayList_SistemaOperativo.agregarSignoSO();
        
        if (ArrayList_DiscoDuro.consultarsignosDD().size()>0 && ArrayList_Ventilador.consultarsignosV().size()>0 && ArrayList_SistemaOperativo.consultarsignosSO().size()>0) {
        System.out.println("[Datos cargados]");
        }
        FrmSE obj= new FrmSE();
        obj.setVisible(true);

    }
}
