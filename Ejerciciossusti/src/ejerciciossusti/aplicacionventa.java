package ejerciciossusti;

import java.util.Scanner;

public class aplicacionventa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contraseña, numIntentos = 0;
        String nombreUsuario;
        String opcionM;

        String productos[][] = new String[4][2];
//productos
        productos[0][0] = "no info";
        productos[1][0] = "no info";
        productos[2][0] = "no info";
        productos[3][0] = "no info";
//precios
        productos[0][1] = "no info";
        productos[1][1] = "no info";
        productos[2][1] = "no info";
        productos[3][1] = "no info";

        System.out.println("HOLA");
        //usuario y contraseña
        do {
            System.out.println("\nIngrese nombre de usuario:");
            nombreUsuario = teclado.next();
            System.out.println("Ingrese contraseña:");
            contraseña = teclado.nextInt();

            if ((nombreUsuario.equals("prueba") & contraseña == 123) | (nombreUsuario.equals("admin") & contraseña == 789)) {
                System.out.println("\nBIENVENIDO");
                break;
            } else {
                System.out.println("Los datos ingresados son incorrectos");
                numIntentos = numIntentos + 1;
            }
        } while (numIntentos < 4);

        //menús
        do {
            System.out.println("\nMENÚ DEL SISTEMA");
            System.out.println("    (I)ngresar productos");
            System.out.println("    (C)onsultar precio de productos");
            System.out.println("    (V)ender productos");
            System.out.println("    (B)ase de productos");
            System.out.println("    (S)alir");
            if (nombreUsuario.equals("admin") & contraseña == 789) {
                System.out.println("    (M)antenimiento");
            } 
            System.out.println("Su opción es:");
            opcionM=teclado.next();
            opcionM=opcionM.toLowerCase();
            switch (opcionM) {
                case "i": //para (Ingresar productos)
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Ingrese el producto "+(i+1));
                        productos[i][0]=teclado.next();
                        System.out.println("Ingrese el precio del producto "+(i+1));
                        float x;
                        do {
                            productos[i][1]=teclado.next();
                            x=Float.parseFloat(productos[i][1]);
                            if (x<=0) {
                                System.out.println("Ingrese un valor válido");
                            }
                        } while (x<=0);
                        
                    }
                    System.out.println("PRODUCTOS REGISTRADOS CON ÉXITO");
                    break;
                case "c": //para Consultar precio de productos
                    if (productos[0][0]=="no info") {
                        System.out.println("Es necesario registrar productos en el menú (I)");
                    } else {
                        String ConsultaProd;
                        int i;
                        System.out.println("Ingrese el producto a consultar");
                        ConsultaProd=teclado.next();
                        for (i = 0; i < 4; i++) {
                            if (ConsultaProd.equals(productos[i][0])) {
                                break;
                            }
                            if (i==3) {
                                break;
                            }
                        }
                        if (ConsultaProd.equals(productos[i][0])) {
                            System.out.println("El precio del producto "+productos[i][0]+ " es "+productos[i][1]);
                        } else {
                            System.out.println("Producto no encontrado");
                        }
                    }
                    break;
                case "v": //Para vender productos
                    if (productos[0][0]=="no info") {
                        System.out.println("Es necesario registrar productos en el menú (I)");
                    } else {
                    
                    int cantProd;
                    String nombreBoleta[]=new String[4];
                    int cantidadBoleta[]=new int[4];
                    float precioBoleta[]=new float[4];
                    
                    System.out.println("Ingrese la cantidad de productos que desee vender:");
                    do {
                        cantProd=teclado.nextInt();
                        if (cantProd<1 | cantProd>4){
                            System.out.println("Ingrese una cantidad válida");
                        }
                    } while (cantProd<1 | cantProd>4);
                    int i,j;
                        for (i = 0; i < cantProd; i++) {
                            System.out.println("Ingrese el producto "+(i+1));
                            do {
                                nombreBoleta[i]=teclado.next();
                                for (j = 0; j < 4; j++) {
                                    if (nombreBoleta[i].equals(productos[j][0])) {
                                        precioBoleta[i]=Float.parseFloat(productos[j][1]);
                                    }
                                    if (j==3) {
                                        System.out.println("No se encontró ningún producto");
                                    }
                                }
                            } while (!nombreBoleta[i].equals(productos[j][0]));
                        }
                        for (int k = 0; k < cantProd; k++) {
                            System.out.println("Ingrese la cantidad del producto "+k);
                            do {
                                cantidadBoleta[k]=teclado.nextInt();
                                if (cantidadBoleta[k]<1) {
                                    System.out.println("Ingrese una cantidad válida");
                                }
                            } while (cantidadBoleta[k]<1);
                            
                        }
                        System.out.println("\nNOTA DE PEDIDOS" + "\n-------------------------------------------");
                        System.out.println("PRODUCTO    PRECIO    CANTIDAD    SUBTOTAL");
                        for (int k = 0; k < cantProd; k++) {
                            System.out.printf("%8s",nombreBoleta[k]);
                            System.out.printf("%10.2f",precioBoleta[k]);
                            System.out.printf("%12d",cantidadBoleta[k]);
                            System.out.printf("%12.2f",(cantidadBoleta[k]*precioBoleta[k]));
                            System.out.println("\n");
                        }
                        float total=precioBoleta[0] * cantidadBoleta[0] + precioBoleta[1] * cantidadBoleta[1] + precioBoleta[2] * cantidadBoleta[2] + precioBoleta[3] * cantidadBoleta[3];
                        System.out.println("                     ----------------------");
                        System.out.println("            Total de venta");
                        System.out.printf("%15.2f",total);
                        System.out.print("\n");
                    }
                    
                    break;
                case "b": //Para base de productos
                    if (productos[0][0]=="no info") {
                        System.out.println("Es necesario registrar productos en el menú (I)");
                    } else {
                        System.out.println("Producto - Precio");
                        for (int i = 0; i < 10; i++) {
                            System.out.println(productos[i][0] + productos[i][1]);
                        }
                        System.out.println("\n");
                    }
                    break;
                case "s": //Para salir del programa
                    break;
                case "m": //Para la sección Mantenimiento
                    if (nombreUsuario.equals("admin") & contraseña == 789) {
                        System.out.println("EN CONSTRUCCIÓN");
                    } else {
                        System.out.println("Ingrese una opción válida");
                    }
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        } while (!opcionM.equals("s"));

    }

}
