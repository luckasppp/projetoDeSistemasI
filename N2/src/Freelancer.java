public class Freelancer extends Funcionario {
    private int diasTrabalhados;
    private int valorDia;

    @Override
    public double calcularEncargos() {
        double impostos = this.getSalarioBase() * 0.09;
        double inss = this.getSalarioBase() * 0.11;
        double contabilidade = 100;

        return impostos + inss + contabilidade;
    }

    public int getDiasTrabalhados() {
        return this.diasTrabalhados;
    }

    protected void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public int getValorDia() {
        return this.valorDia;
    }

    public void setValorDia(int novoValorDia) {
        this.valorDia = novoValorDia;
    }
}
