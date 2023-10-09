package TDAListas;

public class ListaESimple implements Lista {

    private Nodo inicio;// Puntero cabecera o inicio de  lista.
    private int tamanio;// Variable para registrar el tamaño de la lista.

    /**
     * Constructor por defecto.
     */
    public void ListaESimple() {
        inicio = null;
        tamanio = 0;
    }

    @Override
    public boolean esVacia() {
        return inicio == null;
    }

    @Override
    public void adicionar(Object dato) {
        Nodo nuevo = new Nodo();// Define un nuevo nodo.
        nuevo.setValor(dato);// Agrega al valor al nodo.

        if (esVacia()) {  // Consulta si la lista está vacia.
            inicio = nuevo;// Inicializa la lista agregando como inicio al nuevo nodo.
        } else {// Caso contrario recorre la lista hasta llegar al último nodo y agrega el nuevo.
            Nodo aux = inicio;// Crea ua copia de la lista.
            while (aux.getSiguiente() != null) {// Recorre la lista hasta llegar al último nodo.
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);// Agrega el nuevo nodo al final de la lista.
        }
        tamanio++; // Incrementa el contador de tamaño de la lista
    }

    @Override
    public void insertar(Object dato, int pos) {

        if (pos >= 0 && pos <= tamanio) { // Verifica si la posición ingresada se encuentre en el rango 
            //>= 0 y <= que el numero de elementos del la lista.
            Nodo nuevo = new Nodo();
            nuevo.setValor(dato);
            if (pos == 0) {// Consulta si el nuevo nodo a ingresar va al inicio de la lista.
                nuevo.setSiguiente(inicio);// Inserta el nuevo nodo al inicio de la lista.
                inicio = nuevo;
            } else {
                if (pos == tamanio) {// Si el nodo a inserta va al final de la lista.
                    Nodo aux = inicio;
                    while (aux.getSiguiente() != null) {// Recorre la lista hasta llegar al último nodo.
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo); // Inserta el nuevo nodo después de del último.
                } else {
                    Nodo aux = inicio;// Si el nodo a insertar va en el medio de la lista.
                    for (int i = 0; i < (pos - 1); i++) {// Recorre la lista hasta llegar al nodo anterior
                        aux = aux.getSiguiente();        // a la posición en la cual se insertará el nuevo nodo.
                    }
                    Nodo siguiente = aux.getSiguiente();// Guarda el nodo siguiente al nodo en la posición 
                    //en la cual va a insertar el nuevo nodo.
                    aux.setSiguiente(nuevo); // Inserta el nuevo nodo en la posición indicada.
                    nuevo.setSiguiente(siguiente);// Une el nuevo nodo con el resto de la lista.
                }
            }
            tamanio++; // Incrementa el contador de tamaño de la lista.
        }
    }

    @Override
    public void modificar(Object dato, int pos) {
        if (pos >= 0 && pos < tamanio) {// Verifica si la posición ingresada se encuentre en el rango
            // >= 0 y < que el numero de elementos del la lista.
            if (pos == 0) {// Consulta si el nodo a eliminar es el primero.
                inicio.setValor(dato);// Actualiza el valor del primer nodo.
            } else {
                Nodo aux = inicio;// En caso que el nodo a eliminar este por el medio o sea el ultimo
                for (int i = 0; i < pos; i++) {// Recorre la lista hasta lleger al nodo anterior al eliminar.
                    aux = aux.getSiguiente();
                }
                aux.setValor(dato);// Actualiza el valor del nodo.
            }
        }
    }

    @Override
    public void eliminar(int pos) {

        if (pos >= 0 && pos < tamanio) {// Verifica si la posición ingresada se encuentre en el rango 
            //>= 0 y < que el número de elementos del la lista.
            if (pos == 0) {// Consulta si el nodo a eliminar es el primero
                inicio = inicio.getSiguiente();// Elimina el primer nodo apuntando al siguinte.
            } else {// En caso que el nodo a eliminar este por el medio o sea el último
                Nodo aux = inicio;// Crea una copia de la lista.
                for (int i = 0; i < pos - 1; i++) {// Recorre la lista hasta llegar al nodo anterior al eliminar.
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();// Guarda el nodo siguiente al nodo a eliminar.
                aux.setSiguiente(siguiente.getSiguiente());// Elimina la referencia del nodo apuntando al nodo siguiente.
            }
            tamanio--;// Disminuye el contador de tamaño de la lista.
        }
    }

    @Override
    public Object recuperar(int pos) {

        if (pos == 0) {// Consulta si la posicion es el inicio de la lista.
            return inicio.getValor();// Retorna el valor del inicio de la lista.
        } else {
            Nodo aux = inicio;// Crea una copia de la lista.
            for (int i = 0; i < pos; i++) {// Recorre la lista hasta la posición ingresada.
                aux = aux.getSiguiente();
            }
            return aux.getValor();// Retorna el valor del nodo.
        }

    }

    @Override
    public int tamanio() {
        return tamanio;
    }

    @Override
    public int buscar(Object dato) {

        Nodo aux = inicio;// Crea una copia de la lista.
        int encontrado = -1;// Bandera para indicar si el valor existe.
        while (aux != null && encontrado != 1) {// Recorre la lista hasta encontrar el elemento o hasta
            // llegar al final de la lista.
            if (dato.equals(aux.getValor())) {// Consulta si el valor del nodo es igual al de referencia.
                encontrado = 1;// Canbia el valor de la bandera.
            } else {
                aux = aux.getSiguiente();// Avanza al siguiente. nodo.
            }
        }
        return encontrado;// Retorna el resultado de la bandera.
    }

    @Override
    public int longitudMax() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
