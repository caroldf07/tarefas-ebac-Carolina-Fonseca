import java.lang.reflect.*;

/**
 * @author carolinafonseca on 23/02/2022
 * @project tarefas-ebac-Carolina-Fonseca Criação de annotation referente ao módulo 20 - Annotations
 * e Reflections
 */

public class Main {
    @Tabela(nomeTabela = "tabelinha")
    public String nome;


    public static void main(String[] args) {
        /*
         * Monta o objeto com a classe que recebe a annotation
         */
        Class<?> clazz = Main.class;

        {
            try {
                /*
                 * Monta o objeto construtor da classe que possui a annotation
                 */
                Constructor<?> obj = clazz.getConstructor();

            /*
            Instancia um novo objeto da classe refenciada anteriormente, utilizando o construtor montado
             */
                Main main = (Main) obj.newInstance();

            /*
            Puxa os campos criado dentro do objeto instanciado
             */
                Field[] fields = main.getClass().getDeclaredFields();

                for (Field field : fields) {
                    if (field.isAnnotationPresent(Tabela.class)) {
                        String tabelaNome = field.getAnnotation(Tabela.class).nomeTabela();
                        System.out.println(tabelaNome);
                    }
                }
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

}
