public class GastoTotal{
    public static double calcularGastos(Funcionario funcionario) {
        return funcionario.calcularEncargos() + funcionario.getSalarioBase();
    }
}
