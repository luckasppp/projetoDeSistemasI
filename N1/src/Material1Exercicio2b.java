import javax.swing.JOptionPane;

public class Material1Exercicio2b {
    public static void main(String[] args) {
        String aux = "";
        int idade = 0, maior = 0, menor = 999999;

        for (int i = 1; i <= 4; i++) {
            aux = JOptionPane.showInputDialog("Insira a " + i + "ª idade: ");
            idade = Integer.parseInt(aux);

            if (idade > maior) {
                maior = idade;
            }
            if (idade < menor) {
                menor = idade;
            }
        }

        JOptionPane.showMessageDialog(null, "A maior idade inserida foi: " + maior + " anos.");
        JOptionPane.showMessageDialog(null, "A menor idade inserida foi: " + menor + " anos.");
    }
}