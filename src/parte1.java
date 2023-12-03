import java.util.Arrays;
import java.util.Scanner;

public class parte1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os nomes separados por vírgulas:");
        String input = sc.nextLine();

        // Dividindo os nomes usando o método split()
        String[] nomes = input.split(",");

        // Removendo espaços em branco usando trim()
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        // Ordenando os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Imprimindo os nomes ordenados
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
