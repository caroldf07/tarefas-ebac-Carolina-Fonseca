/**
 * @author carolinafonseca
 * @version 1.0 Classe para criação de pessoa física do módulo 13 - * Interfaces/Classe Abstrata/OO
 */
public class PessoaFisica extends Pessoa {
    private String cpf;

    /**
     * @param nome     Nome da pessoa
     * @param endereco Endereço da pessoa
     * @param UF       UF do endereço da pessoa
     * @param cpf      CPF da pessoa física
     */
    public PessoaFisica(String nome, String endereco, String UF, String cpf) {
        super(nome, endereco, UF);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "nome='" + this.getNome() + '\'' + ", endereco='" + this.getEndereco() + '\'' +
                ", UF='" + this.getUF() + ", cpf='" + cpf + '\'' + '}';
    }
}
