
public class TesteFila {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<Integer>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        //Verifica se a fila está vazia, nesse caso será false
        System.out.println("A fila está vazia? " + fila.estaVazia());

        //Verifica o tamanho da fila
        System.out.println("Qual é o tamanho da fila? " + fila.tamanho());

        //Visualiza os elementos da fila
        System.out.println(fila.toString());

        System.out.println(fila.espiar());

        if(fila.espiar() == null) {
            System.out.println("Ninguem na fila");
        } else {
            System.out.println("O elemento da primeira posição é: " + fila.espiar());
        }


    }
}
