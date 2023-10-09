package Capa_Negocio;

import Capa_Datos.LineaBelleza_Atendidos;
import Capa_Datos.LineaBelleza_Normal;
import Capa_Datos.LineaSalud_Atendidos;
import Capa_Datos.LineaSalud_Normal;
import TColas.TCola;

public class Cliente {

    private String dni;
    private String nombre;
    private int edad;
    private String sexo;
    private String zona;
    private String tipo;
    private String linea;
    private float monto;
    private int año;
    private int mes;
    private int dia;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, int edad, String sexo, String zona, String tipo, String linea) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.zona = zona;
        this.tipo = tipo;
        this.linea = linea;
    }

    //DEMO
    public static void Demo() {
        Cliente objCl1 = new Cliente("123", "Maria", 18, "Femenino", "Rural", "Asociado", "Belleza");
        Cliente objCl2 = new Cliente("123", "Cesar", 19, "Masculino", "Urbana", "Asociado", "Belleza");
        Cliente objCl3 = new Cliente("123", "Angel", 19, "Masculino", "Rural", "Asociado", "Belleza");
        Cliente objCl4 = new Cliente("123", "Luis", 17, "Masculino", "Urbana", "Particular", "Salud-bienestar");
        Cliente objCl5 = new Cliente("123", "Rosa", 21, "Femenino", "Rural", "Particular", "Salud-bienestar");
        Cliente objCl6 = new Cliente("123", "Juan", 25, "Masculino", "Rural", "Particular", "Salud-bienestar");
        Cliente objCl7 = new Cliente("123", "Ana", 29, "Femenino", "Rural", "Asociado", "Salud-bienestar");

        LineaBelleza_Normal.agregar(objCl1);
        LineaBelleza_Normal.agregar(objCl2);
        LineaBelleza_Normal.agregar(objCl3);
        LineaSalud_Normal.agregar(objCl4);
        LineaSalud_Normal.agregar(objCl5);
        LineaSalud_Normal.agregar(objCl6);
        LineaSalud_Normal.agregar(objCl7);

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

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

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    //Validar que el mismo cliente por atender no este en la misma cola 2 veces
    public static int validarDNI(TCola cola, String DNI) {
        for (int i = 0; i < cola.Cantidad(); i++) {
            Cliente objCli = (Cliente) cola.Obtener(i);
            if (objCli.getDni().equalsIgnoreCase(DNI)) {
                return i;
            }
        }
        return -1;
    }

    //  d. Mostrar el número de clientes hombres y mujeres atendidos en el año 2021
    public static int[] consultarNumClientesXSexo() {
        int contador[] = new int[2];
        TCola LBA = LineaBelleza_Atendidos.consultar();
        TCola LSA = LineaSalud_Atendidos.consultar();
        for (int i = 0; i < LBA.Cantidad(); i++) {
            Cliente objCli = (Cliente) LBA.Obtener(i);
            if (objCli.getAño() == 2021) {
                if (objCli.getSexo().equals("Masculino")) {
                    contador[0]++;
                } else {
                    contador[1]++;
                }
            }
        }
        for (int i = 0; i < LSA.Cantidad(); i++) {
            Cliente objCli = (Cliente) LSA.Obtener(i);
            if (objCli.getAño() == 2021) {
                if (objCli.getSexo().equals("Masculino")) {
                    contador[0]++;
                } else {
                    contador[1]++;
                }
            }
        }
        return contador;
    }

    //  e. Dado el año, mostrar el número de clientes atendidos mensualmente de la línea de salud-bienestar
    public static int[] consultarNumClientesLSAño(int año) {
        int contador[] = new int[12];
        TCola LSA = LineaSalud_Atendidos.consultar();
        for (int i = 0; i < LSA.Cantidad(); i++) {
            Cliente objCli = (Cliente) LSA.Obtener(i);
            if (objCli.getAño() == año) {
                contador[objCli.getMes()]++;
            }
        }
        return contador;
    }

    //  f. Mostrar el número de clientes por tipo de comprador atendidos el 31 de mayo del 2021.
    public static int[] consultarNumClientesXTipo() {
        int contador[] = new int[2];
        TCola LSA = LineaSalud_Atendidos.consultar();
        TCola LBA = LineaBelleza_Atendidos.consultar();
        int año = 2021;
        int mes = 4; // Inicia desde 0 
        int dia = 31;
        for (int i = 0; i < LSA.Cantidad(); i++) {
            Cliente objCli = (Cliente) LSA.Obtener(i);
            if ((objCli.getAño() == año) && (objCli.getMes() == mes) && (objCli.getDia() == dia)) {
                if (objCli.getTipo().equals("Particular")) {
                    contador[0]++;
                } else {
                    contador[1]++;
                }
            }
        }
        for (int i = 0; i < LBA.Cantidad(); i++) {
            Cliente objCli = (Cliente) LBA.Obtener(i);
            if ((objCli.getAño() == año) && (objCli.getMes() == mes) && (objCli.getDia() == dia)) {
                if (objCli.getTipo().equals("Particular")) {
                    contador[0]++;
                } else {
                    contador[1]++;
                }
            }
        }
        return contador;
    }

    //  g. Dado el mes y año, mostrar el número de clientes atendidos diariamente de la zona rural.
    public static int[] consultarNumClientesDiarios(int año, int mes, int cantDias) {

        int contador[] = new int[cantDias];

        TCola LSA = LineaSalud_Atendidos.consultar();
        TCola LBA = LineaBelleza_Atendidos.consultar();

        for (int i = 0; i < LSA.Cantidad(); i++) {
            Cliente objCli = (Cliente) LSA.Obtener(i);
            if ((objCli.getZona().equals("Rural"))) {
                if ((objCli.getAño() == año) && (objCli.getMes() == mes)) {
                    contador[objCli.getDia() - 1]++; //Se le resta 1 porque el array inicia en 0

                }
            }
        }
        for (int i = 0; i < LBA.Cantidad(); i++) {
            Cliente objCli = (Cliente) LBA.Obtener(i);
            if ((objCli.getZona().equals("Rural"))) {
                if ((objCli.getAño() == año) && (objCli.getMes() == mes)) {
                    contador[objCli.getDia() - 1]++; //Se le resta 1 porque el array inicia en 0

                }
            }
        }
        return contador;
    }

    // Dado un rango de años, mostrar el total de monto de compra anual
    public static float[] consultarMontoCompraAnual(int añoInicio, int añoFinal) {
        TCola LBA = LineaBelleza_Atendidos.consultar();
        TCola LSA = LineaSalud_Atendidos.consultar();
        int cantidad = añoFinal - añoInicio + 1;
        float monto[] = new float[cantidad];
        for (int i = 0; i < LBA.Cantidad(); i++) {
            Cliente objCli = (Cliente) LBA.Obtener(i);
            if ((objCli.getAño() >= añoInicio) && (objCli.getAño() <= añoFinal)) {
                monto[objCli.getAño() - añoInicio] += objCli.getMonto();
            }
        }
        for (int i = 0; i < LSA.Cantidad(); i++) {
            Cliente objCli = (Cliente) LSA.Obtener(i);
            if ((objCli.getAño() >= añoInicio) && (objCli.getAño() <= añoFinal)) {
                monto[objCli.getAño() - añoInicio] += objCli.getMonto();
            }
        }
        return monto;
    }

}
