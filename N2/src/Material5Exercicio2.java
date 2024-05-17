public class Material5Exercicio2 {
    // Por questão de organização dos arquivos em minha pasta de estudo coloquei a classe com o nome a baixo,
    // porém o nome da classe deveria ser "Eletronico".

    boolean ligado = false;

    public void ligar() {
        if(!this.ligado) {
            this.ligado = true;
        } else {
            System.out.println("O aparelho já está ligado.");
        }
    }

    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
        } else {
            System.out.println("O aparelho já está desligado.");
        }
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public Material5Exercicio2() {

    }

    public Material5Exercicio2(boolean ligado) {
        this.ligado = ligado;
    }
}