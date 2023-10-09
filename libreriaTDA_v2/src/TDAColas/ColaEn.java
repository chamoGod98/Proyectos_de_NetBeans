package TDAColas;

import TDAListas.ListaESimple;

public class ColaEn implements Cola {

    private ListaESimple cola;

    public ColaEn() {
        cola = new ListaESimple();
    }

    public void offer(Object dato) {
        cola.adicionar(dato);
    }

    public Object poll() {
        Object aux = peek();
        cola.eliminar(0);
        return aux;
    }

    public Object peek() {
        return cola.recuperar(0);
    }

    public int tamanio() {
        return cola.tamanio();
    }

    public boolean esVacia() {
        return cola.esVacia();
    }

    public Object recuperar(int pos) {
        return cola.recuperar(pos);
    }
}
