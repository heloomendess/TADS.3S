public class Aluno extends Pessoa {
    
    private enum Avaliacao {
        aprovado,
        reprovado,
        naoAvaliado
    }

    private Avaliacao status = Avaliacao.naoAvaliado;

    private double nota = -1.0;

    public Aluno(String nome) {
        super(nome, Acessos.areasDeEnsino);
    }

    public void setNota(double nota) {
        if(nota < 6.0) {
            this.status = Avaliacao.reprovado;
        } else {
            this.status = Avaliacao.aprovado;
        }

        this.nota = nota;
    }

    public void mostraStatus() {
        System.out.println(getNome() + " está " + this.status);
    }
}
