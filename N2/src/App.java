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
        // Material5Avo braga = new Material5Avo();
        // braga.nome = "Braga";
        // braga.corOlhos = "Castanho Escuro";
        // braga.ler();

        // Material5Pai roberto = new Material5Pai();
        // roberto.nome = "Roberto";
        // roberto.ler();

        // Material5Filho lucas = new Material5Filho();
        // lucas.nome = "Lucas";
        // lucas.corCabelo = "Preto";
        // lucas.corOlhos = "Castanho Escuro";
        // lucas.ler();
        // lucas.trabalhar();
        

        // Material 5 - Teste de herança (super).
        // Material5Filho fanie = new Material5Filho("Fanie", "Castanho", "Branca", "Castanho");
        // System.out.println(fanie.corCabelo);

        // Material5 Exercicio1:
        // Material5Exercicio1ab casa1 = new Material5Exercicio1ab("Casa de Leilão", 100000, "Barreto", 250, 1, 2, 0);
        // System.out.println(casa1.getBairro());

        // Material5Exercicio1b terreno1 = new Material5Exercicio1b("Terreno no Mar do Norte", 250000, "Mar do Norte", 235);
        // System.out.println(terreno1.getTitulo());
        
        // Material5Exercicio1 imovel1 = new Material5Exercicio1();
        // imovel1.setBairro("Parque Aeroporto");
        // imovel1.setTitulo("Casa do Aeroporto");
        // imovel1.setValor(280000);
        // System.out.println("A " + imovel1.getTitulo() + " localizada no bairro " + imovel1.getBairro() + " custa: " + imovel1.getValor());

        // // Material 5 - Exercicio 2:
        // Material5Exercicio2 eletronico1 = new Material5Exercicio2(true); // Utilizando o segundo método construtor de Eletronico
        // System.out.println("O eletrônico está ligado?\n" + eletronico1.getLigado() + "\n");
        // eletronico1.ligar();    // Tentando ligar o eletrônico sendo que já está ligado.
        // System.out.println();
        // eletronico1.desligar();
        // System.out.println("O eletrônico está ligado?\n" + eletronico1.ligado + "\n");  // Fazendo a mesma pergunta anterior só que acessando a resposta por meio de atributo.

        // // Material5Exercicio2a tablet0 = new Material5Exercicio2a(true, 12);  // Tentando criar objeto com o volume maior que o máximo que é 10. (Comente após o teste)
        // Material5Exercicio2a tablet1 = new Material5Exercicio2a(true, 9);  // Tentando criar objeto com o volume dentro do intervalo 0 - 10.
        // System.out.println(tablet1.volume);
        // tablet1.aumentarVolume();
        // tablet1.aumentarVolume(); // Tenta aumentar o volume para > 10 e o método não deixa.
        // System.out.println("Volume: " + tablet1.getVolume());
        // tablet1.diminuirVolume();
        // tablet1.diminuirVolume();
        // tablet1.diminuirVolume();
        // tablet1.diminuirVolume();
        // System.out.println("Volume: " + tablet1.volume);

        // Material5Exercicio2b radio1 = new Material5Exercicio2b();
        // System.out.println(radio1.ligado);
        // radio1.desligar();
        // radio1.ligar();
        // System.out.println(radio1.getLigado());


        // // Material 6 - Funcionário/Gerente/Escriturario
        // Material6Escriturario func1 = new Material6Escriturario(1, "Lucas", 2100, 1);
        // System.out.println(func1.calcularPlr() + func1.salario);

        // Material6Gerente func2 = new Material6Gerente(2, "Braga", 5350, 3);
        // System.out.println(func2.calcularPlr() + func2.salario);

        // // Material 6 - Exercício 1 (Funcionario/Freelancer/Vendedor):
        // DecimalFormat formatacao = new DecimalFormat();

        // formatacao.applyLocalizedPattern("###.###,00");
        // Funcionario func1 = new Funcionario();
        // func1.nome = "Lucas Damasceno";
        // func1.salarioBase = 2166.49;
        // System.out.println("Os encargos trabalhistas são: R$ " +
        // formatacao.format(func1.calcularEncargos()));

        // System.out.println("O funcionario recebe: R$ " + func1.getSalarioBase());

        // System.out.println("A empresa gasta com o funcionário: R$ " + 
        // formatacao.format(GastoTotal.calcularGastos(func1)));

        // // Material 7 - Teste em sala
        // Material7Empresa empresa = new Material7Empresa();
        // Material7EmpresaFranqueada franqueada = new Material7EmpresaFranqueada();

        // empresa.m1();   // método default   
        // empresa.m2();   // método protected

        // empresa.cnpj = 15236544;        // método default 
        // empresa.razao_social ="";       // método public 
        // empresa.nome_fantasia = "";     // método protected
        // // empresa.responsavel = "Lucas";  // método private

        // franqueada.m1();   // método default   
        // franqueada.m2();   // método protected
        // // franqueada.m3();   // método private

        // franqueada.cnpj = 15236544;        // atributo default 
        // franqueada.razao_social ="";       // atributo public 
        // franqueada.nome_fantasia = "";     // atributo protected
        // // franqueada.responsavel = "Lucas";  // atributo private


        // Exercicio 1 - Material 7:
        Funcionario f1 = new Funcionario();
        f1.nome = "Lucas";
        f1.salarioBase = 2177;

        System.out.println(f1.getNome());
        System.out.println("Salário Base: " + f1.getSalarioBase());
        System.out.println("Encargos: " + f1.calcularEncargos());
        System.out.println("Salário Líquido: " + (f1.getSalarioBase()-f1.calcularEncargos()));
        f1.setSalarioBase(3500);
        System.out.println("Novo Salário Líquido: " + (f1.getSalarioBase()-f1.calcularEncargos()));
    }
}