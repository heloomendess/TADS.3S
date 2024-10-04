public class Funcionario extends Pessoa implements Financeiro {
    
    public Funcionario(String nome, int i) {
        super(nome, Acessos.completo);
    }

    @Override
    public int getSalario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pagaSalario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
