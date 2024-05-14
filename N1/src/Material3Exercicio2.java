import javax.swing.JOptionPane;

public class Material3Exercicio2 {
    //      Inclua um loop permanente para que o programa abaixo só termine quando
    //  o usuário informar valores corretos de entrada.
    public static void main (String[] args) {
        int n1 = 0, n2 = 1;
        int cod = 0;
        float resultado = 0;
        do {
            cod = 1;
            try { 
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o dividendo: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o divisor: "));
                resultado = n1 / n2;
            }
            catch (ArithmeticException erro) {
                cod = 0;
                JOptionPane.showMessageDialog(null, "Não pode dividir por 0");
            }
            catch (NumberFormatException erro) {
                cod = 0;
                JOptionPane.showMessageDialog(null, "Precisa ser inserido um número.");
            }
        } while (cod != 1);
        
        JOptionPane.showMessageDialog(null, "Rsultado: " + resultado);
    }
}