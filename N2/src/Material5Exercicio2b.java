public class Material5Exercicio2b extends Material5Exercicio2{
    // Por questão de organização dos arquivos em minha pasta de estudo coloquei a classe com o nome a baixo,
    // porém o nome da classe deveria ser "Radio".

    public boolean tocandoMusica = false;

    public void tocarMusica() {
        if (!this.tocandoMusica) {
            this.tocandoMusica = true;
        } else {
            System.out.println("O rádio já está tocando música.");
        }
    }

    public void pararMusica() {
        if (this.tocandoMusica) {
            this.tocandoMusica = false;
        } else {
            System.out.println("O rádio não está tocando música.");
        }
    }

    public Material5Exercicio2b() {

    }

    public Material5Exercicio2b(boolean ligado, boolean tocandoMusica) {
        super(ligado);
        if (ligado == false && tocandoMusica == true) {
            throw new IllegalArgumentException("Não é possível tocar música com o rádio desligado.");
        } else {
            this.tocandoMusica = tocandoMusica;
        }
    }
}
