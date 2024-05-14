import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Material2Exercicio6 {
    //       No método main gere aleatoriamente mil números inteiros, entre 50 e 1050, e os armazene num array
    //  bidimensional (com o formato de 50 linhas e 20 colunas). A seguir, peça para o usuário digitar um
    //  número entre 50 e 1050 para ser pesquisado no array. Informe ao usuário se o número existe ou não no array.
    //  Se existir, pode ser que o número tenha sido gerado em mais de uma posição na matriz. Neste caso, informe
    //  em quais posições (índice da linha e índice da coluna) o número informado pelo usuário foi encontrado.
    public static void main (String[] args) {   
        String aux = "";
        int valor = 0, cont = 0;
        int[][] arrayBidimensional = new int[50][20];
        int[][] posicao = new int[1000][2];

        aux = JOptionPane.showInputDialog("Insira um número para ser procurado: ");
        valor = Integer.parseInt(aux);

        DecimalFormat formatado = new DecimalFormat();
        formatado.applyPattern("0000");

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                arrayBidimensional[i][j] = (int) ((Math.random()*1001)+50);
                System.out.print(formatado.format(arrayBidimensional[i][j]) + "\t");
                if (valor == arrayBidimensional[i][j]) {
                    posicao[cont][0] = i;
                    posicao[cont][1] = j;
                    cont++;
                }
            }
            System.out.print("\n");
        }

        if (cont == 0) {
            System.out.println("Valor não encontrado.");   
        } else {
            System.out.println("o valor " + valor + " apareceu: " + cont + " vezes.");
            System.out.println("Valor encontrado nas coordenadas: ");
            for (int i = 0; i < cont; i++) {
                System.out.println(posicao[i][0] + ", " + posicao[i][1]);
            }
        }    
    }
}