/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cliente;

/**
 *
 * @author jefer
 */
public class ApCine {

    /*
    Elabore un programa orientado a objetos en 3 capas, que permita simular las colas de atención en un cine.
    - Existen 2 colas de atención, en la primera cola se atienden los clientes que tienen tarjeta (oro, plata y black)
    y en la segunda cola los clientes sin tarjeta.
    - El cliente tendrá los siguientes atributos: nombre de la persona, edad, sexo, tipo de tarjeta, número de entradas y total pagado.
    - Asumir un costo de entrada general de 15 soles.
    Desarrollar:
        a. Registrar un cliente.
        b. Atender un cliente.
        c. Mostrar el número de clientes atendidos por tipo de tarjeta.
        d. Qué cliente por atender tiene la mayor edad.
        e. Mostrar los clientes black cuyo total pagado sea mayor a un valor ingresado.
        f. Mostrar el número de clientes hombres y mujeres, atendidos y por atender.
        g. Dado el nombre de la persona, mostrar cuántas veces ha ido al cine y el promedio del total pagado.
     */
    public static void main(String[] args) {
        new FrmPrincipal().setVisible(true);
    }

}
