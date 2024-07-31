import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // ATRIBUIÇÃO
        String nome = "DIOGO";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M'; // O valor de char precisa ser declarado com aspas simples.
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // ARITMÉTICOS
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // CONCATENAÇÃO
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        // Qual o resultado das expressões abaixo?
        String concatenacao = "?";

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        // UNÁRIO
        int numero = 5;

        numero = - numero;
        System.out.println(numero); // -5

        numero = numero * -1;
        System.out.println(numero); // 5

        numero = numero + 1;
        System.out.println(numero); // 6

        numero ++;
        System.out.println(numero); // 7

        System.out.println(numero ++); // 7, ele imprime o valor e depois faz o incremento.
        System.out.println(numero); // 8

        System.out.println(++ numero); // 9


        System.out.println(numero --); // 9, ele imprime o valor e depois faz o decremento.
        System.out.println(numero); // 8

        System.out.println(-- numero); // 7

        boolean variavel = true;

        System.out.println(!variavel); // false

        // TERNÁRIO

        int a, b;

        a = 5;
        b = 6;

        /* Exemplo de condicional utilizando uma estrutura if/else
        String result;

        if(a==b)
            result = "verdadeiro";
        else
            result = "falso";
        */

        // Mesma condicional, porém utilizando o operado ternário.

        String result = a == b ? "verdadeiro" : "falso";
        System.out.println(result);

        // RELACIONAL

        int numero1 = 1;
        int numero2 = 2;
        boolean condicao = numero1 > numero2;

        System.out.println("Número 1 é maior do que o Número 2 ? " + (condicao ? "Sim!" : "Não!"));

        // LÓGICA

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras.");
        } else if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira.");
        } else {
            System.out.println("Nenhuma condição é verdadeira.");
        }
    }
}