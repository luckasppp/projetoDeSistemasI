import javax.swing.JOptionPane;

public class Material2Exercicio4 {
    //      No método principal, receba uma frase qualquer e mostre essa frase de
    //  trás para a frente e sem espaços em branco.
    public static void main (String[] args) {
        String aux = "", inversao = "";

        aux = JOptionPane.showInputDialog("Insira o uma frase para ser escrita de trás pra frente: ");
        aux = aux.trim();
        aux = aux.replace(" ", "");

        for (int i = aux.length()-1; i >= 0; i--) {
            inversao += aux.charAt(i);
        }

        System.out.println(inversao);
    }
}