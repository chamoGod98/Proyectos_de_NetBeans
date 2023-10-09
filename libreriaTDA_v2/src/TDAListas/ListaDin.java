package TDAListas;

public class ListaDin implements Lista {

    private Object elem[];
    private int tamanio;    //tamaño de la lista que contiene datos
    private int max;        //Capacidad o longitud máxima de la lista

    public ListaDin() {
        tamanio = 0;
        max = 0;
        elem = null;
    }

    private void redimensionar() {
        Object aux[];
        max += 10;  //Factor de crecimiento
        aux = new Object[max];
        for (int i = 0; i < tamanio; i++) {
            aux[i] = elem[i];
        }
        elem = aux;
    }

    @Override
    public int tamanio() {
        return tamanio;
    }

    @Override
    public void adicionar(Object dato) {
        if (tamanio == max) {
            redimensionar();
        }
        tamanio++;
        elem[tamanio - 1] = dato;
    }

    @Override
    public void insertar(Object dato, int pos) {
        if (pos >= 0 && pos <= tamanio) {
            if (tamanio == max) {
                redimensionar();
            }
            tamanio++;
            for (int i = tamanio - 1; i > pos; i--) {
                elem[i] = elem[i - 1];
            }
            elem[pos] = dato;
        }
    }

    @Override
    public void modificar(Object dato, int pos) {
        if (pos < 0 || pos >= tamanio) {
            pos = 0;
        }
        elem[pos] = dato;
    }

    @Override
    public void eliminar(int pos) {
        if (pos >= 0 && pos < tamanio) {
            for (int i = pos; i < tamanio - 1; i++) {
                elem[i] = elem[i + 1];
            }
            tamanio--;
        }
    }

    @Override
    public Object recuperar(int pos) {
        if (pos < 0 || pos >= tamanio) {
            pos = 0;
        }
        return elem[pos];
    }

    @Override
    public int buscar(Object dato) {
        int encontrado = -1;
        for (int i = 0; i < tamanio && encontrado == -1; i++) {
            if (elem[i].equals(dato)) {
                encontrado = i;
            }
        }
        return encontrado;
    }

    
    @Override
    public int longitudMax() {
        return max;
    } 

    @Override
    public boolean esVacia() {
        return tamanio == 0;
    }
    
}
