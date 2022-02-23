/**
 * @author carolinafonseca on 23/02/2022
 * @project tarefas-ebac-Carolina-Fonseca Criação de annotation referente ao módulo 18 - Annotations
 * e Exceptions
 */

public class Main {
    @Tabela(nomeTabela = "tabelinha")
    static private String nome;

    public static void main(String[] args) {
        System.out.println(nome);

    }
}
