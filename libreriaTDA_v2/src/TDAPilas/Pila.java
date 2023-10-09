package TDAPilas;

public interface Pila {

    boolean esVacia();// es vac�a

    void push(Object dato); //apilar o meter

    Object pop();//desapilar o sacar

    Object peek();//devuelve una referencia al elemento de la cima

    int tamanio(); // cantidad de elementos
    
    Object recuperar(int pos); //obtener posici�n
    
}
