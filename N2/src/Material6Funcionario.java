public class Material6Funcionario {
    public int matricula = 0;
    public String nome = "";
    public double salario = 0;

    public Material6Funcionario(Integer matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularPlr() {
        return this.salario * 0.05;
    }
}
