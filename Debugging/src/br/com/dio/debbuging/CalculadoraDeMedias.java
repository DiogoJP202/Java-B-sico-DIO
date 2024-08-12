package br.com.dio.debbuging;

import java.util.Scanner;
import java.util.Locale;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        String[] alunos = {"Diogo", "Felipe", "Daniel", "Will"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);
    }
    static double calculaMediaDaTurma(String[] alunos, Scanner scan){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scan.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
