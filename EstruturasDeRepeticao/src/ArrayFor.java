public class ArrayFor{
    public static void main(String[] args){
        String[] alunos = {"Diogo", "Felipe", "Daniel", "Will"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é "+ alunos[x]);
        }
    }
}