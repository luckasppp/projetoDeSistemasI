public class Material2Aula1 {
    // Na classe Math, o método Random gera um double de 0,0000000000000000 até 0,9999999999999999
    // (int) truncar despreza a parte fracionária (o truncamento tem prioridade maior que todas as operações).

    public static void main(String[] args) {
        System.out.println((int) (Math.random()*100));
    }
}