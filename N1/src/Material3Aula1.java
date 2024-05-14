import javax.swing.JOptionPane;

public class Material3Aula1 {
    public static void main(String[] args) {
        try {
            int nr1 = Integer.parseInt(JOptionPane.showInputDialog("Dividendo: "));
            int nr2 = Integer.parseInt(JOptionPane.showInputDialog("Denominador: "));
        
            float resultado = nr1 / nr2;
            JOptionPane.showMessageDialog(null, resultado);
        }
        // catch (NumberFormatException erro) {
        //     JOptionPane.showMessageDialog(null, "Digite apenas números inteiros.\n" +
        //     "O texto do erro é: " + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        // }
        // catch (ArithmeticException erro) {
        //     JOptionPane.showMessageDialog(null, "O denominador não pode ser 0.\n" +
        //     "O texto do erro é: " + erro.toString());
        // }
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro encontrado. Informe para o administrador.\n" +
            "O texto do erro é: " + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
            //System.out.println("O nome da classe da exceção é: " + erro.getClass().getName());
            // System.out.println(erro.getMessage());
            // erro.printStackTrace();
        }
        finally {
            System.out.println("Programa finalizado!");
            // Geralmente é colocado fechamentos de arquivos e
            // coisas que precisam ser encerradas.
        }
    }
}