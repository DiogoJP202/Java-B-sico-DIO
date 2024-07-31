//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TIPOS DE DADOS
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // Se começar com zero, talvez int não seja o tipo ideal para esse valor.
        long cpf = 98765432109L; // Precisamos colocar o L no final do número quando o tipo é long.
        float pi = 3.14F; // O mesmo acontece com o float, só que com F no final.
        double salario = 1275.33;

        System.out.println("idade: " + idade + " " + "ano: " + ano + " " + "cep: " + cep + " " + "cpf: " + cpf + " " + "pi: " + pi + " " + "salário: " + salario);

        // TIPOS DE VARIÁVEIS
        int numero = 5;
        numero = 10;
        System.out.println(numero); // Irá printar a variável "numero".

        final double VALOR_DE_PI = 3.14;
        // Irá ocorrer um erro na proxíma linha.
        // VALOR_DE_PI = 3.15;
    }
}