import javax.swing.JOptionPane;

public class Material1Exercicio1c {
    public static void main(String[] args) {
        String aux = "", classificacao = "";
        double peso = 0, altura = 0, imc = 0;

        aux = JOptionPane.showInputDialog("Insira sua altura: ");
        altura = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog("Insira seu peso: ");
        peso = Double.parseDouble(aux);

        imc = peso/Math.pow(altura, 2);

        if (imc < 18.5) {
            classificacao = "abaixo do normal";
        } else if (imc >= 18.5 & imc < 24.5) {
            classificacao = "ideal";
        } else if (imc >= 24.5 & imc < 30){
            classificacao = "pré-obesidade";
        } else if (imc >= 30 & imc < 35){
            classificacao = "obesidade classe I";
        } else if (imc >= 35 & imc < 40){
            classificacao = "obesidade classe II";
        } else {
            classificacao = "obesidade classe III";
        }

        JOptionPane.showMessageDialog(null, "Seu índice IMC é " + imc + " e sua classificação é: " + classificacao);
    }
}