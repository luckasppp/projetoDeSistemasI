public class Material2Aula3 {
    public static void main(String[] args) {
        int[] valor = new int[5];

        System.out.println("Endereço de memória do primeiro array: " + valor);
        System.out.print("Conteúdo do primeiro array: ");
        for (int i = 0; i < 5; i++) {
            valor[i] = (int) (Math.random()*100);
            System.out.print(valor[i] + "\t");
        }
        
        String [] valor2 = {"José", "Ana Raquel", "Lucas"};

        System.out.println("\n\n\nEndereço de memória do segundo array: " + valor2);

        System.out.println("Conteúdo do vetor segundo array: " + valor2); 
        for (int i = 0; i < valor2.length; i++) {
            System.out.print(valor2[i] + "\t");
        }
        System.out.println("\n");

        // Array bidimenssional (Matriz):
        int[][] matriz1 = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz1[i][j] = (int) (Math.random()*100);
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("\n\n");

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
