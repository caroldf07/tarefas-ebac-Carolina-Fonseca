/**
 * @author carolinafonseca
 * @version 1.0 Classe para criação de pessoa jurídica do módulo 13 - * Interfaces/Classe
 *     Abstrata/OO
 */
public class PessoaJuridica extends Pessoa {
  private String cnpj;

  /**
   * @param nome Nome da pessoa
   * @param endereco Endereço da pessoa
   * @param UF UF do endereço da pessoa
   * @param cnpj CNPJ da pessoa jurídica
   */
  public PessoaJuridica(String nome, String endereco, String UF, String cnpj) {
    super(nome, endereco, UF);
    this.cnpj = cnpj;
  }

  @Override
  public String toString() {
    return "nome='"
        + this.getNome()
        + '\''
        + ", endereco='"
        + this.getEndereco()
        + '\''
        + ", UF='"
        + this.getUF()
        + ", cnpj='"
        + cnpj
        + '\''
        + '}';
  }
}
