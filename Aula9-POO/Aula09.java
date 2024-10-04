public class Aula09 {

    public static void main(String[] args) {
        
        //Area de controle de portaria
        Pessoa p1 = new Aluno("Joao");
        p1.verificaAcesso();
        Pessoa p2 = new Aluno("Maria");
        p2.verificaAcesso();
        Pessoa p3 = new Visitante("José");
        p3.verificaAcesso();
        Pessoa p4 = new Professor("Luiz");
        p4.verificaAcesso();
        Pessoa p5 = new Funcionario("Gabriel", 5000);
        p5.verificaAcesso();

        //Area de Avaliacao
        Aluno a1 = (Aluno) p1;
        a1.mostraStatus();
        a1.setNota(5.0);
        a1.mostraStatus();

        Aluno a2 = (Aluno) p2;
        a2.mostraStatus();
        a2.setNota(9.0);
        a2.mostraStatus();

        // Casting = mudar o acesso de uma variavel
        
        //Area do Financeiro
        Financeiro f1 = (Financeiro) p4;
        f1.pagaSalario();
        
        Financeiro f2 = (Financeiro) p5;
        f2.pagaSalario();

    }
}