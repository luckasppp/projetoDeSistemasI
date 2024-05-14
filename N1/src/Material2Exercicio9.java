
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Material2Exercicio9 {
    //      No método main gere aleatoriamente mil números
    //  inteiros, entre 50 e 1050, e os armazene num ArrayList
    //  bidimensional (com o formato de 50 linhas e 20
    //  colunas). A seguir, peça para o usuário digitar um
    //  número entre 50 e 1050 para ser pesquisado no
    //  ArrayList. Informe ao usuário se o número existe ou não
    //  no ArrayList. Se existir, pode ser que o número tenha
    //  sido gerado em mais de uma posição na matriz. Neste
    //  caso, informe em quais posições (índice da linha e
    //  índice da coluna) o número informado pelo usuário foi
    //  encontrado.
    public static void main (String[] args) {
        String aux = "";
        int valor = 0, cont = 0;

        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        ArrayList<int[]> posicao = new ArrayList<>();

        aux = JOptionPane.showInputDialog("Insira um número para ser procurado: ");
        valor = Integer.parseInt(aux);

        DecimalFormat formatado = new DecimalFormat();
        formatado.applyPattern("0000");

        for (int i = 0; i < 50; i++) {
            ArrayList<Integer> linha = new ArrayList<>();
            for (int j = 0; j < 20; j++) {
                linha.add((int) ((Math.random()*1001)+50));
                if (linha.get(j) == valor) {
                    int[] cordenada = new int[2];
                    cordenada[0] = i;
                    cordenada[1] = j;
                    posicao.add(cordenada);
                }
            }
            matriz.add(linha);
        }

        for (ArrayList<Integer> linha : matriz) {
            for (int item : linha) {
                System.out.print(formatado.format(item) + "\t");
                if (item == valor) {
                    cont++;
                }
            }
            System.out.println("\n");
        }


        System.out.println("O valor " + valor + " foi encontrado " + cont + " vezes nas posições: ");
        for (int[] linha : posicao) {
            System.out.println(linha[0] + ", " + linha[1]);
        }

    }
}