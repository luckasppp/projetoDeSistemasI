

public class Material7Empresa {
    int cnpj;
    public String razao_social = "Padrão";
    protected String nome_fantasia = "Padrão";
    private String responsavel = "Padrao";

    void m1() {
        System.out.println("Sou o método 1");
    }

    protected void m2() {
        this.m3();
    }

    private void m3() {
        System.out.println("Sou o método 3");
    }
}
