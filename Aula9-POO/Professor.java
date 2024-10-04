public class Professor extends Pessoa implements Financeiro{
    private int cargaHoraria;
    private final int VALOR_POR_HORA = 200;

    public Professor(String nome, int cargaHoraria) {
        super(nome, Acessos.completo);
        this.setCargaHoraria(cargaHoraria);
    }


    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public int getSalario() {
        return cargaHoraria * VALOR_POR_HORA * 4;
    }

    @Override
    public void pagaSalario() {
        System.out.println(getNome() + " recebe R$ " + getSalario());
    }
}
