public class Aula2 {
    public static <ContaBancaria> void main(String[] args) {

        //exercicio: criar metodo fazAniversário()

        //ambiente de testes para as classes que estamos estudando

        //PARTE 1 DA AULA (PESSOAS)
        Pessoa p1 = new Pessoa("Heloisa", "Mendes", 19);

        Pessoa p2 = new Pessoa("José", "Figueredo", 23);
        //p2.setNome("José");
        //p2.setSobrenome("Figueredo");
        //p2.idade = 23;
        //p2.setIdade(23);

        Pessoa p3 = new Pessoa("Angela", "Georgia", 34);

        Pessoa p4 = new Pessoa("Jucelino", "Martines", 47);

        p1.dados();
        p2.dados();
        p3.dados();
        p4.dados();

        //PARTE 2 (CONTA BANCARIA)
        ContaBancaria c1 = new ContaBancaria("Luiz", "CC", 123, 1334);
        c1.depositar(1000);
        c1.sacar(50);
        System.out.println(ContaBancaria);
    }
}
