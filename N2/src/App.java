public class App {
    public static void main(String[] args) throws Exception {
        // Exercício 1:
        // System.out.println("Média com 2 parâmetros: " + Material4Exercicio1.Media(6, 8));
        // System.out.println("Média com 3 parâmetros: " + Material4Exercicio1.Media(6, 8, 10));
        // System.out.println("Média com 4 parâmetros: " + Material4Exercicio1.Media(6, 8, 3, 10));


        // Exercício 2:
        // Material4Exercicio2 lampada1 = new Material4Exercicio2(1);
        // Material4Exercicio2 lampada2 = new Material4Exercicio2(2);

        // lampada1.StatusLampada();
        // lampada1.LigarDesligar();

        // lampada2.LigarDesligar();
        // lampada2.StatusLampada();

        // Exercício 3:
        // Material4Exercicio3 tv1 = new Material4Exercicio3();
        // Material4Exercicio3 tv2 = new Material4Exercicio3(18);

        // tv1.Informacoes();
        // System.out.println();
        // tv2. Informacoes();
        // System.out.println();
        // tv1.Ligar();
        // tv1.Aumentar();
        // tv1.Aumentar();
        // tv1.Aumentar();
        // tv1.Informacoes();
        // tv1.Diminuir();
        // System.out.println();
        // tv2.TrocarCanal(-1);

        // Exercício 4:
        // Material4Exercicio4 caminhao1 = new Material4Exercicio4();
        
        // caminhao1.setGasolina("diesel");

        // caminhao1.setVelocidadeAumentar();
        // caminhao1.setVelocidadeAumentar();
        // caminhao1.setVelocidadeAumentar();
        // caminhao1.setVelocidadeDiminuir();

        // caminhao1.setGasolina("gás");
        // caminhao1.setGasolina("etanol");

        // Exercício 5:
        // Material4Exercicio5 brasil = new Material4Exercicio5("Brasil", "Brasília", 989394243);

        // Material 5 - Teste de herança.
        Material5Avo braga = new Material5Avo();
        braga.nome = "Braga";
        braga.corOlhos = "Castanho Escuro";
        braga.ler();

        Material5Pai roberto = new Material5Pai();
        roberto.nome = "Roberto";
        roberto.ler();

        Material5Filho lucas = new Material5Filho();
        lucas.nome = "Lucas";
        lucas.corCabelo = "Preto";
        lucas.corOlhos = "Castanho Escuro";
        lucas.ler();
        lucas.trabalhar();


    }
}