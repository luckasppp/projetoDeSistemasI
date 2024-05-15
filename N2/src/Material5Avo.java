public class Material5Avo {
    String nome;
    String corOlhos;

    public Material5Avo(String nome, String corOlhos) {
        this.nome = nome;
        this.corOlhos = corOlhos;
    }

    public Material5Avo () {

    }

    public void ler() {
        System.out.println(this.nome + " está Lendo...");
    }
}