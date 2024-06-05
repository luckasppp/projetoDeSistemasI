public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public double calcularEncargos(){
        double encargosTrabalhistas = this.getSalarioBase()*0.1944;
        double encargosSociais = this.getSalarioBase()*0.112;
        double previdenciarioSemFeriasDTerceiro = this.getSalarioBase()*0.0218;

        return encargosTrabalhistas + encargosSociais + previdenciarioSemFeriasDTerceiro;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    protected void setSalarioBase(double novoSalarioBase) {// O método estava com encapsulamento private e não era possível invocá-lo a partir de um objeto.
        this.salarioBase = novoSalarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
}
