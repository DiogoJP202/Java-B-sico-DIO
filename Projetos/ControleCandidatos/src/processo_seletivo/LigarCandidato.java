package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class LigarCandidato {
    public static void main(String[] args) {
        String candidato = "Diogo";
        int tentativasRealizadas = 0;
        boolean continuarTentado = true;
        boolean atendeu = false;

        do{
            atendeu = tentarLigacao();
            continuarTentado = !atendeu;

            if(continuarTentado)
                tentativasRealizadas ++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
        }while (atendeu == false && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA °" + tentativasRealizadas + " TENTATIVA.");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXÍMO DE TENTATIVAS ATINGIDO!");
    }

    static boolean tentarLigacao(){
        return new Random().nextInt(3) == 1;
    }
}
