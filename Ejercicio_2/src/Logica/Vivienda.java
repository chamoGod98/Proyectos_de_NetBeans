package Logica;

public class Vivienda {
    
    private String nombrePropietario;
    private String DNIPropietario;
    private int numPisos;
    private String material;
    private int numMCC;
    private int numMCSC;
    private String tipoP;

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public void setDNIPropietario(String DNIPropietario) {
        this.DNIPropietario = DNIPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public String getDNIPropietario() {
        return DNIPropietario;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumMCC() {
        return numMCC;
    }

    public void setNumMCC(int numMCC) {
        this.numMCC = numMCC;
    }

    public int getNumMCSC() {
        return numMCSC;
    }

    public void setNumMCSC(int numMCSC) {
        this.numMCSC = numMCSC;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }
    
    public float ImpuestoPorTipoMaterial(){ //Subtotal del impuesto según el tipo de material predominante
        float valorVivienda=20000;
        float impuesto=0;
        if (material.equalsIgnoreCase("Cemento")) {
            impuesto=(float) (valorVivienda*0.1);
        } else {
            impuesto=(float) (valorVivienda*0.05);
        }
        impuesto=Float.parseFloat(String.format("%.2f", impuesto));
        return impuesto;
    }
    
    public float ImpuestoPorNumPisos(){ //Subtotal del impuesto según el número de pisos
        float impuesto;
        if (numPisos==1) {
            impuesto=200;
        } else if (numPisos==2) {
            impuesto=250;
        } else if (numPisos>=3) {
            impuesto=320;
        } else {
            impuesto=0;
        }
        impuesto=Float.parseFloat(String.format("%.2f", impuesto));
        return impuesto;
    }
    
    public float ImpuestoPorNumMetCuadConstruidos(){ //Subtotal del impuesto según el número de metros cuadrados oonstruidos
        float impuesto;
        if (numMCC>=1) {
            impuesto=numMCC*1;
        } else {
            impuesto=0;
        }
        impuesto=Float.parseFloat(String.format("%.2f", impuesto));
        return impuesto;
    }
    
    public float ImpuestoPorNumMetCuadSinConstruir(){ //Subtotal del impuesto según el número de metros cuadrados sin construir
        float impuesto;
        if (numMCSC>0) {
            impuesto=(float) (numMCSC*0.5);
        } else {
            impuesto=0;
        }
        impuesto=Float.parseFloat(String.format("%.2f", impuesto));
        return impuesto;
    }
    
    public float ImpuestoTotalYPorTipoPropietario(){ //Subtotal del impuesto según los tipos de propietarios del inmueble
        float impuesto=0;
        if (tipoP.equalsIgnoreCase("Jubilados")) {
            impuesto=(float) ((ImpuestoPorTipoMaterial()+ImpuestoPorNumPisos()+ImpuestoPorNumMetCuadConstruidos()+ImpuestoPorNumMetCuadSinConstruir())*0.5);
        } else {
            impuesto=(ImpuestoPorTipoMaterial()+ImpuestoPorNumPisos()+ImpuestoPorNumMetCuadConstruidos()+ImpuestoPorNumMetCuadSinConstruir());
        }
        impuesto=Float.parseFloat(String.format("%.2f", impuesto));
        return impuesto;
    }
}
