package BaseDeConocimientos;

import java.util.ArrayList;

/**
 *
 * @author GRUPO_06_IA_B
 */
public class Reglas {
    
    //Si la mayoría de signos ingresados son de ventilador entonces la falla está en el ventilador
    public static boolean regla1(ArrayList signosIngresados) {

        boolean falla = false ;

        ArrayList s4 = new ArrayList(signosIngresados);
        ArrayList s1 = new ArrayList(ArrayList_Ventilador.consultarnombressignosV());
        ArrayList s2 = new ArrayList(ArrayList_DiscoDuro.consultarnombressignosDD());
        ArrayList s3 = new ArrayList(ArrayList_SistemaOperativo.consultarnombressignosSO());

        ArrayList v = getInterseccion(s4, s1);
        ArrayList dd = getInterseccion(s4, s2);
        ArrayList so = getInterseccion(s4, s3);

        int c1 = v.size();
        int c2 = dd.size();
        int c3 = so.size();

        if (c1 > c2 && c1 > c3) {
            falla = true;
        }

        return falla;
    }

    //Si la mayoría de signos ingresados son de Disco Duro entonces la falla está en el Disco Duro
    public static boolean regla2(ArrayList signosIngresados) {

        boolean falla = false;

        ArrayList s4 = new ArrayList(signosIngresados);
        ArrayList s1 = new ArrayList(ArrayList_Ventilador.consultarnombressignosV());
        ArrayList s2 = new ArrayList(ArrayList_DiscoDuro.consultarnombressignosDD());
        ArrayList s3 = new ArrayList(ArrayList_SistemaOperativo.consultarnombressignosSO());

        ArrayList v = getInterseccion(s4, s1);
        ArrayList dd = getInterseccion(s4, s2);
        ArrayList so = getInterseccion(s4, s3);

        int c1 = v.size();
        int c2 = dd.size();
        int c3 = so.size();

        if (c2 > c1 && c2 > c3) {
            falla = true;
        }

        return falla;
    }

    //Si la mayoría de signos ingresados son del Sistema Operativo entonces la falla está en el Sistema Operativo
    public static boolean regla3(ArrayList signosIngresados) {

        boolean falla = false;

        ArrayList s4 = new ArrayList(signosIngresados);
        ArrayList s1 = new ArrayList(ArrayList_Ventilador.consultarnombressignosV());
        ArrayList s2 = new ArrayList(ArrayList_DiscoDuro.consultarnombressignosDD());
        ArrayList s3 = new ArrayList(ArrayList_SistemaOperativo.consultarnombressignosSO());

        ArrayList v = getInterseccion(s4, s1);
        ArrayList dd = getInterseccion(s4, s2);
        ArrayList so = getInterseccion(s4, s3);

        int c1 = v.size();
        int c2 = dd.size();
        int c3 = so.size();

        if (c3 > c1 && c3 > c2) {
            falla = true;
        }

        return falla;
    }

    //Si los signos ingresados se encuentran en las 3 fallas entonces no se puede determinar en cual de las tres está
    public static boolean regla4(ArrayList signosIngresados) {

        boolean falla = false;

        ArrayList s4 = new ArrayList(signosIngresados);
        ArrayList s1 = new ArrayList(ArrayList_Ventilador.consultarnombressignosV());
        ArrayList s2 = new ArrayList(ArrayList_DiscoDuro.consultarnombressignosDD());
        ArrayList s3 = new ArrayList(ArrayList_SistemaOperativo.consultarnombressignosSO());

        ArrayList v = getInterseccion(s4, s1);
        ArrayList dd = getInterseccion(s4, s2);
        ArrayList so = getInterseccion(s4, s3);

        int c1 = v.size();
        int c2 = dd.size();
        int c3 = so.size();

        if (c1 == c2 && c1 == c3 && c2 == c3) {
            falla = true;
        }

        return falla;
    }

    //Si los signos ingresados se encuentran en el ventilador y disco duro entonces la falla está en uno de ellos
    public static boolean regla5 (ArrayList signosIngresados) {

        boolean falla = false;

        ArrayList s4 = new ArrayList(signosIngresados);
        ArrayList s1 = new ArrayList(ArrayList_Ventilador.consultarnombressignosV());
        ArrayList s2 = new ArrayList(ArrayList_DiscoDuro.consultarnombressignosDD());
        ArrayList s3 = new ArrayList(ArrayList_SistemaOperativo.consultarnombressignosSO());

        ArrayList v = getInterseccion(s4, s1);
        ArrayList dd = getInterseccion(s4, s2);
        ArrayList so = getInterseccion(s4, s3);

        int c1 = v.size();
        int c2 = dd.size();
        int c3 = so.size();

        if (c1 == c2 && c1 > c3 && c2 > c3) {
            falla=true;
        }

        return falla;
    }
    
    //Si los signos ingresados se encuentran en el ventilador y sistema operativo  entonces la falla está en uno de ellos
    public static boolean regla6 (ArrayList signosIngresados) {

        boolean falla=false;

        ArrayList s4 = new ArrayList(signosIngresados);
        ArrayList s1 = new ArrayList(ArrayList_Ventilador.consultarnombressignosV());
        ArrayList s2 = new ArrayList(ArrayList_DiscoDuro.consultarnombressignosDD());
        ArrayList s3 = new ArrayList(ArrayList_SistemaOperativo.consultarnombressignosSO());

        ArrayList v = getInterseccion(s4, s1);
        ArrayList dd = getInterseccion(s4, s2);
        ArrayList so = getInterseccion(s4, s3);

        int c1 = v.size();
        int c2 = dd.size();
        int c3 = so.size();

        if (c1 == c3 && c1 > c2 && c3 > c2) {
           falla=true;
        }

        return falla;
    }
    
    //Si los signos ingresados se encuentran en el disco duro y sistema operativo  entonces la falla está en uno de ellos
    public static boolean regla7 (ArrayList signosIngresados) {

        boolean falla=false;

        ArrayList s4 = new ArrayList(signosIngresados);
        ArrayList s1 = new ArrayList(ArrayList_Ventilador.consultarnombressignosV());
        ArrayList s2 = new ArrayList(ArrayList_DiscoDuro.consultarnombressignosDD());
        ArrayList s3 = new ArrayList(ArrayList_SistemaOperativo.consultarnombressignosSO());

        ArrayList v = getInterseccion(s4, s1);
        ArrayList dd = getInterseccion(s4, s2);
        ArrayList so = getInterseccion(s4, s3);

        int c1 = v.size();
        int c2 = dd.size();
        int c3 = so.size();

        if (c2 == c3 && c2 > c1 && c3 > c1) {
            falla=true;
        }

        return falla;
    }
    
    public static ArrayList getInterseccion(ArrayList listaIngresada, ArrayList lista) {
        ArrayList i = new ArrayList(listaIngresada);
        i.retainAll(lista);
        return i;
    }

}
