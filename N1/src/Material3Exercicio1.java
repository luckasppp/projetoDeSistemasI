public class Material3Exercicio1 {
    public static void main (String[] args) {
//      Use os métodos getMessage() e printStackTrace() para fazer o tratamento
//  adequado para o programa abaixo:

        try {
            // int x = 10; // Não tinha sido declarado o tipo da variável
            // int n = 5 + Integer.parseInt("5"); // Não pode somar string com inteiro
            int [] nr = new int[2];
            nr[1] = 10; // Tentando acessar índice fora do limite do array.
            // float r = 10 / 0; // Divisão por 0.
            
        }
        catch (NumberFormatException erro) {
            System.out.println("Erro: " + erro.getMessage() + " (Erro ao converter)");
            erro.printStackTrace();
        }
        catch  (ArrayIndexOutOfBoundsException erro) {
            System.out.println("Erro: " + erro.getMessage() + " (Não permitido acessar index maior que a quantidade de posições)");
            erro.printStackTrace();
        }
        catch  (ArithmeticException erro) {
            System.out.println("Erro: " + erro.getMessage() + " (Não permitido dividir por 0)");
            erro.printStackTrace();
        }
    }
}
