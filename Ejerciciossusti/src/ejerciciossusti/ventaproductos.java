package ejerciciossusti;

import java.util.Scanner;

public class ventaproductos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String productos[][] = new String[6][2];

        productos[0][0] = "galleta";
        productos[1][0] = "chocolate";
        productos[2][0] = "gaseosa";
        productos[3][0] = "yogurt";
        productos[4][0] = "snack";
        productos[5][0] = "queso";

        productos[0][1] = "3";
        productos[1][1] = "4";
        productos[2][1] = "1.5";
        productos[3][1] = "3.5";
        productos[4][1] = "7";
        productos[5][1] = "5.5";

        String nombreBoleta[] = new String[6];
        float precioBoleta[] = new float[6];
        int cantidadBoleta[] = new int[6];
        int cant;
        int totalProd;
        double total, totalCD, dporU = 0.1, dporM = 0.15, totalCDM, totalCDU;

        System.out.println("\nBIENVENIDO");

        //Ingresar la cantidad de productos del array establecido
        System.out.println("Ingrese la cantidad de productos que desee vender:");
        do {
            cant = teclado.nextInt();
            if (cant < 1 | cant > 6) {
                System.out.println("\nIngrese una cantidad válida:");
            }
        } while (cant < 1 | cant > 6);

        System.out.println("-------------------------------------------");

        //Para ingresar el nombre del producto que queremos vender y validarlo de acuerdo al array [0] y, ver su precio de acuerdo al array [1]
        int i, j;

        for (i = 0; i < cant; i++) {
            System.out.println("\nIngrese el producto " + (i + 1));
            do {
                nombreBoleta[i] = teclado.next();
                nombreBoleta[i] = nombreBoleta[i].toLowerCase();
                for (j = 0; j < 6; j++) {
                    if (nombreBoleta[i].equals(productos[j][0])) {
                        precioBoleta[i] = Float.parseFloat(productos[j][1]);
                        break;
                    } else if (j == 5) {
                        System.out.println("\nIngrese un producto válido:");
                        break;
                    }
                }
            } while (!nombreBoleta[i].equals(productos[j][0]));
        }

        System.out.println("-------------------------------------------");

        //Ingresar la cantidad de productos
        for (int k = 0; k < cant; k++) {
            System.out.println("Ingrese la cantidad del producto " + (k + 1));
            do {
                cantidadBoleta[k] = teclado.nextInt();
                if (cantidadBoleta[k] < 1) {
                    System.out.println("Ingrese una cantidad válida:");
                }
            } while (cantidadBoleta[k] < 1);

        }

        //Precio total de productos vendidos
        totalProd = cantidadBoleta[0] + cantidadBoleta[1] + cantidadBoleta[2] + cantidadBoleta[3] + cantidadBoleta[4] + cantidadBoleta[5];
        //Precio total a pagar (sin descuento)
        total = precioBoleta[0] * cantidadBoleta[0] + precioBoleta[1] * cantidadBoleta[1] + precioBoleta[2] * cantidadBoleta[2] + precioBoleta[3] * cantidadBoleta[3] + precioBoleta[4] * cantidadBoleta[4] + precioBoleta[5] * cantidadBoleta[5];
        //Precio total a pagar (solo con descuento por unidad)
        totalCDU = precioBoleta[0] - (precioBoleta[0] * dporU)
                + precioBoleta[1] - (precioBoleta[1] * dporU)
                + precioBoleta[2] - (precioBoleta[2] * dporU)
                + precioBoleta[3] - (precioBoleta[3] * dporU)
                + precioBoleta[4] - (precioBoleta[4] * dporU)
                + precioBoleta[5] - (precioBoleta[5] * dporU);
        //Precio total a pagar (solo con descuento por monto)
        totalCDM = total - total * dporM;
        //Precio total a pagar (con descuento por monto y por unidad)
        totalCD = totalCDU * dporM;

        //BOLETA DE VENTA
        if (totalProd >= 20) {
            //BOLETA DE VENTA EN CASO SE APLIQUE DESCUENTO POR UNIDAD Y POR MONTO
            if (total > 300) {
                System.out.println("\nNOTA DE PEDIDOS");
                System.out.println("-------------------------------------------");
                System.out.println("PRODUCTO    PRECIO    CANTIDAD    SUBTOTAL");
                for (int k = 0; k < cant; k++) {
                    System.out.printf("%8s", nombreBoleta[k]);
                    System.out.printf("%10.2f", precioBoleta[k] - (precioBoleta[k] * dporU));
                    System.out.printf("%12d", cantidadBoleta[k]);
                    System.out.printf("%12.2f", (precioBoleta[k] - (precioBoleta[k] * dporU)) * cantidadBoleta[k]);
                    System.out.println("\n");
                }
                System.out.println("-------------------------------------------");
                System.out.println("\nTotal (sin descuento): " + total);
                System.out.println("Descuento aplicado: " + (dporM * 100) + "%");
                System.out.println("Total de venta:");
                System.out.printf("%.2f", totalCD);
                System.out.println("Descuento por producto aplicado: " + (dporU * 100) + "%");
                System.out.print("\n");
            } else {
                //BOLETA DE VENTA SI SOLO SE APLICA DESCUENTO POR UNIDAD
                System.out.println("\nNOTA DE PEDIDOS");
                System.out.println("-------------------------------------------");
                System.out.println("PRODUCTO    PRECIO    CANTIDAD    SUBTOTAL");
                for (int k = 0; k < cant; k++) {
                    System.out.printf("%8s", nombreBoleta[k]);
                    System.out.printf("%10.2f", precioBoleta[k] - (precioBoleta[k] * dporU));
                    System.out.printf("%12d", cantidadBoleta[k]);
                    System.out.printf("%12.2f", (precioBoleta[k] - (precioBoleta[k] * dporU)) * cantidadBoleta[k]);
                    System.out.println("\n");
                }
                System.out.println("-------------------------------------------");
                System.out.println("Total de venta:");
                System.out.printf("%.2f", totalCDU);
                System.out.println("Descuento por producto aplicado: " + (dporU * 100) + "%");
                System.out.print("\n");
            }
        } else {
            if (total > 300) {
                //DESCUENTO SI SOLO SE APLICA DESCUENTO POR MONTO
                System.out.println("\nNOTA DE PEDIDOS");
                System.out.println("-------------------------------------------");
                System.out.println("PRODUCTO    PRECIO    CANTIDAD    SUBTOTAL");
                for (int k = 0; k < cant; k++) {
                    System.out.printf("%8s", nombreBoleta[k]);
                    System.out.printf("%10.2f", precioBoleta[k]);
                    System.out.printf("%12d", cantidadBoleta[k]);
                    System.out.printf("%12.2f", precioBoleta[k] * cantidadBoleta[k]);
                    System.out.println("\n");
                }
                System.out.println("-------------------------------------------");
                System.out.println("\nTotal (sin descuento): " + total);
                System.out.println("Descuento aplicado: " + (dporM * 100) + "%");
                System.out.println("Total de venta:");
                System.out.printf("%.2f", totalCDM);
                System.out.print("\n");
            } else {
                //BOLETA DE VENTA SI NO SE APLICA NI DESCUENTO POR UNIDAD NI DESCUENTO POR MONTO
                System.out.println("\nNOTA DE PEDIDOS");
                System.out.println("-------------------------------------------");
                System.out.println("PRODUCTO    PRECIO    CANTIDAD    SUBTOTAL");
                for (int k = 0; k < cant; k++) {
                    System.out.printf("%8s", nombreBoleta[k]);
                    System.out.printf("%10.2f", precioBoleta[k]);
                    System.out.printf("%12d", cantidadBoleta[k]);
                    System.out.printf("%12.2f", precioBoleta[k] * cantidadBoleta[k]);
                    System.out.println("\n");
                }
                System.out.println("-------------------------------------------");
                System.out.println("Total de venta:");
                System.out.printf("%.2f", total);
                System.out.print("\n");
            }
        }
    }
}
