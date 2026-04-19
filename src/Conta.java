public class Conta {
    private String usuario;
    private String tipoConta;
    private int  numeroAgencia;
    private int numeroConta;
    private double saldo;

    public String getUsuario() {
        return usuario;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void criaConta(String usuario, String tipoConta,int numeroAgencia, int numeroConta) {
        this.usuario = usuario;
        this.tipoConta = tipoConta;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void mostraConta(){

        System.out.println("\n*****************************************************\n");
        System.out.println("Nome: "+ getUsuario());
        System.out.println("Tipo de Conta: "+ getTipoConta());
        System.out.println("Numero da Agencia: "+ getNumeroAgencia());
        System.out.println("Numero da Conta: "+ getNumeroConta());
        System.out.println("\n*****************************************************");

    }

    public void depositaDinheiro(double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
        System.out.println("Saldo: " + getSaldo());
    }

    public void tranfereDinheiro(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Transferencia realizada com sucesso!");
            System.out.println("Saldo: " + getSaldo());
        }else  {
            System.out.println("Saldo insuficiente");
        }
    }

}
