
package practica;

import java.util.Scanner;

public class cobroestacionamiento {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        byte numHoras,numMinutos;
        double cobroFinal,tarifaAuto=5.5,tarifaMotoyBici=3.5;
        String tipoVehiculo;
        
        System.out.println("Ingrese el número de horas y minutos que el vehículo estuvo en el estacionamiento:");
        numHoras=teclado.nextByte();
        numMinutos=teclado.nextByte();
        System.out.println("Ingrese el tipo de vehículo (en minúsculas):");
        tipoVehiculo = teclado.next();
        
        if ("auto".equals(tipoVehiculo)) {
            if (numMinutos==0) {
                cobroFinal=tarifaAuto*numHoras;
                System.out.println("Tipo de vehículo: " + tipoVehiculo);
                System.out.println("Monto a pagar: " + cobroFinal + " soles");
            } else {
                if (numMinutos<=40) {
                    cobroFinal=(tarifaAuto*numHoras) + (tarifaAuto/2);
                    System.out.println("Tipo de vehículo: " + tipoVehiculo);
                    System.out.println("Monto a pagar: " + cobroFinal + " soles");
                } else {
                    cobroFinal=(tarifaAuto*numHoras) + tarifaAuto;
                    System.out.println("Tipo de vehículo: " + tipoVehiculo);
                    System.out.println("Monto a pagar: " + cobroFinal + " soles");
                }
            }
        } else {
            System.out.println("Ingrese un tipo de vehículo válido");
        }
        
        if ("moto".equals(tipoVehiculo)) {
            if (numMinutos==0) {
                cobroFinal=tarifaMotoyBici*numHoras;
                System.out.println("Tipo de vehículo: " + tipoVehiculo);
                System.out.println("Monto a pagar: " + cobroFinal + " soles");
            } else {
                if (numMinutos<=40) {
                    cobroFinal=(tarifaMotoyBici*numHoras) + (tarifaMotoyBici/2);
                    System.out.println("Tipo de vehículo: " + tipoVehiculo);
                    System.out.println("Monto a pagar: " + cobroFinal + " soles");
                } else {
                    cobroFinal=(tarifaMotoyBici*numHoras) + tarifaMotoyBici;
                    System.out.println("Tipo de vehículo: " + tipoVehiculo);
                    System.out.println("Monto a pagar: " + cobroFinal + " soles");
                }
            }
        } else {
            System.out.println("Ingrese un tipo de vehículo válido");
        }
        
        if ("bicicleta".equals(tipoVehiculo)) {
                if (numMinutos==0) {
                    cobroFinal=tarifaMotoyBici*numHoras;
                    System.out.println("Tipo de vehículo: " + tipoVehiculo);
                    System.out.println("Monto a pagar: " + cobroFinal + " soles");
            } else {
                if (numMinutos<=40) {
                    cobroFinal=(tarifaMotoyBici*numHoras) + (tarifaMotoyBici/2);
                    System.out.println("Tipo de vehículo: " + tipoVehiculo);
                    System.out.println("Monto a pagar: " + cobroFinal + " soles");
                } else {
                    cobroFinal=(tarifaMotoyBici*numHoras) + tarifaMotoyBici;
                    System.out.println("Tipo de vehículo: " + tipoVehiculo);
                    System.out.println("Monto a pagar: " + cobroFinal + " soles");
                }
            }
        } else {
            System.out.println("Ingrese un tipo de vehículo válido");
        }
                