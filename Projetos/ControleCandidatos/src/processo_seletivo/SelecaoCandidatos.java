package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class SelecaoCandidatos {
    public static void main(String[] args){
        String[] candidatos = {"Diogo", "Felipe", "Daniel", "Will", "Rodrigo", "Fernando", "Adilson", "Robson", "Silvio"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;

        while(candidatosSelecionados < 5){
            if(candidatoAtual > (candidatos.length - 1)){
                System.out.println("A lista de canditados chegou ao fim! A quantidade de candidatos selecionados foi de " + candidatosSelecionados);

                break;
            }

            double salarioPretendido = gerarSalario();

            System.out.println("O candidato " + candidatos[candidatoAtual] + " solicitou o seguinte valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidatos[candidatoAtual] + " foi selecionado para vaga.");
                candidatosSelecionados ++;
                candidatoAtual ++;
            } else {
                System.out.println("O candidato " + candidatos[candidatoAtual] + " não foi selecionado para vaga.");
                candidatoAtual ++;
            }
        }
    }

    static double gerarSalario(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;
        if(salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO.");
        else if (salarioBase == salarioPretendido)
            System.out.println("LINGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS.");
    }
}
