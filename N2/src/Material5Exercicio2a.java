public class Material5Exercicio2a extends Material5Exercicio2{
    // Por questão de organização dos arquivos em minha pasta de estudo coloquei a classe com o nome a baixo,
    // porém o nome da classe deveria ser "Tablet".

    public int volume = 0;

    public void aumentarVolume() {
        if (this.volume < 10) {
            this.volume += 1;   
        } else {
            System.out.println("O volume já está no máximo.");
        }
    }

    public void diminuirVolume() {
        if (this.volume > 0) {
            this.volume -= 1;   
        }  else {
            System.out.println("O volume já está no mínimo.");
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public Material5Exercicio2a() {

    }

    public Material5Exercicio2a(boolean ligado, int volume) {
        super(ligado);
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        } else {
            throw new IllegalArgumentException("Volume fora do intervalo permitido. Não foi possível instanciar o objeto.");
        }
    }
}