package BaseDeHechos;

import java.util.ArrayList;

public class Hechos {

    private static ArrayList hechos = new ArrayList();

    public static void agregarSigno(String signo) {
        hechos.add(signo);
    }
    
    public static ArrayList consultarsignosDD() {
        return hechos;
    }

}
