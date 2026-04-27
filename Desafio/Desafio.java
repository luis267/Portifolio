import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Frodo Bolseiro";
        String tipoDaConta = "Poupança";
        double balanco = 1599.99;

        System.out.println("***********************************************************************************");
        System.out.println("\n Nome do cliente : " + nome);
        System.out.println("\n Tipo da conta : " + tipoDaConta);
        System.out.println("\n Balanço da conta : " + balanco);
        System.out.println("\n ***********************************************************************************");

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMenu");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Verificar Balanço");
            System.out.println("0 - Sair");

            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    balanco += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 2:
                    System.out.print("\nDigite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= balanco) {
                        balanco -= valorSaque;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("\nO balanço atual é: " + balanco);
                    break;

                case 0:
                    System.out.println("\nObrigado por usar nosso serviço!");
                    break;

                default:
                    System.out.println("\nOpção inválida.");
            }
        }

        scanner.close();
    }
}