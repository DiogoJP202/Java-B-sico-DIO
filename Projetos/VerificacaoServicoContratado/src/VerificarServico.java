import java.util.Objects;
import java.util.Scanner;

public class VerificarServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o serviço que você verificar: ");
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        System.out.println("Insira o nome do cliente seguido por todos os serviços contratados: ");
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        scanner.close();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // TODO: Verifique se o serviço está na lista de serviços contratados

        for(int index = 1; index <= (partes.length - 1); index++){
            if(Objects.equals(partes[index], servico)) {
                contratado = true;
                break;
            }
        }

        if(contratado)
            System.out.println("Sim");
        else
            System.out.println("Nao");
    }
}