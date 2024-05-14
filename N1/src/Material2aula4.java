import java.util.ArrayList;

public class Material2aula4 {
    public static void main(String[] args) {
        ArrayList<Double> peso = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            peso.add(Math.random()*100);
        }

        for(int i = 0; i < peso.size(); i++) {
            System.out.print(peso.get(i) + "\t");
        }

        System.out.println("\n\n");

        // Utilizando ArrayList e For Each:
        ArrayList<ArrayList<Integer>> mtx = new ArrayList<>();
        ArrayList<Integer> linha_1 = new ArrayList<>();

        mtx.add(linha_1);

        for(int i = 0; i < 50; i++) {
            linha_1.add((int) (Math.random()*100));
        }

        for (ArrayList<Integer> linha : mtx) {
            for (int item : linha) {
                System.out.print("\t" + item);
            }
            
        }
    }
}