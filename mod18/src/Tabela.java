import java.lang.annotation.*;

/**
 * @author carolinafonseca on 23/02/2022
 * @project tarefas-ebac-Carolina-Fonseca Annotation que recebe o nome da tabela
 */
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
public @interface Tabela {
  String nomeTabela() default "Tabela";
}
