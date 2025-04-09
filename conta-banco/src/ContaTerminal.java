import java.util.Scanner; // 1. Importa a classe Scanner para ler entrada do teclado

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // 2. Cria o objeto Scanner para capturar o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        
        // 3. Exibe mensagens e captura os dados
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine(); // Usamos nextLine pois é texto

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt(); // Aqui usamos nextInt para número inteiro
        scanner.nextLine(); // Limpa o buffer depois do nextInt

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine(); // nome pode ter espaços

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble(); // valor decimal

        // 4. Exibe a mensagem final com os dados preenchidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
            agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // 5. Fecha o scanner (boa prática)
        scanner.close();
    }
}
