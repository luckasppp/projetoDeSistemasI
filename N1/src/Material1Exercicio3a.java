import javax.swing.JOptionPane;

public class Material1Exercicio3a {
        /* No método main receba o limite inferior e o superior
    de uma série de números inteiros. Com isso, seu
    método deve informar a soma de todos os números
    pares do intervalo (inclusive os limites). */ 

    public static void main(String[] args) {
        int limiteInferior = 9999999, limiteSuperior = 0, somaPar = 0;
        String aux = "";

        aux = JOptionPane.showInputDialog("Insira o LIMITE INFERIOR da série de números inteiros: ");
        limiteInferior = Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog("Insira o LIMITE SUPERIOR da série de números inteiros: ");
        limiteSuperior = Integer.parseInt(aux);

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if ((i%2)==0) {
                somaPar += i;
            }
        }

        System.out.println("A soma dos númeors pares é: " + somaPar);
    }
}