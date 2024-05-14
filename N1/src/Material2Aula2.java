import java.text.DecimalFormat;

public class Material2Aula2 {
    public static void main(String[] args) {
        
        // Primeira regra de formatação:
        DecimalFormat regra_1 = new DecimalFormat();
        regra_1.applyPattern("00.00");
        System.out.println(regra_1.format(0.9700));

        // Segunda regra de formatação:
        DecimalFormat regra_2 = new DecimalFormat();
        regra_2.applyPattern("###,###.00");
        System.out.println(regra_2.format(1500));
        
        // Terceira regra de formatação:
        DecimalFormat regra_3 = new DecimalFormat();
        regra_3.applyPattern("###,###.##");
        System.out.println(regra_3.format(1500));

        String nome;
        nome = "Lucas Damasceno";
        System.out.println(nome.length());
        System.out.println(nome.charAt(nome.length()-1));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.substring(6, 15));
        System.out.println(nome.trim()); // Elimina espaços antes e depois da string
        System.out.println(nome.replace(" ", " Emanuel Braga "));
        System.out.println(String.valueOf(10) + 10);
        System.out.println(nome.indexOf("sc", 0));
    }
}
