import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        var conta = new Conta();
        
        System.out.println("Por favor, digite o a agência:");
        conta.setAgencia(sc.nextLine());
        
        System.out.println("Por favor, digite o nome do cliente:");
        conta.setNomeCliente(sc.nextLine());

        System.out.println("Por favor, digite o número:");
        conta.setNumero(sc.nextInt());

        System.out.println("Por favor, digite o saldo:");
        conta.setSaldo(sc.nextBigDecimal());

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta " +
                            "em nosso banco, sua agência é " + conta.getAgencia() + ", conta "
                            + conta.getNumero() + " e seu saldo R$" + conta.getSaldo() +
                            " já está disponível para saque.");

        sc.close();
    }

    
}
