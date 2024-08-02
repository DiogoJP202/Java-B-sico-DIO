public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    public void ligar(){
        ligada = true;
        System.out.println("A TV foi ligada!");
    }

    public void desligar(){
        ligada = false;
        System.out.println("A TV foi desligada!");
    }

    public void aumentarVolume(){
        if(volume == 10) {
            System.out.println("Volume máximo!");
        } else {
            System.out.println("Volume aumentado. Volume atual é de " + (++ volume) + ".");
        }
    }

    public void diminuirVolume(){
        if(volume == 0) {
            System.out.println("Volume mínimo!");
        } else {
            System.out.println("Volume diminíudo. Volume atual é de " + (-- volume) + ".");
        }
    }

    public void proximoCanal(){
        if(canal == 0){
            System.out.println("Último canal alcançado.");
        } else {
            System.out.println("Próximo Canal. Canal atual " + (++ canal) + ".");
        }
    }

    public void voltarCanal(){
        if(canal == 0){
            System.out.println("Fim dos canais anteriores.");
        } else {
            System.out.println("Canal Anterior. Canal atual " + (-- canal) + ".");
        }
    }
}
