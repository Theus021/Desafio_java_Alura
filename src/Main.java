import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(messageOptions.message);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo + "\n");
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir ?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência. \n");
                } else {
                    saldo -= valor;
                    System.out.println("\nValor de " + valor + " transferido com sucesso");
                    System.out.println("\nNovo saldo: " + saldo + "\n");
                }
            } else if (opcao == 3) {
                System.out.println("\nValor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("\nValor de " + valor + " recebido com sucesso");
                System.out.println("\nNovo saldo: " + saldo + "\n");
            } else if (opcao > 4) {
                System.out.println("Opção inválida !\n");
            }
        }
        System.out.println("Finalizando operação !");
    }
}