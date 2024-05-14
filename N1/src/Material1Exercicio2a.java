import javax.swing.JOptionPane;

public class Material1Exercicio2a {
    public static void main(String[] args) {
        String aux="", porcentagem = "";
        int codigo=0;
        double valor = 0, descontado = 0;

        aux = JOptionPane.showInputDialog("Digite o valor do produto: ");
        valor = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog("Insira o código de desconto: ");
        codigo = Integer.parseInt(aux);

        switch (codigo) {
            case 1:
                descontado = valor * 0.95;
                porcentagem = "5%";
                break;
            case 2:
                descontado = valor * 0.90;
                porcentagem = "10%";
                break;
            case 3:
                descontado = valor * 0.80;
                porcentagem = "20%";
                break;
            case 4:
                descontado = valor * 0.50;
                porcentagem = "50%";
                break;
            default:
                break;
        }

        JOptionPane.showMessageDialog(null, "O novo valor com " + porcentagem + " de desconto é : R$" + descontado);
    }
}