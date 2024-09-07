

public class TestePilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.topo());

        pilha.adiciona(2);
        pilha.adiciona(6);
        pilha.adiciona(9);

        System.out.println(pilha.topo());

        System.out.println("Desempilhar elemento " + pilha.desempilhar());
        System.out.println(pilha);

    }
}
