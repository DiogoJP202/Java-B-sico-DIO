public class Condicionais {
    public class CaixaEletronico{
        public static void main(String[] args){
            double saldo = 25;
            double valorSolicitado = 17;

            if(valorSolicitado < saldo)
                saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }
    }

    public class ResultadoEscolar{
        public static void main(String[] args){
            int nota = 6;

            if(nota >= 7)
                System.out.println("Aprovado!");
            else
                System.out.println("Reprovado!");
        }
    }

    // ResultadoEscolar2.java
    public class ResultadoEscolar2{
        public static void main(String[] args){
            int nota = 6;

            if(nota >= 7)
                System.out.println("Aprovado");
            else if (nota >= 5 && nota < 7)
                System.out.println("Recuperação");
            else
                System.out.println("Reprovado");
        }
    }

    public class ResultadoEscolar3{
        public static void main(String[] args){
            int nota = 6;
            String resultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Recuperação!" : "Reprovado!";
            System.out.println(resultado);
        }
    }

    // Condicional Switch / Case
    public class SistemaMedida{
        public static void main(String[] args){
            String sigla = "M";

            switch(sigla){
                case "P":{
                    System.out.println("PEQUENO");
                    break;
                }
                case "M":{
                    System.out.println("MÉDIO");
                    break;
                }
                case "G":{
                    System.out.println("GRANDE");
                    break;
                }
                default:
                    System.out.println("INDEFINIDO");
            }
        }
    }

}
