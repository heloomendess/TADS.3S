public class InsertionSortTime {
    public static void main(String[] args) {
        int[] vetor = new int[1000000];
        //Tempo de execução para um valor com 100 = 0
        //Tempo de execução para um valor com 1.000 = 1
        //Tempo de execução para um valor com 10.000 = 42
        //Tempo de execução para um valor com 100.000 = 2659
        //Tempo de execução para um valor com 1.000.000 =
        int aux, j;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        long inicio = System.currentTimeMillis();

        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }

            long fim = System.currentTimeMillis();

            System.out.println("Tempo de execução: " + (fim-inicio));
        }
    }

