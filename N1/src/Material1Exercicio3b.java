import javax.swing.JOptionPane;

public class Material1Exercicio3b {
    /* No método main que receba 3 notas de cada aluno
    de uma turma e informe a média do aluno e a média
    da turma */
    public static void main(String[] args) {
        String aux = "";
        double media = 0, valor = 0, mediaAlunos = 0, aluno1 = 0, aluno2 = 0, aluno3 = 0;

        for (int i = 1; i < 4; i++) {
            media = 0;
            for (int j = 1; j < 4; j++) {
                aux = JOptionPane.showInputDialog("Insira a " + j +"ª nota do " + i + " aluno: ");
                valor = Double.parseDouble(aux);

                media += valor;
            }
            if (i == 1) {
                aluno1 = media / 3;
            } else if (i == 2) {
                aluno2 = media / 3;
            } else {
                aluno3 = media / 3;
            }
            mediaAlunos += media / 3;
        }
        mediaAlunos /= 3;

        System.out.println("A média do 1º aluno é: " + aluno1 + "\n");
        System.out.println("A média do 2º aluno é: " + aluno2 + "\n");
        System.out.println("A média do 3º aluno é: " + aluno3 + "\n");
        System.out.println("A média da turma é: " + Math.round(mediaAlunos) + "\n");
    }
}