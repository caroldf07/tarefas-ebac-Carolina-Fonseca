/**
 * @author carolinafonseca
 * @version 1.0
 * Classe referente a atividade do módulo 11 - Collections do curso da Ebac - Especialista Java
 */
public class Pessoa {

    private String nome;
    private String genero;

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    /**
     * @param nome   Nome da pessoa
     * @param genero Genero da pessoa
     */
    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "{Nome: '" + nome + '\'' +
                ", Gênero:'" + genero + '\'' +
                '}';
    }
}
