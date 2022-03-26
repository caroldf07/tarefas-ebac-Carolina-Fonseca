import java.util.*;

/**
 * @author carolina on 18/mar/2022
 * @project tarefas-ebac-Carolina-Fonseca
 * Atividade de filtrar listas do módulo 22 - Streams e Expressões Lambdas // Refatorações por conta do módulo 23
 */
public class Streams {

    /**
     * Ler uma lista de pessoas no console. Exemplo: Nome - genero, Nome - genero,...
     * Criar outra lista somente com as mulheres dessa lista
     * Printar a lista final
     */
    public static void listaDeNomesFemininos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Digite o nome e gênero de cada pessoa, separando o nome e o gênero pode traço (-) "
                        + "e as pessoas por vírgula (,). Exemplo: João-M ");
        String nomesEGeneros = scanner.next();
        scanner.close();

        List<String> listaTratada = tratamentoDeInput(nomesEGeneros);

        listaTratada.stream().filter(pessoa -> pessoa.endsWith("-F")).forEach(System.out::println);
    }

    /**
     * @param nomesEGeneros lista de nomes e gêneros
     * @return Nomes e gêneros tratados de acordo com regras específicas
     */
    private static List<String> tratamentoDeInput(String nomesEGeneros) {
        List<String> listaNomesEGeneros = List.of(nomesEGeneros.split(","));
        List<String> listaTratada = new ArrayList<>();

        for (String nome : listaNomesEGeneros) {
      /*
      Tratamento do nome e gênero para que fiquem no padrão de primeiro letra em maiúsculo.
       */
            String[] generoArray = nome.split("-");

            if (generoArray.length == 1) {
                System.out.println("Faltou a inclusão do gênero de " + generoArray[0]);
                break;

            }
            String primeiraLetra = generoArray[0].substring(0, 1).toUpperCase();
            String restoDoNome = generoArray[0].substring(1);
            generoArray[0] = primeiraLetra + restoDoNome;
            generoArray[1] = generoArray[1].toUpperCase();

            if (!(generoArray[1].equalsIgnoreCase("F") || generoArray[1].equalsIgnoreCase("M"))) {
                System.out.println(
                        "Gênero inválido, por favor, tente novamente. Por enquanto, só aceitamos "
                                + "(F) Feminino ou (M) Masculino");
                break;
            }

            nome = generoArray[0] + "-" + generoArray[1];
            listaTratada.add(nome);

        }
        return listaTratada;
    }

}
