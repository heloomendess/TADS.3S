/*
    -Exercicio

    * Fazer saldo inicial da CC: 50.00
                             CP: 70.00

    * Criar método sacar() e depositar()
    * Incluir verificação se é positivo ou negativo e se tem dinheiro

    * Ambiente de testagem na classe main
    * Criar conta, fazer um deposito, um saque e ver se o saldo está correto
     */

public class ContaBancaria {

    private String titular;
    private double saldo;
    private String cpf;
    private String tipo; //CC ou CP
    private int agencia;
    private int numeroDaConta;

    public ContaBancaria(double saldo, String titular, String tipo, String cpf, int agencia, int numeroDaConta) {
        this.titular = titular;
        this.tipo = tipo;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;

        if (tipo .equals("CC")) {
            setSaldo(50.00);
        } else {
            setSaldo(70.00);
        }
    }

    public ContaBancaria(String helo, String polpança, int i, int agencia, int numeroDaConta) {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void sacar(double quantidade) {
        if(quantidade > 0.0) {
            setSaldo(getSaldo()- quantidade);
        } else {
            System.out.println("Valor inválido");
        }

    }

    }
    public void depositar(double quantidade) {
        if (quantidade > 0.0) {
            setSaldo(getSaldo() + quantidade);
        } else {
            System.out.println("Valor inválido");
        }
}
