import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 1000;

        System.out.println("Olá! Seja bem vindo/a ao seu Banco-Terminal!");
        System.out.println("Por favor, insira o seu nome:");
        nomeCliente = scanner.next();

        System.out.println("Insira o número da sua agência:");
        agencia = scanner.next();

        System.out.println("Insira o número da sua conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
