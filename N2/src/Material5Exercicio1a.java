// Por questão de organização dos arquivos em minha pasta de estudo coloquei a classe com o nome a baixo,
// porém o nome da classe deveria ser "Residencial".

public class Material5Exercicio1a extends Material5Exercicio1 {
    int qtdVagasGaragem;
    int qtdQuartos;
    int qtdSuites;

    public Material5Exercicio1a () {

    }

    public Material5Exercicio1a (String titulo, double valor, String bairro, double metragem, int qtdVagasGaragem, int qtdQuartos, int qtdSuites) {
        super(titulo, valor, bairro, metragem);
        this.qtdVagasGaragem = qtdVagasGaragem;
        this.qtdQuartos = qtdQuartos;
        this.qtdSuites = qtdSuites;
    }

    public int getQtdVagasGaragem() {
        return qtdVagasGaragem;
    }
    public void setQtdVagasGaragem(int qtdVagasGaragem) {
        this.qtdVagasGaragem = qtdVagasGaragem;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }
    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    public int getQtdSuites() {
        return qtdSuites;
    }
    public void setQtdSuites(int qtdSuites) {
        this.qtdSuites = qtdSuites;
    }
}
