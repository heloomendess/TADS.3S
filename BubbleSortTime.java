public class BubbleSortTime {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        //Tempo de execução para um valor com 100 = 0
        //Tempo de execução para um valor com 1.000 = 0
        //Tempo de execução para um valor com 10.000 = 0
        //Tempo de execução para um valor com 100.000 = 1
        //Tempo de execução para um valor com 1.000.000 = 16
        int aux;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; i < vetor.length; i++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }

            long fim = System.currentTimeMillis();

            System.out.println("Tempo de execução: " + (fim-inicio));
        }
    }
}
