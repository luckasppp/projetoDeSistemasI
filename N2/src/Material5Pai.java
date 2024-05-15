public class Material5Pai extends Material5Avo {
    String corPele;

    public Material5Pai(String nome, String corOlhos, String corPele) {
        super(nome, corOlhos);
        this.corPele = corPele;
    }

    public Material5Pai () {
        
    }

    public void trabalhar() {
    System.out.println(this.nome + " está Trabalhando...");
    }
}
