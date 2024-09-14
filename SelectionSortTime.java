public class SelectionSortTime {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        //Tempo de execução para um valor com 100 = 236878
        //Tempo de execução para um valor com 1.000 =
        //Tempo de execução para um valor com 10.000 =
        //Tempo de execução para um valor com 100.000 =
        //Tempo de execução para um valor com 1.000.000

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        long inicio = System.currentTimeMillis();

        int menor_posicao, aux;

        for (int i = 0; i < vetor.length; i++) {
            menor_posicao = i;

            for (int j = i + 1; j < vetor.length; i++) {
                if (vetor[j] < vetor[menor_posicao]) {
                    menor_posicao = j;
                }
            }
            aux = vetor[menor_posicao];
            vetor[menor_posicao] = vetor[i];
            vetor[i] = aux;
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (fim-inicio));
    }
}
