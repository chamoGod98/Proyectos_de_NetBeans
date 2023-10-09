package Logica;

import Datos.ListadoGeneral;
import TListas.*;

public class Cliente {
    
    private String nombre;
    private int edad;
    private String sexo;
    private String pelicula;
    private float costoEntrada;
    private String categoria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public float getCostoEntrada() {
        return costoEntrada;
    }

    public void setCostoEntrada(float costoEntrada) {
        this.costoEntrada = costoEntrada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    //Clientes registrados previamente
    public static void datos(){
        Cliente obj=new Cliente();
        Cliente obj2=new Cliente();
        Cliente obj3=new Cliente();
        Cliente obj4=new Cliente();
        Cliente obj5=new Cliente();
        Cliente obj6=new Cliente();
        Cliente obj7=new Cliente();
        Cliente obj8=new Cliente();
        Cliente obj9=new Cliente();
        Cliente obj10=new Cliente();
        obj.setNombre("Yamir");obj.setEdad(24);obj.setSexo("Masculino");obj.setPelicula("Hulk");obj.setCategoria("General");obj.setCostoEntrada(30);
        obj2.setNombre("Carmen");obj2.setEdad(57);obj2.setSexo("Femenino");obj2.setPelicula("Hulk");obj2.setCategoria("General");obj2.setCostoEntrada(30);
        obj3.setNombre("Roxana");obj3.setEdad(29);obj3.setSexo("Femenino");obj3.setPelicula("Superman");obj3.setCategoria("General");obj3.setCostoEntrada(30);
        obj4.setNombre("Zulmi");obj4.setEdad(59);obj4.setSexo("Femenino");obj4.setPelicula("Thor");obj4.setCategoria("General");obj4.setCostoEntrada(30);
        obj5.setNombre("Francis");obj5.setEdad(33);obj5.setSexo("Masculino");obj5.setPelicula("Superman");obj5.setCategoria("General");obj5.setCostoEntrada(30);
        obj6.setNombre("Flor");obj6.setEdad(65);obj6.setSexo("Femenino");obj6.setPelicula("Thor");obj6.setCategoria("Adulto mayor");obj6.setCostoEntrada(15);
        obj7.setNombre("Joaquin");obj7.setEdad(7);obj7.setSexo("Masculino");obj7.setPelicula("Thor");obj7.setCategoria("Niño");obj7.setCostoEntrada(15);
        obj8.setNombre("Lissett");obj8.setEdad(32);obj8.setSexo("Femenino");obj8.setPelicula("Thor");obj8.setCategoria("General");obj8.setCostoEntrada(30);
        obj9.setNombre("Ana Fiorella");obj9.setEdad(28);obj9.setSexo("Femenino");obj9.setPelicula("Hulk");obj9.setCategoria("General");obj9.setCostoEntrada(30);
        obj10.setNombre("Mariana");obj9.setEdad(8);obj10.setSexo("Femenino");obj10.setPelicula("Hulk");obj10.setCategoria("Niño");obj10.setCostoEntrada(15);
        ListadoGeneral.adicionar(obj);
        ListadoGeneral.adicionar(obj2);
        ListadoGeneral.adicionar(obj3);
        ListadoGeneral.adicionar(obj4);
        ListadoGeneral.adicionar(obj5);
        ListadoGeneral.adicionar(obj6);
        ListadoGeneral.adicionar(obj7);
        ListadoGeneral.adicionar(obj8);
        ListadoGeneral.adicionar(obj9);
        ListadoGeneral.adicionar(obj10);
    } //Datos previamente registrados
    
    //Monto recaudado por venta de entrada general, niños y adultos mayores
    public static double[] montoRecaudado(){
        Cliente obj;
        double monto[] = new double[3]; //0 para General, 1 para Niño, y 2 para Adulto mayor
        TLista listaG = ListadoGeneral.consultar();
        for (int i = 0; i < listaG.Cantidad(); i++) {
            obj = (Cliente)listaG.Obtener(i);
            if (obj.getCategoria().equalsIgnoreCase("General")) {
                monto[0]+=obj.getCostoEntrada();
            } else if (obj.getCategoria().equalsIgnoreCase("Niño")) {
                monto[1]+=obj.getCostoEntrada();
            } else {
                monto[2]+=obj.getCostoEntrada();
            }
        }
        return monto;
    }
    
    private String usuario="Anggelo";
    private int contraseña=1234;

    public String getUsuario() {
        return usuario;
    }

    public int getContraseña() {
        return contraseña;
    }
}
