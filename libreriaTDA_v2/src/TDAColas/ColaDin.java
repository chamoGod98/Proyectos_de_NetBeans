package TDAColas;

import TDAListas.ListaDin;

public class ColaDin implements Cola {

    private ListaDin cola;

    public ColaDin() {
        cola = new ListaDin();
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
