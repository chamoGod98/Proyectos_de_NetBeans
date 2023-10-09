public class Numero {

    public int valor;

    public String determinarParImparNulo() {
        String respuesta;

        if (valor == 0) {
            respuesta = "Es nulo";
        } else if (valor % 2 == 0) {
            respuesta = "Es par";
        } else {
            respuesta = "Es impar";
        }
        return respuesta;
    }

}
