public class ContandoCarneirosFor {
    public static void main(String[] args){
        for(int carneirinhos = 0; carneirinhos <= 20; carneirinhos ++){
            System.out.println(carneirinhos + (carneirinhos <= 1 ? " carneirinho pulou a cerca." : " carneirinhos pularam a cerca."));
        }
        System.out.println("Todos os carneirinhos pularam a cerca.");
    }
}
