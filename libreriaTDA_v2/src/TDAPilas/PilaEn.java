package TDAPilas;

import TDAListas.ListaESimple;

public class PilaEn implements Pila {

    private ListaESimple pila;

    public PilaEn() {
        pila = new ListaESimple();
    }

    public void push(Object dato) {
        pila.insertar(dato, 0);
    }

    public Object peek() {
        return pila.recuperar(0);
    }

    public Object pop() {
        Object aux = peek();
        pila.eliminar(0);
        return aux;
    }

    public int tamanio() {
        return pila.tamanio();
    }

    public boolean esVacia() {
        return pila.esVacia();
    }

    public Object recuperar(int pos) {
        return pila.recuperar(pos);
    }

}
