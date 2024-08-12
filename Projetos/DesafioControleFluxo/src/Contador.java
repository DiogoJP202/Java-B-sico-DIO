import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
            e.printStackTrace();
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm < parametroDois){
            System.out.println("Iniciando contagem de " + parametroUm + " até " + parametroDois + ".");
            for(int x = parametroUm; x <= parametroDois; x ++){
                System.out.println("Imprimindo o número " + x);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}