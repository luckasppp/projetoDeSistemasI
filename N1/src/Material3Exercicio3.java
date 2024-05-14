import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Material3Exercicio3 {
    public static void main(String[] args) {
        procurarEmArrayList();
        diagonalPrincipal();
    }

    // ############# Exercício 9 #############
    public static void procurarEmArrayList() {
        String aux = "";
        int valor = 0, cont = 0, cod = 0;

        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        ArrayList<int[]> posicao = new ArrayList<>();

        do {
            cod = 1;
            try {
                aux = JOptionPane.showInputDialog("Insira um número para ser procurado: ");
                valor = Integer.parseInt(aux);
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Insira um número inteiro válido.");
                cod = 0;
            } finally {
                if (valor < 50 || valor > 1050) {
                    JOptionPane.showMessageDialog(null, "Insira um valor dentro do intervalo de 50 - 1050.");
                    cod = 0;
                }
            }
        } while (cod != 1);

        DecimalFormat formatado = new DecimalFormat();
        formatado.applyPattern("0000");

        for (int i = 0; i < 50; i++) {
            ArrayList<Integer> linha = new ArrayList<>();
            for (int j = 0; j < 20; j++) {
                linha.add((int) ((Math.random() * 1001) + 50));
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

        System.out.println("O valor " + valor + " foi encontrado " + cont + " vezes nas coordenadas: ");
        for (int[] linha : posicao) {
            System.out.println(linha[0] + ", " + linha[1]);
        }
    }

    // ############# Exercício 10 #############
    public static void diagonalPrincipal() {
        int ordem = 0, cod = 0;
        ArrayList<Integer> diagonalPrincipal = new ArrayList<>();
        int[][] matriz = null;

        do {
            cod = 1;
            try {
                ordem = Integer.parseInt(JOptionPane.showInputDialog("Insira a ordem da matriz quadrada: "));
                matriz = new int[ordem][ordem];

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da coordenada " + i + ", " + j + ": "));
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.print("\n");
                }
            } catch (NumberFormatException erro) {
                cod = 0;
                JOptionPane.showMessageDialog(null, "Insira um número inteiro válido!");
            }
        } while (cod != 1);

        System.out.print("\n\nOs elementos da diagonal principal são: \n");
        for (int i = 0; i < matriz.length; i++) {
            diagonalPrincipal.add(matriz[i][i]);
            System.out.print(diagonalPrincipal.get(i) + ";");
        }
    }
}