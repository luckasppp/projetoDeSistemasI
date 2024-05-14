import javax.swing.JOptionPane;

public class Material2Exercicio5 {
    //      No método principal receba uma frase e verifique se essa frase possui
    //  palavras impróprias. As palavras impróprias são: sexo e sexual. Caso en_
    //  contre uma dessas palavras, emita em tela a mensagem “conteúdo impróprio”,
    //  caso contrário “conteúdo liberado”.
    public static void main(String[] args) {
        String aux = "";

        aux = JOptionPane.showInputDialog("Insira uma frase: ");
        
        if (aux.toLowerCase().indexOf("sexual") == -1 || aux.toLowerCase().indexOf("sexo") == -1 ) {
            System.out.println("Conteúdo liberado.");
            System.out.println("Frase digitada: '" + aux + "'");
        } else {
            System.out.println("Conteúdo impróprio!");
        }
    }
}
