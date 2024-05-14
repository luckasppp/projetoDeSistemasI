public class Material4Exercicio2 {
    // Estou nomeando a classe de acordo com a organização que estou fazendo em minhas pastas de arquivos.
    // A classe deveria se chamar "Lampada".

    int code = 0;
    int volts = 120;
    String marca = "Iluminos";
    boolean status = false ;

    public Material4Exercicio2(int code) {
        this.code = code;
    }

    public void LigarDesligar() {
        if (this.status == false) {
            this.status = true;
            System.out.println("Lâmpada " + this.code + " acesa!\n");
        } else {
            this.status = false;
            System.out.println("Lâmpada " + this.code + " apagada!\n");
        }
    }

    public void StatusLampada () {
        if (this.status == true) {
            System.out.println("A lâmpada " + this.code + " está acesa!\n");
        } else {
            System.out.println("A lâmpada " + this.code + " está apagada!\n");
        }
    }
}