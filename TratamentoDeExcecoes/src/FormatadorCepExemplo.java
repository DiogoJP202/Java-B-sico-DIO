public class FormatadorCepExemplo{

    public static void main(String[] args){
        try{
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch(CepInvalidoException e){
            System.out.println("O cep corresponde com as regras de negócio.");
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        // Simulando um cep formatado
        return "23.765-064";
    }
}