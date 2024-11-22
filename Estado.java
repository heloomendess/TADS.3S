public class Estado {
    private String nome;
    private int titulos;
    private int viceTitulos;
    private int terceirosLugares;

    public Estado(String nome, int titulos, int viceTitulos, int terceirosLugares) {
        this.nome = nome;
        this.titulos = titulos;
        this.viceTitulos = viceTitulos;
        this.terceirosLugares = terceirosLugares;
    }

    public String getNome() {
        return nome;
    }

    public int getTitulos() {
        return titulos;
    }

    public int getViceTitulos() {
        return viceTitulos;
    }

    public int getTerceirosLugares() {
        return terceirosLugares;
    }

    // exibir o estado e seus dados
    public void exibir() {
        System.out.println(nome + ": " + titulos + " títulos, "
                + viceTitulos + " vice-títulos, "
                + terceirosLugares + " terceiros lugares");
    }
}
