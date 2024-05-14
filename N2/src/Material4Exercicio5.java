// import java.util.ArrayList;
import java.util.List;

public class Material4Exercicio5 {
    // Estou nomeando a classe de acordo com a organização que estou fazendo em minhas pastas de arquivos.
    // A classe deveria se chamar Pais.

    private String nomePais;
    private String capital;
    private double dimensao;
    private List<Material4Exercicio5> fronteira;

    public Material4Exercicio5(String nomePais, String capital, double dimensao) {
        this.nomePais = nomePais;
        this.capital = capital;
        this.dimensao = dimensao;
        System.out.println(this.nomePais + " foi adicionado:\nDimensão (km²): " + this.dimensao + "\nCapital: " + this.capital);
    }

    // Metodos get e set de nomePais
    public String getNomePais() {
        return nomePais;
    }
    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    // Metodos get e set de capital
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }

    // Metodos get e set de dimensao
    public double getDimensao() {
        return dimensao;
    }
    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    // Método para verificar igualdade entre países
    public Boolean verificarIgualdade(Material4Exercicio5 outroPais) {
        // Irá retornar true se as duas condições de igualdade forem atendidas.
        return this.nomePais.equals(outroPais.getNomePais()) && this.capital.equals(outroPais.getCapital());
    }

    // Método para adicionar fronteira
    public void adicionarFronteira(Material4Exercicio5 pais) {
        if(!this.verificarIgualdade(pais)) {    // Verifica a igualdade entre o nome e capital o objeto atual com o objeto passado por parâmentro no método e depois é negado.
            this.fronteira.add(pais);
        } else {
            System.out.println("O país não pode fazer fronteira consigo mesmo.");
        }
    }

    // Método get para listar as fronteiras de uma país.
    public List<Material4Exercicio5> getFronteiras() {
        return this.fronteira;
    }

    // Método para verificar os países em comum do objeto atual e do informado por parâmetro que fazem fronteira com os dois ao mesmo tempo.
    

    // public List<Material4Exercicio5> vizinhosComuns(Material4Exercicio5 outroPais) {
    //     List<Material4Exercicio5> vizinhosComuns = new ArrayList<>();
    //     for (Material4Exercicio5 pais : this.fronteiras) {
    //         if (outroPais.getFronteiras().contains(pais)) {
    //             vizinhosComuns.add(pais);
    //         }
    //     }
    //     return vizinhosComuns;
    // }
}
