package examenrecuperacion;

import java.util.Scanner;

public class HuamánAcostaJefferson {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String Temperatura[][] = new String[7][2];

        Temperatura[0][0] = "no info";
        Temperatura[1][0] = "no info";
        Temperatura[2][0] = "no info";
        Temperatura[3][0] = "no info";
        Temperatura[4][0] = "no info";
        Temperatura[5][0] = "no info";
        Temperatura[6][0] = "no info";

        Temperatura[0][1] = "no info";
        Temperatura[1][1] = "no info";
        Temperatura[2][1] = "no info";
        Temperatura[3][1] = "no info";
        Temperatura[4][1] = "no info";
        Temperatura[5][1] = "no info";
        Temperatura[6][1] = "no info";

        String opcion;

        //MENÚ
        do {
            System.out.println("\nMENÚ");
            System.out.println("    (G)UARDAR TEMPERATURA:");
            System.out.println("    (B)USCAR UNA TEMPERATURA");
            System.out.println("    (C)ONVERTIR TEMPERATURA A GRADOS CELSIUS O KELVIN");
            System.out.println("    (S)ALIR");
            System.out.println("Elija una opción:");
            opcion = teclado.next();
            opcion = opcion.toLowerCase();

            //OPCIONES MENÚ
            switch (opcion) {
                case "g":
                    for (int i = 0; i < 7; i++) {
                        System.out.println("\nIngrese el día " + (i + 1));
                        Temperatura[i][0] = teclado.next();
                        System.out.println("Ingrese la temperatura del día " + (i + 1) + " (en grados C°):");
                        float x;
                        do {
                            Temperatura[i][1] = teclado.next();
                            x = Float.parseFloat(Temperatura[i][1]);
                            if (x <= 0) {
                                System.out.println("\nIngrese un valor válido:");
                            }
                        } while (x <= 0);
                    }
                    System.out.println("\nTemperaturas registradas exitosamente");
                    break;
                case "b":
                    if (Temperatura[0][0] == "no info") {
                        System.out.println("\nEs necesario registrar las temperaturas en el menú (G)");
                    } else {
                        String consultaT;
                        int i;
                        System.out.println("\nIngrese el día de la temperatura a consultar:");
                            consultaT = teclado.next();
                            for (i = 0; i < 7; i++) {
                                if (consultaT.equals(Temperatura[i][0])) {
                                    break;
                                }
                            }
                            if (consultaT.equals(Temperatura[i][0])) {
                                System.out.println("La temperatura del día " + Temperatura[i][0] + " es " + Temperatura[i][1] + "° C");
                            } else {
                                System.out.println("Este día de la semana no existe. Regresando al menú principal...");
                            }
                    }
                    break;
                case "c": //Convertir temperatura
                    //Farenheit: (0 °C × 9/5) + 32 = 32 °F
                    //Kelvin: 0 °C + 273.15 = 273.15 K
                    if (Temperatura[0][0] == "no info") {
                        System.out.println("\nEs necesario registrar las temperaturas en el menú (G)");
                    } else {
                        System.out.println("\nIngrese el tipo de temperatura a la que desea convertir:");
                        System.out.println("Ingrese 3 para salir");
                        System.out.println("1. Farenheit    2. Kelvin");
                        int tipoT;
                        do {
                            tipoT = teclado.nextInt();
                            String convertirT;
                            int i;
                            double temperaturaConv;
                            switch (tipoT) {
                                case 1:
                                    System.out.println("Ingrese un día de la semana para ver la temperatura en °F:");
                                    convertirT = teclado.next();
                                    for (i = 0; i < 7; i++) {
                                        if (convertirT.equals(Temperatura[i][0])) {
                                            break;
                                        }
                                    }
                                    temperaturaConv = Double.parseDouble(Temperatura[i][1]);
                                    temperaturaConv = (temperaturaConv * 9 / 5) + 32;
                                    if (convertirT.equals(Temperatura[i][0])) {
                                        System.out.println("La temperatura del día " + convertirT + " es " + temperaturaConv + "°F");
                                    } else {
                                        System.out.println("Este día de la semana no existe. Ingrese un día válido");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Ingrese un día de la semana para ver la temperatura en °K:");
                                    convertirT = teclado.next();
                                    for (i = 0; i < 7; i++) {
                                        if (convertirT.equals(Temperatura[i][0])) {
                                            break;
                                        }
                                    }
                                    temperaturaConv = Double.parseDouble(Temperatura[i][1]);
                                    temperaturaConv = temperaturaConv + 273.15;
                                    if (convertirT.equals(Temperatura[i][0])) {
                                        System.out.println("La temperatura del día " + convertirT + " es " + temperaturaConv +"°K");
                                    } else {
                                        System.out.println("Este día de la semana no existe. Ingrese un día válido");
                                    }
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Ingrese una opción válida");
                            }
                        } while ((tipoT != 1) & (tipoT != 2) & (tipoT != 3));
                    }
                    break;
                case "s":
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese nuevamente.");
                    break;
            }
        } while (!opcion.equals("s"));
        System.out.println("\nHA SALIDO DEL PROGRAMA");
    }

}
