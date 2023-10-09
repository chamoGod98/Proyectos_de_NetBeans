/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaNegocio;

import TDAColas.Cola;
import capaDatos.ColaCliente;
import capaDatos.ColaMartillo;
import capaDatos.ColaMontanaRusa;
import capaDatos.ColaTagada;

/**
 *
 * @author laboratorio_computo
 */
public class Cliente {
    private String nombre;
    private Byte edad;
    private String sexo;
    private String juego;

    public Cliente(String nombre, Byte edad, String sexo, String juego) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.juego = juego;
    }

    public Cliente() {
    }
    public void registrarVenta(Cliente c){
        ColaCliente.adicionar(c);
    }
    public static Cola consultarVenta(){
        return ColaCliente.consultar();
    }

    public Cliente(String nombre, Byte edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.juego = "-";
    }
    
    public void registrarJuego(Cliente c , String juego){
        if (juego.equals("Martillo")) {
            ColaMartillo.adicionar(c);
        } else if (juego.equals("Montaña Rusa")) {
            ColaMontanaRusa.adicionar(c);
        } else if (juego.equals("Tagadá")) {
            ColaTagada.adicionar(c);
        } 
    }
    public static Cola consultarJuego(String j){
        if (j.equals("Martillo")) {
            return ColaMartillo.consultar();
        } else if (j.equals("Montaña Rusa")) {
            return ColaMontanaRusa.consultar();
        } else {
            return ColaTagada.consultar();
        } 
    }
    public void demo(){
        byte edad =12;
        String ju;
        for (int i = 1; i < 66; i++) {
            String n = "Persona"+i;
            String s;
            if (i%2==0) {
            s = "Masculino";    
            } else {
                s="Femenino";
            }
            if (i%2==0) {
                ju = "Martillo";
            } else if (i%3==0) {
                ju = "Montaña Rusa";
            } else {
                ju="Tagadá";
            }
            Cliente c = new Cliente(n,(byte) edad,s);
            registrarJuego(c,ju);
            edad++;
        }
    }
    public float[] montoRecaudadoJuego(){
  
        float n[] = new float[3];
        Cola auxMartillo = ColaMartillo.consultar();
        Cola auxMR = ColaMontanaRusa.consultar();
        Cola auxT = ColaTagada.consultar();
        n[0]=(auxMartillo.tamanio())*35;
        n[1]=(auxMR.tamanio())*20;
        n[2]=(auxT.tamanio())*25;
        return n;
    }
    public String getNombre() {
        return nombre;
    }

    public Byte getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getJuego() {
        return juego;
    }
}
