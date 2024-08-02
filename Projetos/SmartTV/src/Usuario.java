public class Usuario {
    public static void main(String[] args){
        SmartTV smartTV = new SmartTV();

        System.out.println("A TV está " + (smartTV.ligada ? "ligada" : "desligada") + ".");
        System.out.println("O volume está em " + smartTV.volume + ".");
        System.out.println("A TV está no canal " + smartTV.canal + ".");

        smartTV.ligar();
        smartTV.desligar();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.proximoCanal();
        smartTV.voltarCanal();
        smartTV.proximoCanal();
        smartTV.proximoCanal();
        smartTV.voltarCanal();
        smartTV.voltarCanal();
    }
}
