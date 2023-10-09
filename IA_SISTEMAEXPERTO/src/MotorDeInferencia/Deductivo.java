package MotorDeInferencia;

import BaseDeConocimientos.Reglas;
import BaseDeConocimientos.ArrayList_DiscoDuro;
import BaseDeConocimientos.ArrayList_SistemaOperativo;
import BaseDeConocimientos.ArrayList_Ventilador;
import BaseDeHechos.Hechos;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author GRUPO_06_IA_B
 */
public class Deductivo {

    ArrayList hechos = Hechos.consultarsignosDD();

    public static ArrayList verificar(ArrayList hechos) {

        String falla= null;

        ArrayList s1 = new ArrayList(ArrayList_Ventilador.consultarnombressignosV());
        ArrayList s2 = new ArrayList(ArrayList_DiscoDuro.consultarnombressignosDD());
        ArrayList s3 = new ArrayList(ArrayList_SistemaOperativo.consultarnombressignosSO());

        ArrayList cp1 = new ArrayList(s1);
        ArrayList cp2 = new ArrayList(s2);
        ArrayList cp3 = new ArrayList(s3);
        ArrayList cph = new ArrayList(hechos);

        Collections.sort(cp1);
        Collections.sort(cp2);
        Collections.sort(cp3);
        Collections.sort(cph);

        if (cp1.equals(cph)) {
            falla = "Ventilador";
            Hechos.agregarSigno(falla);
        } else if (cp2.equals(cph)) {
            falla = "Disco Duro";
            Hechos.agregarSigno(falla);
        } else if (cp3.equals(cph)) {
            falla = "Sistema Operativo";
            Hechos.agregarSigno(falla);
        } else {
            if (Reglas.regla1(cph) == true) {
                falla = "Ventilador";
                Hechos.agregarSigno(falla);
            } else if (Reglas.regla2(cph) == true) {
                falla = "Disco Duro";
                Hechos.agregarSigno(falla);
            } else if (Reglas.regla3(cph) == true) {
                falla = "Sistema Operativo";
                Hechos.agregarSigno(falla);
            } else if (Reglas.regla4(cph) == true) {
                falla = "Ventilador, Disco Duro o Sistema Operativo";
                Hechos.agregarSigno(falla);
            } else if (Reglas.regla5(cph) == true) {
                falla = "Ventilador o Disco Duro";
                Hechos.agregarSigno(falla);
            } else if (Reglas.regla6(cph) == true) {
                falla = "Ventilador o Sistema Operativo";
                Hechos.agregarSigno(falla);
            } else if (Reglas.regla7(cph) == true) {
                falla = "Disco Duro o Sistema Operativo";
                Hechos.agregarSigno(falla);
            }

        }
        return null;
    }
}
