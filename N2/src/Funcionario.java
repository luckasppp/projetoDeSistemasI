public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public double calcularEncargos(){
        double encargosTrabalhistas = this.salarioBase*0.1944;
        double encargosSociais = this.salarioBase*0.112;
        double previdenciarioSemFeriasDTerceiro = this.salarioBase*0.0218;

        return encargosTrabalhistas + encargosSociais + previdenciarioSemFeriasDTerceiro;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public void setSalarioBase(double novoSalarioBase) {
        this.salarioBase = novoSalarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
}
