import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nome;
    private String capital;
    private double dimensao;
    private List<Pais> fronteira;

    protected Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.fronteira = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean setFronteira(Pais novoPais) {
        if(!this.equals(novoPais)){
            fronteira.add(novoPais);
            return true;
        } else {
            System.out.println("O país não pode fazer fronteira consigo.");
            return false;
        }
    }

    public List<Pais> getFronteira() {
        return this.fronteira;
    }

    public boolean equals(Pais pais) {
        return (pais.nome == this.nome) && (pais.capital == this.capital);
    }

    public List<Pais> paisesQueFazemFronteira(Pais outroPais) {
        List<Pais> fronteirasEmComum = new ArrayList<>();
        for (Pais pais : this.fronteira) {
            if(outroPais.getFronteira().contains(pais)) {
                fronteirasEmComum.add(pais);
            }
        }
        return fronteirasEmComum;
    }
}