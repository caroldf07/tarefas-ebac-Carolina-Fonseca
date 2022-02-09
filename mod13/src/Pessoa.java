/**
 * @author carolinafonseca
 * @version 1.0 Classe abstrata para a criação de pessoas física e jurísica do módulo 13 -
 * Interfaces/Classe Abstrata/OO
 */
public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String UF;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getUF() {
        return UF;
    }

    /**
     * @param nome     Nome da pessoa
     * @param endereco Endereço da pessoa
     * @param UF       UF do endereço da pessoa
     */
    public Pessoa(String nome, String endereco, String UF) {
        this.nome = nome;
        this.endereco = endereco;
        this.UF = UF;
    }
}
