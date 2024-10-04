public class Pessoa {
    
    enum Acessos {
        areasDeEnsino,
        areasAdministrativas,
        completo
    }

    private String nome;
    private Acessos acesso;

    public Pessoa(String nome, Pessoa.Acessos acesso) {
        this.nome = nome;
        this.acesso = acesso;
    }

    public void verificaAcesso() {
        System.out.println(nome + "tem acesso a " + this.acesso);

    }

    public String getNome() {
        return nome;
    }

    
}
