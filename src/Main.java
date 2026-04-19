import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.criaConta("Bruce Wayne","Conta Corrente", 1234, 987654321);
        Scanner input = new Scanner(System.in);

        String menu =
                """
                --------------------- Operações ---------------------
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Tranferir valor
                4 - Sair
                
                -----------------------------------------------------
                """;
        
        int opcaoMenu;
        do {
            primeiraConta.mostraConta();
            System.out.println(menu);
            System.out.println("Digite a opção desejada: ");
            opcaoMenu = input.nextInt();

            switch (opcaoMenu) {
                case 1:
                    //System.out.println("Seu Saldo: " + saldo);
                    System.out.println("Saldo: " + primeiraConta.getSaldo());
                    break;

                case 2:
                    System.out.println("Valor a receber: ");
                    primeiraConta.depositaDinheiro(input.nextDouble());
                    break;

                case 3:
                    System.out.println("Valor da transferencia: ");
                    primeiraConta.tranfereDinheiro(input.nextDouble());
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