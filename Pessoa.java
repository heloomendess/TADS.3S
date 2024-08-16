
public class Pessoa {

    //classes
    private String nome;
    private String sobrenome;
    private int idade;

    Pessoa(String nome, String sobrenome, int idade) {
        System.out.println("Criando pessoa");

        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }
    //get
    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public int getIdade() {
        return this.idade;
    }

    //set
    public void setIdade(int i) {
        if (i <= 0) {
            this.idade = 0;
        } else if (i >= 100) {
            this.idade = 100;
        } else {
            this.idade = i;
        }
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setSobrenome(String s) {
        this.sobrenome = s;
    }

    //dados
    public void dados() {
        System.out.println(getNome() + " " +
                            getSobrenome() + ", " +
                            getIdade() + " anos de idade");
    }

}
