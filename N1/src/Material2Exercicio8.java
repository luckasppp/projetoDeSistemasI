import javax.swing.JOptionPane;

public class Material2Exercicio8 {
    //      Escreva um programa que leia um número inteiro não
    //  negativo n, em seguida leia tais n números e calcule a
    //  frequência de ocorrência de cada um deles. Por exemplo:
    //  n = 5
    //  |  6   |   7   |   6   |   88  |   3   |
    //  6: 2 vezes
    //  7: 1 vez
    //  88: 1 vez
    //  3: 1 vez
    public static void main(String[] args) {
        int n = 0;

        // Pede para o usuário q quantidade de números e cria um array com o tamanho inserido:
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira quantos números serão gerados: "));
        int[] numerosInt = new int[n];

        // Gera os valores aleatórios e imprime:
        for (int i = 0; i < n; i++) {
            numerosInt[i] = (int) (Math.random()*10+1);
            System.out.print(numerosInt[i] + ":");
        }
        System.out.println("\n");

        // Cria um array para verificar a frequência do tamanho inserido pelo usuário:
        int[] frequencia = new int[11]; // O valor aqui precisa ser igual ao range de Random.
        for (int numero : numerosInt) {
            frequencia[numero]++;
        }

        System.out.println("Frequência de ocorrência dos números:");
        for (int i = 0; i < frequencia.length; i++) {
            if (frequencia[i] > 0) {
                System.out.println(i + ": " + frequencia[i] + " vez(es)");
            }
        }
    }
}
