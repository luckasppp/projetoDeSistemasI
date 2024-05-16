// Por questão de organização dos arquivos em minha pasta de estudo coloquei a classe com o nome a baixo,
// porém o nome da classe deveria ser "Imovel".

public class Material5Exercicio1 {
    String titulo;
    double valor;
    String bairro;
    double metragem;

    public Material5Exercicio1() {

    }

    public Material5Exercicio1(String titulo, double valor, String bairro, double metragem) {
        this.titulo = titulo;
        this.valor = valor;
        this.bairro = bairro;
        this.metragem = metragem;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public double getMetragem() {
        return metragem;
    }
    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }
}
