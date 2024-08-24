package projeto_revisao_ed;

import java.util.ArrayList;
public class Teste {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Elemento A");
        arrayList.add("Elemento C");

        System.out.println(arrayList);

        arrayList.add("Elemento B");

        System.out.println(arrayList);

        System.out.println("Tamanho do vetor: " + arrayList.size());

    }
}

//Fazer pesquisa sobre metodos arrayList