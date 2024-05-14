public class Material2Exercicio3 {
    //      No método principal gere um número aleatoriamente (entre 5 e 10) por
    // Math.random. Em seguida, faça com que apareça em tela uma senha numérica
    // contendo a mesma quantidade de dígitos correspondentes ao valor aleatório
    // gerado. Apresente em tela o número sorteado e a senha.
    public static void main(String[] args) {
        int valor = 0, aux = 0;
        String senha = "";

        valor = (int) (Math.random()*5)+5;

        for(int i = 0; i < valor; i++){
            aux = (int) (Math.random()*10);
            senha += String.valueOf(aux);
        }
        System.out.println("O valor sorteado foi " + valor + " então a senho é: " + senha);
    }
}