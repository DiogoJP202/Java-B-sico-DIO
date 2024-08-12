package candidatura;

public class ImprimirSelecionados {
    public static void main(String[] args){
        String[] candidatos = {"Diogo", "Felipe", "Daniel", "Will"};

        System.out.println("Imprimindo a lista de candidatos com a Forma 1:");

        // Forma 1
        for( int indice = 0; indice <= (candidatos.length -1); indice ++)
            System.out.println("O candidato n°" + (indice + 1) + " é o " + candidatos[indice] + ".");

        System.out.println("Imprimindo a lista de candidatos com a Forma 2:");

        // Forma 2
        for(String candidato : candidatos)
            System.out.println("O candidato selecionado foi " + candidato + ".");
    }
}
