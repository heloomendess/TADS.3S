public class Projeto_Revisao_ED {

    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("Elemento 0");
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");
        vetor.adiciona("Elemento 5");
        vetor.adiciona("Elemento 6");
        vetor.adiciona("Elemento 7");

        //vetor.removeConteudo( "Elemento 2");
       // System.out.println(vetor.removeConteudo( "Elemento 2"));

        System.out.println("A quantidade de valores no vetor é " + vetor.tamanho());
        System.out.println("Dados do vetor: " + vetor.toString());


        vetor.remove(3);

        System.out.println("A quantidade de informacoes no vetor e: " + vetor.tamanho());
        System.out.println("Dados do Vetor: " + vetor.toString());
        System.out.println("Informacao na posicao 1:  " + vetor.busca(1));
        System.out.println("Buscar o endereco da informacao Elemento 0:  " + vetor.busca1("Elemento 1"));
        vetor.adicionaInicio(0, "Elemento 0");
        System.out.println("A quantidade de informacoes no vetor e: " + vetor.tamanho());
        System.out.println("Dados do Vetor: " + vetor.toString());
        System.out.println("Informacao na posicao 1:  " + vetor.busca(1));
    }
}