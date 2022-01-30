import java.time.LocalDate;

/**
 * @author carolinafonseca
 * @version 1.0
 * <p>
 * Classe responsável por representar a entidade Estudante num sistema escolar
 */
public class Estudante {
    private int numeroMatricula;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    /**
     * @param numeroMatricula Número de matrícula da pessoa
     * @param nome            Primeiro nome da pessoa
     * @param sobrenome       Último nome da pessoa
     * @param dataNascimento  Data de nascimento (ano-mês-dia) da pessoa
     */
    public Estudante(int numeroMatricula, String nome, String sobrenome, LocalDate dataNascimento) {
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "Numero de matricula=" + numeroMatricula +
                ", Nome='" + nome + '\'' +
                ", Sobrenome='" + sobrenome + '\'' +
                ", Data de nascimento=" + dataNascimento;
    }
}
