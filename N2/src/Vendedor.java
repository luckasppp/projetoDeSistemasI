public class Vendedor extends Funcionario {
    private double comissao;

    @Override
    public double calcularEncargos() {
        double encargosTrabalhistas = this.getSalarioBase()*0.1944;
        double encargosSociais = this.getSalarioBase()*0.112;
        double previdenciarioSemFeriasDTerceiro = this.getSalarioBase()*0.0218;

        double fgts = this.getComissao() * 0.08;
        double ir = this.getComissao() * 0.075;
        double inss = this.getComissao() * 0.085;

        return encargosTrabalhistas + encargosSociais +
        previdenciarioSemFeriasDTerceiro + fgts + ir + inss;
    }

    public double getComissao() {
        return this.comissao;
    }

    protected void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
