public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila (int Capacidade) {
        super(Capacidade);
    }

    public void enfileira (T elemento) {
        this.adiciona(elemento);
    }

    /*
    Agora que já temos elementos em nossa fila, vamos criar um método para espiar a fila, este método não deve alterar a estrutura da fila somente tem como funcionalidade observar e
    podemos ver que está por exemplo no início da fila.
     */
    public T espiar() {
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileira (T elemento) {
        if(this.estaVazia()) {
            return null;
        }
        final int POS = 0;

        T elementoASerRemovido = this.elementos[POS];
        this.remove(POS);
        return elementoASerRemovido;
    }
}
