import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character, ArrayList<String>> gruposPorSexo = new HashMap<>();
        gruposPorSexo.put('M', new ArrayList<>()); // Grupo de sexo masculino
        gruposPorSexo.put('F', new ArrayList<>()); // Grupo de sexo feminino

        System.out.println("Insira os nomes e sexos (M/F) separados por vírgula:");
        String input = sc.nextLine();

        // Dividindo os nomes usando o método split()
        String[] pessoas = input.split(",");

        // Dividindo os nomes e sexos
        for (String pessoa : pessoas) {
            String[] info = pessoa.split("-");
            String nome = info[0].trim();
            char sexo = info[1].toUpperCase().charAt(0);

            // Adicionando o nome com o hífen e o sexo
            String nomeComSexo = nome + "-" + sexo;

            // Verificando e adicionando ao grupo correto com base no sexo
            if (sexo == 'M' || sexo == 'F') {
                gruposPorSexo.get(sexo).add(nomeComSexo);
            } else {
                System.out.println("Sexo inválido para: " + nome);
            }
        }

        // Exibindo os grupos de pessoas por sexo
        System.out.println("Grupo de pessoas do sexo masculino (M):");
        exibirGrupo(gruposPorSexo.get('M'));

        System.out.println("\nGrupo de pessoas do sexo feminino (F):");
        exibirGrupo(gruposPorSexo.get('F'));
    }

    // Método para exibir os nomes do grupo
    public static void exibirGrupo(ArrayList<String> grupo) {
        for (String pessoa : grupo) {
            System.out.println(pessoa);
        }
    }
}
