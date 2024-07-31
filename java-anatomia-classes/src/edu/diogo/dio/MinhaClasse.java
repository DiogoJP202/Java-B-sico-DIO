package edu.diogo.dio;

public class MinhaClasse {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        String meuNome = "Diogo";
        int anoFabricacao = 2022;
        boolean verdadeira = true;

        String primeiroNome = "Diogo";
        String segundoNome = "Antonny";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome).concat(".");
    }
}
