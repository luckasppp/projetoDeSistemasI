public class Material6Gerente extends Material6Funcionario {
    int subordinado = 0;

    public Material6Gerente(int matricula, String nome, double salario, int subordinado) {
        super(matricula, nome, salario);
        this.subordinado = subordinado;
    }

    // @Override
    // public double calcularPlr() {
    //     return this.salario * 0.25;
    // }
}
