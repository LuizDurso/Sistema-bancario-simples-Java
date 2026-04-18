import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome = "Bruce Wayne";
        String tipoConta = "Conta Corrente";
        double saldo = 6000.00;
        int opcaoMenu;

        Scanner input = new Scanner(System.in);

        System.out.println("\n****************************************************\n");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n****************************************************");

        do {
            System.out.println("\nOperações");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Tranferir valor");
            System.out.println("4 - Sair");

            System.out.println("\nDigite a opção desejada: ");
            opcaoMenu = input.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Seu Saldo: " + saldo);
                    break;
                case 2:
                    System.out.println("Valor a receber: ");
                    double receberDinheiro = input.nextDouble();
                    saldo += receberDinheiro;
                    System.out.println("Transferencia recebida com sucesso!");
                    System.out.println("Valor da recebido: " + receberDinheiro);
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 3:
                        System.out.println("Valor da transferencia: ");
                        double transferirDinheiro = input.nextDouble();
                    if (transferirDinheiro > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else if (saldo <= 0) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= transferirDinheiro;
                        System.out.println("Transferencia realizada com sucesso!");
                        System.out.println("Valor da transferencia: " + transferirDinheiro);
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saindo do sistema!");
                    break;

                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        } while (opcaoMenu != 4);
    }
}