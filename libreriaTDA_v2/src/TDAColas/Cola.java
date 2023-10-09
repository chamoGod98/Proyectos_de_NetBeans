package TDAColas;

public interface Cola {

    boolean esVacia();// es vacía

    void offer(Object dato); //encolar, insertar elementos

    Object poll();//desencolar o quitar elementos

    Object peek();//devuelve una referencia al primer elemento

    int tamanio(); // cantidad de elementos
    
    Object recuperar(int pos); //obtener posición
    
}
