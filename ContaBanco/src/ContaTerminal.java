import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        // Solicitando os dados ao usuário
        try ( // Inicializando o Scanner com Locale
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            // Solicitando os dados ao usuário
            System.out.println("Por favor, digite o número da Conta:");
            numero = scanner.nextInt();
            // Consumir a quebra de linha após nextInt()
            scanner.nextLine();
            System.out.println("Por favor, digite o número da Agência:");
            agencia = scanner.nextLine();
            System.out.println("Por favor, digite o nome do Cliente:");
            nomeCliente = scanner.nextLine();
            System.out.println("Por favor, digite o saldo inicial:");
            saldo = scanner.nextDouble();
            // Fechando o Scanner
        }

        // Exibindo a mensagem de confirmação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}
