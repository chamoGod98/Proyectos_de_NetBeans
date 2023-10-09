package TDAListas;

public interface Lista {

    void adicionar(Object dato);
    void insertar(Object dato, int pos);
    void modificar(Object dato, int pos);
    void eliminar(int pos);
    Object recuperar(int pos);
    int tamanio();
    int buscar(Object dato);
    boolean esVacia();
    int longitudMax();

}
