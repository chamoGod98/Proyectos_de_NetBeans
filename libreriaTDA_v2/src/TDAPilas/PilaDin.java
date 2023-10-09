package TDAPilas;

import TDAListas.ListaDin;

public class PilaDin implements Pila {

    private ListaDin pila;

    public PilaDin() {
        pila = new ListaDin();
    }

    public void push(Object dato) {
        pila.adicionar(dato);
    }

    public Object peek() {
        int pos = pila.tamanio() - 1;
        return pila.recuperar(pos);
    }

    public Object pop() {
        int pos = pila.tamanio() - 1;
        Object aux = pila.recuperar(pos);
        pila.eliminar(pos);
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
