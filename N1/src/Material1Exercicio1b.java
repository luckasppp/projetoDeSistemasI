import javax.swing.JOptionPane;

public class Material1Exercicio1b {
    public static void main(String[] args) {
        
        String aux = "";
        int i = 0, valor = 0, v1 = 0, v2 = 0, soma = 0;

        while (i == 0) {
            aux = JOptionPane.showInputDialog("insira um valor com dois algarismos: ");
            valor = Integer.parseInt(aux);
            if (valor >= 10) {
                v1 = valor/10;
                v2 = valor%10;
                soma = v1 + v2;
                JOptionPane.showMessageDialog(null, "A soma dos algarismos é: " + soma);
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "O valor inserido tem menos/mais de dois algarismos. Pressione 'OK' para inserir novamente!");
            }
        }
    }
}
