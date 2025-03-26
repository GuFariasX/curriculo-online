package curso_java;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando e capturando os dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        
        scanner.nextLine(); // Consumir quebra de linha pendente

        System.out.println("Por favor, digite o seu nome completo:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o valor do depósito inicial:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem formatada
        System.out.println("\nOlá " + nomeCliente + 
                ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + 
                ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}