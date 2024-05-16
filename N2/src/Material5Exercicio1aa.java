// Por questão de organização dos arquivos em minha pasta de estudo coloquei a classe com o nome a baixo,
// porém o nome da classe deveria ser "Apartamento".

public class Material5Exercicio1aa extends Material5Exercicio1a {
    int andar;
    boolean solNascente;
    String torre;

    public Material5Exercicio1aa() {
        
    }

    public Material5Exercicio1aa(String titulo, double valor, String bairro, double metragem, int qtdVagasGaragem, int qtdQuartos, int qtdSuites, int andar, boolean solNascente, String torre) {
        super(titulo, valor, bairro, metragem, qtdVagasGaragem, qtdQuartos, qtdSuites);
        this.andar = andar;
        this.solNascente = solNascente;
        this.torre = torre;
    }

    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }

    public boolean getSolNascente() {
        return solNascente;
    }
    public void setSolNascente(boolean solNascente) {
        this.solNascente = solNascente;
    }

    public String getTorre() {
        return torre;
    }
    public void setTorre(String torre) {
        this.torre = torre;
    }
}
