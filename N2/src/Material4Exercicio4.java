public class Material4Exercicio4 {
    // Estou nomeando a classe de acordo com a organização que estou fazendo em minhas pastas de arquivos.
    // A classe deveria se chamar Caminhao.
    private String combustivel = "gasolina";
    private int velocidade = 0;

    public void setGasolina (String combustivel) {
        if (combustivel == "gasolina" || combustivel == "diesel" || combustivel == "gás") {
            String aux = this.combustivel;
            this.combustivel = combustivel;
            System.out.println("Combustível alterado de " + aux + " para " + this.combustivel);
        } else {
            System.out.println("O combustível " + combustivel + " não é válido.");
        }
    }

    public void setVelocidadeAumentar() {
        if (this.velocidade < 150) {
            this.velocidade += 10;
            System.out.println("Velocidade: " + this.velocidade + "Km/h");
        } else {
            System.out.println("Velocidade já está no máximo.");
        }
    }

    public void setVelocidadeDiminuir() {
        if (this.velocidade > 0) {
            this.velocidade -= 10;
            System.out.println("Velocidade: " + this.velocidade + "Km/h");
        } else {
            System.out.println("O caminhão está parado");
        }
    }
}