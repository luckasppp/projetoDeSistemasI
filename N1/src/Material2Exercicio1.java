import javax.swing.JOptionPane;

public class Material2Exercicio1 {
//     No método principal, crie a lógica que simule a jogada de um dado de
// seis lados (números de 1 a 6), pelo número de vezes informado pelo
// usuário. Ao final, some seus valores sorteados e apresente o resultado
// das jogadas.
public static void main (String[] args) {
        int jogadas = 0, soma = 0, valor = 0;
        String aux = "";
        
        aux = JOptionPane.showInputDialog("Insira a quantidade de vezes o dados será lançado: ");
        jogadas = Integer.parseInt(aux);
        for (int i = 0; i < jogadas; i++) {
            valor = (int) ((Math.random()*6)+1);
            System.out.println("O valor jogador foi: " + valor);
            soma += valor;
        }
        System.out.println("A soma dos lançamentos é: " + soma);
    }
}