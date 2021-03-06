import java.util.*;

/**
 * @author carolinafonseca
 * @version 1.0 Classe referente à atividade do módulo 12 - Coleções parte 02 Array e Map
 */
public class Main {
  public static void main(String[] args) {
    atividade01();
    atividade02();
  }

  /** Atividade 01 é referente a receber uma lista de nomes e printá-los na tela */
  public static void atividade01() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite os nomes separados por vírgula (,) ");
    String nomes = scanner.next();
    scanner.close();

    List<String> listaNomesSemTratamento = List.of(nomes.split(","));
    List<String> listaNomesComTratamento = new ArrayList<>();
    System.out.println("Lista de nomes em ordem alfabética");
    for (String nome : listaNomesSemTratamento) {
      /*
      Tratamento do nome e gênero para que fiquem no padrão de primeiro letra em maiúsculo.
       */
      String primeiraLetra = nome.substring(0, 1).toUpperCase();
      String restoDoNome = nome.substring(1);
      nome = primeiraLetra + restoDoNome;

      listaNomesComTratamento.add(nome);
    }
    listaNomesComTratamento.stream().sorted().forEach(System.out::println);
  }

  /**
   * A atividade 02 é referente a receber uma lista de nome mais gênero, exemplo "Carol-F" e separar
   * o nomes por lista de gênero
   */
  public static void atividade02() {
    Scanner scanner = new Scanner(System.in);
    System.out.print(
        "Digite o nome e gênero de cada pessoa, separando o nome e o gênero pode traço (-) "
            + "e as pessoas por vírgula (,). Exemplo: João-M ");
    String nomesEGeneros = scanner.next();
    scanner.close();

    List<String> listaNomesEGeneros = List.of(nomesEGeneros.split(","));
    System.out.println("Lista de nomes em ordem alfabética");
    List<Map<String, String>> listaFeminino = new ArrayList<>();
    List<Map<String, String>> listaMasculino = new ArrayList<>();

    for (String nome : listaNomesEGeneros) {
      /*
      Tratamento do nome e gênero para que fiquem no padrão de primeiro letra em maiúsculo.
       */
      String[] generoArray = nome.split("-");
      String primeiraLetra = generoArray[0].substring(0, 1).toUpperCase();
      String restoDoNome = generoArray[0].substring(1);
      generoArray[0] = primeiraLetra + restoDoNome;
      generoArray[1] = generoArray[1].toUpperCase();

      Map<String, String> nomeGeneroMap = new HashMap<>();
      nomeGeneroMap.put(generoArray[0], generoArray[1]);

      if (nomeGeneroMap.get(generoArray[0]).equalsIgnoreCase("F")) {
        listaFeminino.add(nomeGeneroMap);
      } else if (nomeGeneroMap.get(generoArray[0]).equalsIgnoreCase("M")) {
        listaMasculino.add(nomeGeneroMap);
      } else {
        System.out.println(
            "Gênero inválido, por favor, tente novamente. Por enquanto, só aceitamos "
                + "(F) Feminino ou (M) Masculino");
      }
    }

    System.out.print("Gênero feminino: " + listaFeminino + "\nGênero masculino: " + listaMasculino);
  }
}
