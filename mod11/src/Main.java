import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author carolinafonseca
 * @version 1.0 Classe de entrada da atividade do módulo 11 - Collections do curso da Ebac -
 *     Especialista Java
 */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Pessoa> listaPessoasFeminino = new ArrayList<>();
    List<Pessoa> listaPessoasMasculino = new ArrayList<>();

    boolean continuar = true;
    while (continuar) {
      System.out.print("Digite o nome da pessoa: ");
      String nome = scanner.next();
      System.out.print("Digite o genero da pessoa: (F) Feminino (M) Masculino ");
      String genero = scanner.next().toUpperCase();
      Pessoa pessoa = new Pessoa(nome, genero);

      if (genero.equalsIgnoreCase("f")) {
        listaPessoasFeminino.add(pessoa);
      } else if (genero.equalsIgnoreCase("m")) {
        listaPessoasMasculino.add(pessoa);
      } else {
        System.out.print("Genero inválido, por favor tente novamente inserindo F ou M");
      }

      System.out.print("Deseja incluir mais pessoas? (S) Sim (N) Não ");
      String resposta = scanner.next();

      if (resposta.equalsIgnoreCase("n")) {
        continuar = false;
      }
    }
    scanner.close();

    System.out.println("Pessoas do gênero feminino: " + listaPessoasFeminino);
    System.out.println("Pessoas do gênero masculino: " + listaPessoasMasculino);
  }
}
