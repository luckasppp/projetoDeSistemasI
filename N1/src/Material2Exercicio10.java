import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Material2Exercicio10 {
    //      Faça um programa que solicite ao usuário números e os
    //  armazene em uma matriz quadrada. Em seguida, crie um
    //  ArrayList que armazene os elementos da diagonal principal
    //  da matriz e imprima esses elementos. Para ler a matriz
    //  considere que o usuário irá digitar cada linha de uma vez
    //  e os elementos da linha são separados por “ ; ”.
    public static void main (String[] args) {
        int ordem = 0;
        ArrayList<Integer> diagonalPrincipal = new ArrayList<>();

        ordem = Integer.parseInt(JOptionPane.showInputDialog("Insira a ordem da matriz quadrada: "));
        int[][] matriz = new int[ordem][ordem];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da coordenada " + i + ", " + j + ": "));
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.print("\n\nOs elementos da diagonal principal são: \n");
        for (int i = 0; i < matriz.length; i++) {
            diagonalPrincipal.add(matriz[i][i]);
            System.out.print(diagonalPrincipal.get(i) + ";");
        }
    }
}