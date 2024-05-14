public class Material4Exercicio3 {
    // Estou nomeando a classe de acordo com a organização que estou fazendo em minhas pastas de arquivos.
    // A classe deveria se chamar TV.
    private boolean ligado;
    private int canal;
    private int volume;

    public Material4Exercicio3() {
        this.ligado = false;
        this.canal = 7;
        this.volume = 35;
    }

    public Material4Exercicio3(int canal) {
        this.ligado = true;
        this.canal = canal;
        this.volume = 25;
    }

    public void Ligar() {
        if (this.ligado == true) {
            this.ligado = false;
        } else {
            this.ligado = true;
        }
    }

    public void Aumentar() {
        if (this.volume == 100) {
            System.out.println("O volume já está no máximo.");
        } else {
            this.volume += 1;
            System.out.println("Volume: " + this.volume);
        }
    }

    public void Diminuir() {
        if (this.volume == 0) {
            System.out.println("Já está no mínimo");
        } else {
            this.volume -= 1;
            System.out.println("Volume: " + this.volume);
        }
    }

    public void TrocarCanal(int canal) {
        if ((canal >= 0) && (canal <= 999)) {
            this.canal = canal;
            System.out.println("Canal: " + this.canal);
        } else {
            System.out.println("Canal não encontrado");
        }   
    }

    public void Informacoes () {
        System.out.println("Informações da TV:\nStatus: " + this.ligado + "\nCanal: " + this.canal + "\nVolume: " + this.volume);
    }
}