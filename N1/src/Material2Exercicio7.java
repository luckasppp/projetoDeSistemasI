import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Material2Exercicio7 {
    //      Faça um programa que leia do teclado 20 números inteiros
    //  e armazene-os num ArrayList. Armazene os números pares em um
    //  ArrayList PAR e os ímpares em um ArrayList ÍMPAR. Ordene os
    //  vetores. Imprima os três vetores.
    public static void main(String[] args) {
        String aux = "";

        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            aux = JOptionPane.showInputDialog("Insira o " + (i+1) + " valo: ");
            aList.add(Integer.parseInt(aux));
        }

        bubbleSort(aList);

        for (int i = 0; i < aList.size(); i++) {
            if(aList.get(i)%2 == 0) {
                par.add(aList.get(i));
            } else {
                impar.add(aList.get(i));
            }
        }

        System.out.println("\n\nArray original ordenado: ");
        for (int i = 0; i < aList.size(); i++) {
            System.out.print(aList.get(i) + ";");
        }

        System.out.println("\n\nArray ímpar: ");
        for (int i = 0; i < impar.size(); i++) {
            System.out.print(impar.get(i) + ";");
        }

        System.out.println("\n\nArray par: ");
        for (int i = 0; i < par.size(); i++) {
            System.out.print(par.get(i) + ";");
        }
    }

    public static void bubbleSort (ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    // Troca os elementos
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}
