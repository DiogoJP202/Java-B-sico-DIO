public class Metodo{
    public static void main(String[] args){

    }

    public double somar(int num1, int num2){
        // Lógica - Finalidade do método.
        return num1 + num2; // Retorna.
    }

    public void imprimir(String texto){ // "void" indica que o método não terá retorno.
        System.out.println(texto);
    }

    // "throws Exception" indica que o método ao ser utilizado poderá gerar uma exceção

    public double dividir(int dividendo, int divisor) throws Exception {
        return 0;
    }

    // Este método não pode ser visto por outras classes no programa.
    private void metodoPrivado(){}

    public void gravarCliente(String nome, String cpf){}
    // Este método tem a finalidade de gravar informações do cliente, por que não criar um objeto cliente e passar como parâmetro ?
    // public void gravarCliente(Cliente cliente){}
}