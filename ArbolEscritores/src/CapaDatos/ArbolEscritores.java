package CapaDatos;

import CapaNegocio.cmpEscritorCodigo;
import CapaNegocio.Escritor;
import TArboles.*;
import javax.swing.JOptionPane;

public class ArbolEscritores {

    private static TArbolBB objetos = new TArbolBB(new cmpEscritorCodigo());

    public static void Adicionar(Escritor info) {
        objetos.Adicionar(info);
    }

    public static TArbolBB obtener() {
        return objetos;
    }

    public void InOrden(TArbolBin A) {
        if (A.getRaiz() == null) {
            return;
        } else {
            Escritor objEscritor = (Escritor) A.ObtenerDato();
            InOrden(A.Izq());
            JOptionPane.showMessageDialog(null, objEscritor.getNombre() + " " + objEscritor.getCodEscritor(), "Mensaje", JOptionPane.OK_OPTION);
            InOrden(A.Der());
        }
    }

    public void PreOrden(TArbolBin A) {
        if (A.getRaiz() == null) {
            return;
        } else {
            Escritor objEscritor = (Escritor) A.ObtenerDato();
            JOptionPane.showMessageDialog(null, objEscritor.getNombre() + " " + objEscritor.getCodEscritor(), "Mensaje", JOptionPane.OK_OPTION);
            PreOrden(A.Izq());
            PreOrden(A.Der());
        }
    }

    public void PostOrden(TArbolBin A) {
        if (A.getRaiz() == null) {
            return;
        } else {
            Escritor objEscritor = (Escritor) A.ObtenerDato();
            PostOrden(A.Izq());
            PostOrden(A.Der());
            JOptionPane.showMessageDialog(null, objEscritor.getNombre() + " " + objEscritor.getCodEscritor(), "Mensaje", JOptionPane.OK_OPTION);
        }
    }
}
