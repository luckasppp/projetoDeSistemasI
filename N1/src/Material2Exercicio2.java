import javax.swing.JOptionPane;

public class Material2Exercicio2 {
    //  Uma farmácia precisa ajustar os preços de seus produtos em 12%. No
    // método principal crie a lógica que receba o valor do produto e aplique o
    // percentual de acréscimo. O novo valor a ser calculado deve ser
    // arredondado usando o método round. O método deve também conter
    // um laço de repetição que encerre o programa quando o usuário
    // fornecer o valor zero (0) para o valor do produto. Dessa forma, o
    // usuário digita o valor do produto, o método calcula e mostra o valor
    // com acréscimo, a seguir solicita um novo valor. Esse processo
    // continua enquanto o valor do produto for diferente de zero; caso
    // contrário o programa será encerrado.
    public static void main (String[] args) {
        String aux;
        double valor;

        while (true) {
            aux = JOptionPane.showInputDialog("Insira o valor para ser reajustado: ");
            valor = Double.parseDouble(aux);
            
            if (valor == 0) {
                break;
            } else {
                valor = Math.round(valor*1.12);
                JOptionPane.showMessageDialog(null, "Com 12% de ajuste fica: R$ " + valor);
            }
        }
    }
}