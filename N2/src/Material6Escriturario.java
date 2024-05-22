public class Material6Escriturario extends Material6Funcionario {
    int box = 0;

    public Material6Escriturario(int matricula, String nome, double salario, int box) {
        super(matricula, nome, salario);
        this.box = box;
    }

    @Override
    public double calcularPlr() {
        return this.salario * 0.25;
    }
}
