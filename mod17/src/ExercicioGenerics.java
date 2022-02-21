import java.util.ArrayList;
import java.util.List;

/**
 * @author carolinafonseca on 21/02/2022
 * @project tarefas-ebac-Carolina-Fonseca Exercício do módulo 17 sobre Generics
 */
public class ExercicioGenerics {
  public static void main(String[] args) {
    Audi audi1 =
        AudiBuilder.builder()
            .potencia(10L)
            .cor("verde")
            .quantidadeMaxCombustivel(10L)
            .tipoCombustivel("gasolina")
            .build();
    Audi audi2 =
        AudiBuilder.builder()
            .potencia(20L)
            .cor("azul")
            .quantidadeMaxCombustivel(10L)
            .tipoCombustivel("gasolina")
            .build();

    Tesla tesla1 =
        TeslaBuilder.builder()
            .potencia(30L)
            .cor("preto")
            .quantidadeMaxCombustivel(10L)
            .tipoCombustivel("gasolina")
            .build();
    Tesla tesla2 =
        TeslaBuilder.builder()
            .potencia(40L)
            .cor("vermelho")
            .quantidadeMaxCombustivel(10L)
            .tipoCombustivel("gasolina")
            .build();

    Honda honda1 = HondaBuilder.builder().cor("azul").build();
    Honda honda2 = HondaBuilder.builder().tipoCombustivel("alcool").build();

    List<Carro> listaCarros = new ArrayList<>();
    listaCarros.add(audi1);
    listaCarros.add(audi2);
    listaCarros.add(tesla1);
    listaCarros.add(tesla2);
    listaCarros.add(honda1);
    listaCarros.add(honda2);

    listaCarros.forEach(System.out::println);
  }
}
